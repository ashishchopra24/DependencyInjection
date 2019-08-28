package com.example.dependency;

import com.example.dependency.controllers.ConstructorInjectedController;
import com.example.dependency.controllers.MyController;
import com.example.dependency.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class DependencyApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(DependencyApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());

    }

}
