//Create ArrayList and store 5 values in it and calculate the sum of  all values.

package org.techhub;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class ReduceWithStreamApp {
	public static void main(String agrs[]) {
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		Stream<Integer> stream = list.stream();
		int result = stream.reduce(0,(Integer t, Integer u)->t + u);
		System.out.println("Sum of all values is = " + result);

	}
}
