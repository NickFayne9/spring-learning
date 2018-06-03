package com.nick.lesson5.config;

import com.nick.lesson5.importSelector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author NickFayne 2018-06-03 15:59
 */
@Configuration
@Import({MyImportSelector.class})
public class ImportSelectorConfig {

}
