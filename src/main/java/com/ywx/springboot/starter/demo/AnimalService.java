package com.ywx.springboot.starter.demo;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/7/7 22:37
 * @description：业务实现类
 * @modified By：
 * @version:
 */
public class AnimalService {
    private AnimalProperties animalProperties;

    public AnimalService(AnimalProperties animalProperties) {
        this.animalProperties = animalProperties;
    }

    public void doing() {
        System.out.println("this is com.ywx.springboot.starter.animal service");
        System.out.println("type:" + animalProperties.getType());
        System.out.println("name:" + animalProperties.getName());
    }
}
