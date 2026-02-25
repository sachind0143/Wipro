package java_Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		Map <Integer,String> Employee =new TreeMap<>(Comparator.reverseOrder());
		Employee.put(101, "Johnson");
		Employee.put(102, "Dominc");
		Employee.put(103, "David");
//		Employee.put(null, "Scry");
		System.out.println(Employee);
	}
}
