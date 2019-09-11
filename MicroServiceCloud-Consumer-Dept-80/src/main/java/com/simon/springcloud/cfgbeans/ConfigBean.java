package com.simon.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: MicroServiceCloud
 * @description: config配置类
 * @author: simon
 * @create: 2019-09-11 09:55
 **/

/**
 * 加上此注解之后，这个类就类似于SpringMVC中的applicationContext.xml
 * 这是springboot的一个特性
 */

/**
 * applicationContext.xml中
 * <bean id="userService" class="com.simon.springcloud.UserService">
 *     等同于
 * 在SpringBoot配置类中配置一个bean
 * @Bean
 *     public UserService getUserService(){
 *         return new UserService();
 *     }
 * SpringBoot不提倡使用xml来配置spring的bean，即不适用applicationContext.xml来配置
 * 而改用ConfigBean来配置
 */
@Configuration
public class ConfigBean {

    @Bean
     public RestTemplate getRestTemplate(){
         return new RestTemplate();
     }
}
