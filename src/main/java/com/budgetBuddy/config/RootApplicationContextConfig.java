package com.budgetBuddy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
