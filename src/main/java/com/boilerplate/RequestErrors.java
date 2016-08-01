package com.boilerplate;

/**
 * Created by ratikesh on 22/7/16.
 */

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratikesh on 22/7/16.
 */
public class RequestErrors implements CustomError{

    @JsonInclude(JsonInclude.Include.NON_EMPTY)

    private List<String> errors = new ArrayList<>();

    private final String errorMessage;

    public RequestErrors(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void addValidationError(String error) {
        errors.add(error);
    }
    @Override
    public String getMessage() {
        return errorMessage;
    }

    @Override
    public List getErrors() {
        return errors;
    }
}

