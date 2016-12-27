package com.echomil.test.folder;

import com.echomil.test.folder.controller.ControllerTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Start {

  public static void main(String[] args) {
    Result run = JUnitCore.runClasses(ControllerTest.class);
    boolean allOK = run.wasSuccessful();
    if (allOK) {
      System.exit(0);
    } else {
      System.exit(1);
    }

  }
}