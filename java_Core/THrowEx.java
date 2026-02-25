package java_Core;

public class THrowEx {
	public static void main(String args[]) {
//		int age=15;
//		if(age < 18)
//		{
//			throw new ArithmeticException("Not eligible to vote");
//		}
//			System.out.println("Eligible to vote");	
		try {
			int bal = 2000;
			if(bal<5000) {
				throw new Exception("Insufficient bal");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
			}
}
