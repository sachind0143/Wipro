package java_Core;
class Account {
	int bal = 10000;
	 synchronized void withdrawal (int amt) {
		if(bal<amt) {
			System.out.println("Insufficient balance");
		}else{
			bal-=amt;
			System.out.println("Successfully withdrawal,"+bal);
			
		}
	}
}
public class BankAc {
public static void main(String[] args) {
	Account a1 = new Account();
	Thread t1 = new Thread(()->{a1.withdrawal(5000);});
	Thread t2 = new Thread(()->{a1.withdrawal(5000);});
	t1.start();
	t2.start();
}
}
