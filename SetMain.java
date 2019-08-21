package assignment_2;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<Integer> one = new HashSet<Integer>();
		
		one.add(3);
		one.add(6);
		one.add(9);
		
		System.out.println(one.toString());
		
		Set<Integer> two = new HashSet<Integer>();
		
		two.add(2);
		two.add(4);
		two.add(6);
		
		System.out.println(two.toString());
		
		one.addAll(two);
		
		System.out.println(one.toString());
	}
}
