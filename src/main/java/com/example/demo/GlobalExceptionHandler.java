//package com.example.demo;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    /**
//     * Provides handling for exceptions throughout this service.
//     * @return
//     */
//    @ExceptionHandler({EmployeeNotFoundException.class})
//    public final <ApiError> Object handleException(Exception ex, WebRequest request) {
//        HttpHeaders headers = new HttpHeaders();
//
//        (ex instanceof EmployeeNotFoundException)
//        {
//            HttpStatus status = HttpStatus.NOT_FOUND;
//            EmployeeNotFoundException unfe = ((EmployeeNotFoundException) ex);
//        }
//            ((EmployeeNotFoundException) ex);
//            return handleEmployeeNotFoundException(unfe, headers, status, request);
//        } else if (ex instanceof ContentNotAllowedException) {
//            HttpStatus status = HttpStatus.BAD_REQUEST;
////            ContentNotAllowedException cnae = (ContentNotAllowedException) ex;
//
////            return handleContentNotAllowedException(cnae, headers, status, request);
//
///*
//        else {
//            HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
////            return handleExceptionInternal(ex, null, headers, status, request);
//        }
//    }
//    private <ApiError> void handleExceptionInternal(Exception ex, Object o, HttpHeaders headers, HttpStatus status, WebRequest request) {
//    }
//    private <ApiError> Object handleEmployeeNotFoundException(EmployeeNotFoundException unfe, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return null;
//    }
//    private ResponseEntity<ApiError> handleContentNotAllowedException(ContentNotAllowedException cnae, HttpHeaders headers, HttpStatus status, WebRequest request) {
//    }
//}
