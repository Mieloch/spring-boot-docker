package com.echomil.test.folder.controller;

import com.echomil.test.folder.db.Record;
import com.echomil.test.folder.db.RecordRepository;
import com.echomil.test.folder.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class Controller {

  @Autowired
  private RecordRepository recordRepository;


  @RequestMapping(path = "hello")
  public String helloDocker() {
    return "HELLO WORLD";
  }

  @RequestMapping(path = "db")
  public Iterable<Record> db() {
    return recordRepository.findAll();
  }

  @RequestMapping(path = "post", method = RequestMethod.POST)
  public ResponseEntity<?> save( @RequestBody Person person) throws MethodArgumentNotValidException {
    person = test(person);
    return new ResponseEntity<Object>(person, HttpStatus.OK);
  }

  private Person test(@Validated Person person)throws MethodArgumentNotValidException {
    return person;
  }


}
