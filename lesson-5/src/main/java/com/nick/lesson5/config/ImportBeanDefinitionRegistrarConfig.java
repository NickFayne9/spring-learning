package com.nick.lesson5.config;

import com.nick.lesson5.importBeanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author NickFayne 2018-06-03 16:08
 */
@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class ImportBeanDefinitionRegistrarConfig {

}
