package com.lynas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Value("${sample.value}")
    private String prop;
    public void printDemo() {
        System.out.println(prop);
    }
}
