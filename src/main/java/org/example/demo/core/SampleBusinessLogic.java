package org.example.demo.core;

import org.example.demo.app.aspect.LogResult;
import org.springframework.stereotype.Component;

/**
 * testing Aspect Oriented Programing
 */
@Component
public class SampleBusinessLogic {
    @LogResult
    public int add(int a, int b) {
        return a + b;
    }
}
