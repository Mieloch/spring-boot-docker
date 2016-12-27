package com.echomil.test.folder.validation;

import com.echomil.test.folder.model.Person;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PawelWhen22Valdiator.class)
public @interface PawelWhenAge {

  String message() default "jezeli pawel to musi miec 22 lata";

  Class<?>[] groups() default {};

  int value();

  Class<? extends Payload>[] payload() default {};

}
