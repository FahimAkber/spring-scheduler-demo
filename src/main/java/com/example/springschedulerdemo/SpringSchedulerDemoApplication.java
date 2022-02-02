package com.example.springschedulerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringSchedulerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerDemoApplication.class, args);


    }
//
//    @Scheduled(fixedRate = 3000L)
//    public static  void doSum(){
//        System.out.println(LocalDateTime.now());
//    }

}

@EnableScheduling
@Configuration
class SchedulerConfig{}
