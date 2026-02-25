package core_Java_UseCase;
import java.util.*;
class customer{
	ArrayList<Double> MonthlyIncome = new ArrayList<>();
//	Integer age;
//	Integer cibilScore;
//	String Name;
	Integer age = 23;
	Integer cibilScore = 750;
	String Name = "John";
//	MonthlyIncome.add(25000.0);
//	customer(String name,Integer a,Integer b, Double c){
//		Name = name;
//		age = a;
//		cibilScore = b;
//		MonthlyIncome.add(c);
//	}
	public void eligibility(Double amt){
		MonthlyIncome.add(amt);
		if(age>21&&cibilScore >=550) {
			if(MonthlyIncome.get(0)>(20000.0)) {
				System.out.println(Name+" Is Eligible for the Loan");
			}
		}else 
			System.out.println(Name+" Is not Eligible for the Loan");
		
	}
}
public class BankLoanEligibilitySystem {
	public static void main(String[] args) {
//		customer c1 = new customer("jonh",25, 750, 25000.0);
		customer c1 = new customer();
		c1.eligibility(25000.0);
		
		
		
	}
}
