package myThread;

public class Hallo1 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println("Thread.....Hallo1");
		}
	}
	
}
