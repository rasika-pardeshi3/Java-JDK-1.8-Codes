//We want take System date using a Supplier interface.

package org.techhub;

import java.util.function.*;
import java.util.*;

public class TestSupplierApp {

	public static void main(String args[]) {
		Supplier<Date> s = ()-> new Date();
		Date d1 = s.get();
		System.out.println("Today Date is " + d1);
	}

}
