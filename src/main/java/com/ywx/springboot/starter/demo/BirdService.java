package com.ywx.springboot.starter.demo;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/7/7 23:00
 * @description：业务类
 * @modified By：
 * @version:
 */
public class BirdService {
    private AnimalProperties animalProperties;

    public BirdService(AnimalProperties animalProperties) {
        this.animalProperties = animalProperties;
    }

    public void doing() {
        System.out.println("this is bird service");
        System.out.println("type:" + animalProperties.getType());
        System.out.println("name:" + animalProperties.getName());
        System.out.println("doing:" + animalProperties.getBird().getDoing());
    }
}
