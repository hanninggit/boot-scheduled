package com.example.bootscheduled.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledDemo {
    @Scheduled(cron="59 18 16 * * ?")
    public void scheduledMethod(){
        System.out.println("定时器被触发"+new Date());
    }
}
