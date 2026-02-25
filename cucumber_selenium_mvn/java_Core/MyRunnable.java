package java_Core;

public class MyRunnable implements Runnable{
	public void run() {
		System.out.println("running");
	}
	public static void main(String args[]) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
