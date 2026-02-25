package java_Core;

public class AtmSync {
	
		 
		synchronized void withdraw(String Name)
		{
		System.out.println(Name + " is withdrawing money");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
		 
		System.out.println(Name + " Withdrawal completed");
		}
			
		public static void main(String[] args) {
		 
			AtmSync atm=new AtmSync();
			
			new Thread(() -> atm.withdraw("User-1")).start();
			new Thread(() -> atm.withdraw("User-2")).start();
		 
			}
		 
		
}
