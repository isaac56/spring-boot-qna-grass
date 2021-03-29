package com.codessquad.qna.exceptionHandler;

import com.codessquad.qna.exception.NotAuthorizedException;
import com.codessquad.qna.exception.UserNotFoundInSessionException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class ApiGlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundInSessionException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public String userNotFoundInSessionException(UserNotFoundInSessionException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(NotAuthorizedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public String NotAuthorizedException(NotAuthorizedException ex) {
        return ex.getMessage();
    }
}
