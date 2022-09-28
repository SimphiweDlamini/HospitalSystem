package com.demo;

import com.demo.gui.controller.MainWindowController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class FinalImplementationApplication {

    public static void main(String[] args) {

        //SpringApplication.run(FinalImplementationApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(FinalImplementationApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);

        SwingUtilities.invokeLater( () ->{
            context.getBean(MainWindowController.class)
                    .showGUI();
        });
    }

}
