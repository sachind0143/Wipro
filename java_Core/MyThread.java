package java_Core;

public class MyThread extends Thread{
//	public void run() {
//		System.out.println("Thread is running");
//	}
//	public void suspend() {
//		System.out.println("Thread is suspended");
//	}
public static void main(String args[]) {
	MyThread t = new MyThread();
	t.start();
}
}
