package com.budgetBuddy.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan("com.budgetBuddy")
public class RootApplicationContextConfig {
//
//   @Bean
//   public DataSource dataSource() {
//      EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//      EmbeddedDatabase db = builder
//         .setType(EmbeddedDatabaseType.HSQL)
//         .addScript("db/sql/users.sql")
//         
//         .build();
//      return db;
//   }
//  
//   @Bean
//   public NamedParameterJdbcTemplate getJdbcTemplate() {
//      return new NamedParameterJdbcTemplate(dataSource());
//   }
}
