package main.exception_handling;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EmployeeIncorrectData {
    String info;
}
