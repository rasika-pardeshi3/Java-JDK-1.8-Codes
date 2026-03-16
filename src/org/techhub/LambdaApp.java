//Suppose we have functional interface name as Square and with one method int getSquare(int) this function can accept  number as parameter and return its square.

package org.techhub;

interface Square
{
	int getSquare(int no);
}
public class LambdaApp {

	public static void main(String[] args) {
		Square s1= (int no)->no*no;
		int result= s1.getSquare(5);
		System.out.println("Square is "+result);
		
	}

}


