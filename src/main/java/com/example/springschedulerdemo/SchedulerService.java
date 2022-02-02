package com.example.springschedulerdemo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SchedulerService {
    //fixedRate, fixedDelay, cron
    @Scheduled(initialDelay = 1000L, fixedDelay = 2000L)
    public void printTheTimeWithThreeSecondDelay(){
        System.out.println(LocalDateTime.now());
    }

    @Scheduled(initialDelay = 1000L, fixedDelay = 3000L)
    public void printMyName(){
        for(int i = 0; i < 5; i++){
            System.out.println("My Name");
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
