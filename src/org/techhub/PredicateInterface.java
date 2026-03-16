//We want to create program to check number is Even or Odd using Predicate interface.

package org.techhub;

import java.util.*;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = (Integer t)-> t % 2 == 0;
		System.out.println((p.test(10))?"Number is Even":"Number is Odd");

	}

}
