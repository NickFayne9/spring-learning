package com.nick.lesson5.config;

import com.nick.lesson5.model.Red;
import com.nick.lesson5.model.Yellow;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Spring 配置类
 * @author NickFayne 2018-06-03 15:53
 */
@Configuration
@Import({Red.class, Yellow.class})
public class ImportConfig {

}
