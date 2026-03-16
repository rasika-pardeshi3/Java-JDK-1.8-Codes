package org.techhub;

import java.util.*;
import java.util.function.Consumer;

public class CounsumerInterface {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.forEach( (Integer t)-> System.out.println(t));

	}

}

