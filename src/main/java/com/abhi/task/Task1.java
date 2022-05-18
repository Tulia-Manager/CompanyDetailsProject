package com.abhi.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//@Service("task")
public class Task1 {
	
	//@Scheduled(initialDelay = 2000,fixedDelay = 4000)
    //  @Scheduled(fixedDelayString = "3000")	
	//@Scheduled(fixedDelay = 3000)
    //@Scheduled(fixedRate = 10000)
	//@Scheduled(fixedDelay = 3000,initialDelay = 2000,fixedRate = 5000) :: If we apply 3 at a time it gives IllegalThreadExceptions.
   // @Scheduled(fixedRateString = "10000")
	public void reportGenerator() {
	   System.out.println("Generation Time"+new Date());	
	   
	   try {
		   Thread.sleep(5000);
	   }//try
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   
	   System.out.println("==End Operations ::"+new Date());
	}
}
