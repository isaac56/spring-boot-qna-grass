package com.codessquad.qna.exceptionHandler;

import com.codessquad.qna.exception.QuestionNotFoundException;
import com.codessquad.qna.exception.UserIdNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserIdNotFoundException.class)
    public String userIdNotFoundException(UserIdNotFoundException ex) {
        return "/error/404";
    }

    @ExceptionHandler(QuestionNotFoundException.class)
    public String questionNotFoundException(QuestionNotFoundException ex) {
        return "/error/404";
    }
}