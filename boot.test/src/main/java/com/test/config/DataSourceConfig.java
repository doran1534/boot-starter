package com.test.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


public class DataSourceConfig {
	
}
//@Configuration
//@MapperScan(basePackages="com.test.web.**.mapper",
//			sqlSessionFactoryRef = "sqlSessionFactory",
//			sqlSessionTemplateRef = "sqlSessionTemplate")
//public class DataSourceConfig {
//	
//	@Primary
//	@Bean(name = "datasource")
//	@ConfigurationProperties(prefix = "spring.datasource.hikari")
//	public DataSource datasource() {
//		return DataSourceBuilder.create().build();
//	}
//	
//	@Primary
//	@Bean(name = "sqlSessionFactory")
//	public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource") DataSource datasource) throws Exception {
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(datasource);
//		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("/com/test/web/**/mapper/*.xml"));
//		return (SqlSessionFactory)sqlSessionFactoryBean.getObject();
//	}
//	
//	@Primary
//	@Bean(name = "sqlSessionTemplate")
//	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//}
