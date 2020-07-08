package com.ywx.springboot.starter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/7/7 22:40
 * @description：自动配置类
 * @EnableConfigurationProperties表示启用@ConfigurationProperties注解，
 * 并将带有@ConfigurationProperties注解的Bean注入到容器中，这里将参数类AnimalProperties注入到容器中
 * @ConditionalOnClass(AnimalProperties.class)表示Classpath里有AnimalProperties这个类的时候才执行这个配置文件
 * @ConditionalOnMissingBean(AnimalService.class)表示容器中没有AnimalService这个Bean的时候才注入这个Bean
 *
 * @modified By：
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties(AnimalProperties.class)
@ConditionalOnClass(AnimalProperties.class)
public class AnimalAutoConfiguration {
    @Autowired
    private AnimalProperties animalProperties;

    @Bean
    @ConditionalOnMissingBean(AnimalService.class)
    public AnimalService animalService() {
        return new AnimalService(animalProperties);
    }

    /**
     * 只有满足当BirdEnvironmentCondition.matches 返回true时才实例化BirdService
     */
    @Bean
    @Conditional(BirdEnvironmentCondition.class)
    @ConditionalOnMissingBean(BirdService.class)
    public BirdService birdService() {
        return new BirdService(animalProperties);
    }

}
