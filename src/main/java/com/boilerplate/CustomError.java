package com.boilerplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratikesh on 22/7/16.
 */
public interface CustomError {

    public List<String> errors = new ArrayList<>();
    public final String errorMessage="";
    public String getMessage();
    public List getErrors();
}
