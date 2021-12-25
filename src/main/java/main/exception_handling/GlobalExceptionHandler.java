package main.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException exception) {
        EmployeeIncorrectData employeeIncorrectData = EmployeeIncorrectData.builder()
                .info(exception.getMessage())
                .build();

        return new ResponseEntity<>(employeeIncorrectData, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception exception) {
        EmployeeIncorrectData employeeIncorrectData = EmployeeIncorrectData.builder()
                .info(exception.getMessage())
                .build();

        return new ResponseEntity<>(employeeIncorrectData, HttpStatus.NOT_FOUND);
    }
}
