package com.zpark.neimin.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling   //启动定时器
@SpringBootApplication
@MapperScan("com.zpark.neimin.first.dao")
@Component
public class NeiminApplication {

    public static void main(String[] args) {

        SpringApplication.run(NeiminApplication.class, args);
    }

    @Scheduled(cron = "0/1 * * * * *")
    public void prt() {
        System.out.println("........schedule.....");
    }

}





