package com.boilerplate;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

/**
 * Created by ratikesh on 22/7/16.
 */
public class ErrorBuilder {

    public static RequestErrors fromBindingErrors(Errors errors) {

        RequestErrors error = new RequestErrors("Validation failed. " + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}
