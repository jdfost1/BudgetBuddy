package com.budgetBuddy.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="com.budgetBuddy")
@PropertySource("classpath:persistence-mysql.properties")
public class AppConfig implements WebMvcConfigurer {
	
	private static final String VIEW_PREFIX = "/WEB-INF/view/";
	private static final String VIEW_SUFFIX = ".jsp";
	
	@Autowired
	private Environment env;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Bean
	public ViewResolver viewResolver() {
		return new InternalResourceViewResolver(VIEW_PREFIX, VIEW_SUFFIX);
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("messages");
		return source;
	}
	
	@Bean
	public DataSource dataSource() {
		// Create connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
		
		// Set the jdbc driver class
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		
		// Log the connection properties
		logger.info(">>> jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info(">>> jdbc.user=" + env.getProperty("jdbc.user"));
		
		// Set the database connection properties
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		
		// Set connection pool properties
		securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		securityDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		securityDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
		securityDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
		
		return securityDataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}
	
	@Bean
	public PlatformTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	
	@Bean
	public JavaMailSender javaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(env.getProperty("mail.host"));
		mailSender.setPort(getIntProperty("mail.port"));
		
		mailSender.setUsername(env.getProperty("mail.username"));
		mailSender.setPassword(env.getProperty("mail.password"));
		
		Properties properties = mailSender.getJavaMailProperties();
		properties.put("mail.transport.protocol", env.getProperty("mail.transport.protocol"));
		properties.put("mail.smtp.auth", env.getProperty("mail.smtp.auth"));
		properties.put("mail.smtp.starttls.enable", env.getProperty("mail.smtp.starttls.enable"));
		properties.put("mail.debug", env.getProperty("mail.debug"));
		
		return mailSender;
	}
	/*
	@Bean
	public HandlerExceptionResolver handlerExceptionResolver() {
		HandlerExceptionResolver resolver = new HandlerExceptionResolver() {
			
			@Override
			public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
					Exception ex) {
				ModelAndView mav = new ModelAndView("not-found");
				mav.addObject("error", ex);
				return mav;
			}
		};
		return resolver;
	}
	*/
	private final Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		return hibernateProperties;
	}
	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	private int getIntProperty(String propertyName) {
		return Integer.parseInt(env.getProperty(propertyName));
	}
}
