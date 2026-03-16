//We want to create List and filter the even number from List.

package org.techhub;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class StreamAPIApp {

	public static void main(String[] args) {
		List<Integer>list=List.of(10,20,30,40,70,9,4,6);
		Stream<Integer>stream=list.stream();
		Predicate<Integer>p=(Integer t)->t%2==0;
		Stream<Integer>stream1=stream.filter(p);
		List<Integer>List1=stream1.collect(Collectors.toList());
		List1.forEach((val)->System.out.println(val));
	}
}



	