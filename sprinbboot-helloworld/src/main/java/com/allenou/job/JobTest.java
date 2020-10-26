package com.allenou.job;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class JobTest {

    @Scheduled(cron = "${timer.settle.job.cron}")
    public void testJob() {
        System.out.println("111111111111111111111111");
    }
}
