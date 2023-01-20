package org.example.demo.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAfterAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("@annotation(LogResult)")
    public void pointCutOnExecution() {}

    @AfterReturning(value = "pointCutOnExecution()", returning = "valRet")
    public void afterReturn(JoinPoint jp, Object valRet) {
        logger.info("Returning value {}", valRet);
    }
}
