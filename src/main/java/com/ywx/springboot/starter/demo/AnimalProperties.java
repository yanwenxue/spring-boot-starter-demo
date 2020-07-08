package com.ywx.springboot.starter.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/7/7 22:33
 * @description：参数类
 * @modified By：
 * @version:
 */
@ConfigurationProperties(prefix = "animal")
@Data
public class AnimalProperties {
    private String type = "animal";

    private String name;

    private final Fish fish = new Fish();

    private final bird bird = new bird();

    @Data
    public static class Fish {
        private String doing;
    }

    @Data
    public static class bird {
        private String doing;
    }
}
