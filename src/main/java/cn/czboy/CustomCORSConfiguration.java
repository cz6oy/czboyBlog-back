package cn.czboy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Springboot解决前后端跨域问题
 */

@Configuration
public class CustomCORSConfiguration {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");// 1允许任何域名使用
        corsConfiguration.addAllowedHeader("*");// 2允许任何头
        corsConfiguration.addAllowedMethod("*");// 3允许任何方法（post、get等）
        corsConfiguration.setAllowCredentials(true);

//        corsConfiguration.setMaxAge(1800L);// 4.解决跨域请求两次，预检请求的有效期，单位为秒
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}