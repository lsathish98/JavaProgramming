package org.programming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(0);
		System.out.println(a);
		
		LinkedList<Integer> b=new LinkedList<>();
		b.add(1);
		b.add(0);
		b.add(1);
		System.out.println(b.add(0));
	}

}
