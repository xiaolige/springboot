package com.luna.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author li
 * @date 2019-01-10-22:05
 */
@Configuration
public class MyCacheConfig {
    @Bean()
    public KeyGenerator  keyGenerator(){
        return  new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... params) {
                return method.getName()+'['+ Arrays.asList(params).toString()+']';
            }
        };
    }
}
