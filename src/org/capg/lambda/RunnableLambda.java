package org.capg.lambda;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++){
					System.out.println(
							"Hello word from thread [" +
					         Thread.currentThread().getName()+
					         "]");
				}
				
			}
		};
		Thread t=new Thread(runnable);
		t.start();
		t.join();
		
		System.out.println("========Using Java 8 Lambda Expression====================");
		
		Runnable runnableLabda =()->{
			for(int i=0;i<3;i++){
				System.out.println(
						"Hello word from thread [" +
				         Thread.currentThread().getName()+
				         "]");
			}
			
		};
		
		Thread thread=new Thread(runnableLabda);
		thread.start();
		thread.join();
		
	}

}
