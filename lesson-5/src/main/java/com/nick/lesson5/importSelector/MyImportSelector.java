package com.nick.lesson5.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 * @author NickFayne 2018-06-03 15:57
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.nick.lesson5.model.Red", "com.nick.lesson5.model.Yellow"};
    }
}