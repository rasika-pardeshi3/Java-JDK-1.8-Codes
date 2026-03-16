//We want to pass radius as parameter to Function interface and calculate its area.

package org.techhub;

import java.util.function.*;

public class FunctionalInterface {
	public static void main(String args[]) {
		Function<Float, Float> f = (Float t) -> t * t * 3.14f;
		float circleArea = f.apply(3.0f);
		System.out.printf("Area of circle is %f\n", circleArea);
	}

}
