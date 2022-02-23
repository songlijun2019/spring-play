package com.slj.springplaymvn.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


/**
 * @author summer
 * @date 2022/1/17 11:41
 */
@Slf4j
@org.springframework.context.annotation.Configuration
public class DataSourceConfig {

    /**
     * 主数据源配置
     *
     * @return
     */
    @Primary
    @Bean(name = "dataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 主数据源
     * 创建数据库的时候使用下面这句SQL
     * 使得整个数据库所有表都使用utf8mb4字符集
     * create database xxx CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci
     */
    @Primary
    @Bean(name = "dataSource")
    public HikariDataSource dataSource(@Qualifier("dataSourceProperties") DataSourceProperties properties) {
        String url = properties.getUrl();
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setPassword(properties.getPassword());
        hikariConfig.setUsername(properties.getUsername());
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setMinimumIdle(1);
        hikariConfig.setMaximumPoolSize(32);
        hikariConfig.setIdleTimeout(300000);
        hikariConfig.setDriverClassName(properties.getDriverClassName());
        hikariConfig.setConnectionInitSql("SET NAMES utf8mb4 COLLATE utf8mb4_unicode_ci");
        hikariConfig.setPoolName("HikariConfig");
        return new HikariDataSource(hikariConfig);}


}
