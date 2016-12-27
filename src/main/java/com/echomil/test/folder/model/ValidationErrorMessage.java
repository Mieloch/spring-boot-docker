package com.echomil.test.folder.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ValidationErrorMessage {

  private String object;
  private String message;
}
