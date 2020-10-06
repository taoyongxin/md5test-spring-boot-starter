package com.soft1851.auto;

import com.soft1851.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tao
 * @version 1.0
 * @ClassName MD5AutoConfiguration
 * @Description TODO
 * @date 2020-10-06 18:41
 **/
@Configuration
public class MD5AutoConfiguration {

    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}