package org.example.demo;

import org.example.demo.app.config.AppConfig;
import org.example.demo.core.SampleBusinessLogic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.getBean(SampleBusinessLogic.class).add(1, 3);
    }
}
