package com.nick.lesson5;

import com.nick.lesson5.config.ImportBeanDefinitionRegistrarConfig;
import com.nick.lesson5.config.ImportConfig;
import com.nick.lesson5.config.ImportSelectorConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Import 注解测试类
 * @author NickFayne 2018-06-03 15:49
 */
public class ImportTest {

    @Test
    public void testImport(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);

        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }

    @Test
    public void testImportSelector(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportSelectorConfig.class);

        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }

    @Test
    public void testImportBeanDefinitionRegistrar(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportBeanDefinitionRegistrarConfig.class);

        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
