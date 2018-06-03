package com.nick.lesson5.importBeanDefinitionRegistrar;

import com.nick.lesson5.model.Red;
import com.nick.lesson5.model.Yellow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 * @author NickFayne 2018-06-03 15:57
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("red", new RootBeanDefinition(Red.class));
        registry.registerBeanDefinition("yellow", new RootBeanDefinition(Yellow.class));
    }
}
