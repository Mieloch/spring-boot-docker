package com.echomil.test.folder.model;

import com.echomil.test.folder.validation.PawelWhenAge;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Data
@PawelWhenAge(value = 22)
public class Person {

  @NotEmpty(message = "Imie nie moze byc puste")
  private String name;


  @Range(max = 60, message = "wiek ponizej 60")
  private Integer age;
}
