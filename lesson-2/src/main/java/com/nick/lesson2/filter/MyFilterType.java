package com.nick.lesson2.filter;


import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author NickFayne 2018-06-01 16:54
 */
public class MyFilterType implements TypeFilter {

    /**
     *
     * @param metadataReader 目标类的元信息
     * @param metadataReaderFactory 可以拿到除目标类之外的类的元信息
     * @return true 加入 IOC 中; false 不加入 IOC 中
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        if(metadataReader.getAnnotationMetadata().hasAnnotation("org.springframework.stereotype.Controller")){
            return true;
        }else{
            return false;
        }
    }
}
