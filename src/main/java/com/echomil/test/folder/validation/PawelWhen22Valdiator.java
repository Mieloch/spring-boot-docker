package com.echomil.test.folder.validation;

import com.echomil.test.folder.model.Person;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PawelWhen22Valdiator implements ConstraintValidator<PawelWhenAge, Person> {

  private int ageValue;

  @Override
  public void initialize(PawelWhenAge constraintAnnotation) {
    ageValue = constraintAnnotation.value();
  }

  @Override
  public boolean isValid(Person person, ConstraintValidatorContext context) {
    System.out.println("");

    return person.getName().equals("Pawel") && person.getAge() == ageValue;
  }
}
