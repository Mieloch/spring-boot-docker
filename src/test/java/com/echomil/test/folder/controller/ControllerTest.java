package com.echomil.test.folder.controller;

import com.echomil.test.folder.DemoDockerApplication;
import com.echomil.test.folder.db.RecordRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DemoDockerApplication.class)
public class ControllerTest {
  @Autowired
  private RecordRepository recordRepository;

  @Test
  public void test() {
    System.out.println("TEST");
  }
}