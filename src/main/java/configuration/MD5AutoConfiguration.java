package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.MD5Service;

/**
 * @author Tao
 * @version 1.0
 * @ClassName MD5AutoConfiguration
 * @Description TODO
 * @date 2020-10-06 18:11
 **/
@Configuration
public class MD5AutoConfiguration {
    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}
