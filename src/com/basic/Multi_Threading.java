package com.basic;

/*
 *--//----Multi-Threading can be performed by two ways ---//

 *  1. using Thread class of Runnable Interface.
 *  
 *  2. or directly using Runnable Interface 
 *     ( mostly used approach coz, we can implements multiple class using Runnable as u know multiple-inheritance in java).
 *  
 *     but, in direct use of Runnable interface u have compulsory to create object of 
 *       Thread class to execute the program, otherwise it will throw error -> "start() method not defind".
 *       
 *       Rest process same for both mean implementation of run() method
 
 */

/* Q : Overloading of thread class run() method possible? or not, if yes then how? 
 * 
 *  -->  Overloading of run() method is possible :     -( plz.. ref : gfg for example)
 *      	But Thread class start() method can invoke no-argument method.
 *  	  	The other overloaded method we have to call explicitly like a normal method call.
 * */


 /* 	-- Methods use in Multi-threading -- 
  * 
  *   .run() --> executing thread in current main class directly.
  *   .start() --> create new thread for each execution.
  *   .join() --> we can stop program after completing perticular thread execution then join() method will help .
  *   .isAlive() --> return boolean true/false for telling thread is currently running or dead.
  *   
  * */

public class Multi_Threading extends Thread {
	
	//for checking threadNumber.
	private int threadNumber;
	
	public  Multi_Threading(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 6; i++) {
			System.out.println(i+" from thread "+threadNumber);
			
			
			//can throw exception at threadNumber 4 rest will execute independently.
			if(threadNumber == 4) {
				throw new RuntimeException(); 
			}
			
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {

			}
		}
	}
}
