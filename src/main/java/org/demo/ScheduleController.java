package org.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Scheduled(cron = "0/5 * * * * *")
    public void job1() {
        test("job1");
        System.out.println();
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void job2() {
        test("job2");
        System.out.println();
    }


    @Scheduled(cron = "0/5 * * * * *")
    public void job3() {
        test("job3");
        System.out.println();

    }

    @Scheduled(cron = "0/5 * * * * *")
    public void job4() {
        test("job4");
        System.out.println();
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void job5() {
        test("job5");
        System.out.println();
    }

    @RequestMapping("/test")
//    @Transactional
    public String test(String jobname) {
        // acquire lock
        int update = jdbcTemplate.update("update lock_def set lock_status='locked' where id='1000000000' and lock_status='unlocked'");

        // unlock before exit
        if (update > 0) {
            System.out.println(jobname+"=======acquired lock======");
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(jobname+"=======do my job======");
            jdbcTemplate.update("update lock_def set lock_status='unlocked' where id='1000000000' and lock_status='locked'");
            System.out.println(jobname+"reset to unlock status");
        } else {
            System.out.println(jobname+"=========not acquire lock==========");
        }
        return "test";
    }
}
