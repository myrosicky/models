package org.business;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
public class InitModelsToDB {

	private static Logger log = LoggerFactory.getLogger(InitModelsToDB.class);
	
	@Value("${custom.datasource.driverClassName}")
	private String driverClassName;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddlAuto;

	@Value("${spring.jpa.hibernate.dialect}")
	private String dialect;
	
	@Value("${spring.jpa.hibernate.packages-to-scan}")
	private String packagesToScan;
	
	

	@Bean
	public DataSource dataSource() {
		log.debug("DataSource init start");
		
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(driverClassName);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		
		log.debug("DataSource init end");
		return basicDataSource;
	}
	
	@Bean
	HibernateJpaVendorAdapter hibernateJpaVendorAdapter(){
		log.debug("hibernateJpaVendorAdapter init start");
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setGenerateDdl(true);
		hibernateJpaVendorAdapter.setShowSql(true);
		log.debug("hibernateJpaVendorAdapter init end");
		return hibernateJpaVendorAdapter;
	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		log.debug("entityManagerFactory init start");
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan(packagesToScan);
		emf.setJpaVendorAdapter(hibernateJpaVendorAdapter());

		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", ddlAuto);
		properties.setProperty("hibernate.dialect", dialect);
		

		emf.setJpaProperties(properties);
		emf.afterPropertiesSet();
		log.debug("entityManagerFactory init end");
		return emf.getObject();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		log.debug("transactionManager init start");
		
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		log.debug("transactionManager init end");
		return txManager;
	}

	@Bean
	public HibernateExceptionTranslator hibernateExceptionTranslator() {
		return new HibernateExceptionTranslator();
	}
	
	public static void main(String[] args){
		SpringApplication.run(InitModelsToDB.class, args);
	}
}
