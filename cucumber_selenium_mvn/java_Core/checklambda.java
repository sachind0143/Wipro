package java_Core;
interface AmountValidator{
	boolean validator(int amount);
}
public class checklambda {
public static void main(String[] args) {
	int amount1=1000;
	AmountValidator check = amount -> amount >1000;
	System.out.println(check.validator(amount1));
}
}
