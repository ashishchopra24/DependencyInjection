package com.example.dependency;

import com.example.dependency.controllers.ConstructorInjectedController;
import com.example.dependency.controllers.MyController;
import com.example.dependency.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(DependencyApplication.class, args);


        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
