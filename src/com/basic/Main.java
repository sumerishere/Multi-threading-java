package com.basic;

public class Main {
	
	public static void main(String[] args) {
		
//		Multi_Threading m = new Multi_Threading();
//		Multi_Threading m2 = new Multi_Threading();
//		Multi_Threading m3 = new Multi_Threading();

		
		//---- using run() method one by one execution perform.
		
//		m.run();   //first this will start to execute
//		m2.run();  //after m completed then start m2, m3...n .
//		m3.run();
		
		
		//----using start() method both will start to executing parallely.
		
//		m.start(); 
//		m2.start();
//		m3.start();
		
		
		// can run multiple thread using loop as well without creating multiple times object.
		// can check thread number as well.
		
		for(int i  = 1; i<=5; i++) {
			
			Multi_Threading multiple = new Multi_Threading(i);
			
//			Thread thread = new Thread(multiple);  (this is for Runnable interface type)
//			thread.start();
			
			multiple.start();
			
			//so, join() use to wait till for perticular thread execution.
			try {
				multiple.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		throw new RuntimeException(); //even u throw exception in main it does't affect the other threads
		
		
		
	}
	
	
   //------------------------------------------------------------------------------------------------------//
	
		
	/*   imp note :
	 * 
	  1. start(): When you call start(), it performs the necessary initialization and invokes 
	     the run() method in a new thread.
	     
	       - start() :
						- Initializes a new thread.
						- Invokes run() in a new thread.
						- Can only be called once per Thread object. 
						  (u can not write more than one .start() with same name object otherwise throw threadException)
	  
	  
      2. run(): Calling run() directly does not start a new thread. 
         It merely executes the run() method in the current thread.
         
           - run():
					- Contains the code to be executed by the thread.
					- Does not create a new thread when called directly.
					- Can be called multiple times like any other method.
					  (u can write .run() with same object name more than one times, 
					  coz it take onlt current thread, does not create new one )
         
     */
	
}
