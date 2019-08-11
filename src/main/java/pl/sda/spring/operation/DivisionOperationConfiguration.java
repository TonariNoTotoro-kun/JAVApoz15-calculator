package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DivisionOperationConfiguration {
    private String EXCEPTION_MESSAGE = "Nie da sie przez 0! Zabij sie!";

    @Bean
    DivisionOperation divisionOperation(){
        return new DivisionOperation(EXCEPTION_MESSAGE);
    }
}
