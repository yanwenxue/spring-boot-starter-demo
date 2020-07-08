package com.ywx.springboot.starter.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/7/7 23:06
 * @description：条件化配置类
 * @modified By：
 * @version:
 */
public class BirdEnvironmentCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        String[] envs = env.getActiveProfiles();
        for (String e : envs) {
            System.out.println(e);
        }
        return env.containsProperty("animal.bird.doing");
    }
}
