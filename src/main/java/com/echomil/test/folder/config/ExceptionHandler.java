package com.echomil.test.folder.config;

import com.echomil.test.folder.model.ValidationErrorMessage;
import com.echomil.test.folder.model.ValidationErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

@ControllerAdvice
public class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ValidationErrorResponse> handleValidationException(MethodArgumentNotValidException e) {

    List<ObjectError> errors = e.getBindingResult().getAllErrors();
    ValidationErrorResponse validationErrorResponse = new ValidationErrorResponse();
    for (ObjectError error : errors) {
      validationErrorResponse.add(new ValidationErrorMessage(error.getObjectName(), error.getDefaultMessage()));
    }
    return new ResponseEntity<>(validationErrorResponse, HttpStatus.BAD_REQUEST);
  }

}
