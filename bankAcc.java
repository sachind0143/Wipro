package PracticeUseCase;

public class bankAcc {
	private int balance=1000;
	public void deposit(int amt) {
		balance = balance + amt;
		System.out.println("Deposited Successfully, Your balance is: "+balance);
	}
	public void withdrawal(int withAmt) {
		if(balance >withAmt) {
			
			balance = balance - withAmt;
			System.out.println("Successfully withdrawal , your current balance is "+balance);
			
		}
		else {
			System.out.println("Insufficient balance"+balance);
			
		}
	}
	public static void main(String[] args) {
		bankAcc Acholder = new bankAcc();
		Acholder.deposit(1000);
		Acholder.withdrawal(1000);
		
	}
}
