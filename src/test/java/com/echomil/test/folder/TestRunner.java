package com.echomil.test.folder;

import com.echomil.test.folder.controller.ControllerTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Component
public class TestRunner {

  public boolean run() {
    Result run = JUnitCore.runClasses(ControllerTest.class);
    return run.wasSuccessful();
  }
}
