package com.abhi.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("task2")
public class Task2_CronExpressionTest_java {
	
	//@Scheduled(cron = "5 * * * * *")
	//@Scheduled(cron = "55 2 * * * *")
	@Scheduled(cron = "* * 12 14 Aug *")//Independence Day
	@Scheduled(cron = "* * 12 25 Jan *")//Republic Day
	public void reportGenerator() {
	   System.out.println("Generation Time"+new Date());	
	   
	   System.out.println("==End Operations ::"+new Date());
	}
}
