package com.echomil.test.folder.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ValidationErrorResponse {
  private List<ValidationErrorMessage> validationErrors;

  public void add(ValidationErrorMessage errorMessage) {
    if (validationErrors == null) {
      validationErrors = new ArrayList<>();
    }
    validationErrors.add(errorMessage);
  }

}
