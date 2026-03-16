//We want to create List and store  5 values in it and multiply every value of list by 2 and store in stream.

package org.techhub;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class MapWithStreamApp {
	public static void main(String args[]) {
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		Stream<Integer> stream = list.stream();
		Function<Integer, Integer> f = (Integer t)->t * 2;
		Stream<Integer> stream1 = stream.map(f);
		List<Integer> resultList = stream1.collect(Collectors.toList());
		resultList.forEach((val) -> System.out.println(val));
	}

}
