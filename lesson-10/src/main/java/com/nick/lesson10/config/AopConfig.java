package com.nick.lesson10.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP 配置类
 * @author NickFayne 2018-06-07 20:49
 */
@Configuration
@ComponentScan({"com.nick.lesson10.model", "com.nick.lesson10.aspects"})
@EnableAspectJAutoProxy
public class AopConfig {

}