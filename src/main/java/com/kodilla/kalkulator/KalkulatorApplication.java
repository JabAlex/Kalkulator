package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(5, 9));
        System.out.println(calculator.subtraction(6, 23));

    }

}
