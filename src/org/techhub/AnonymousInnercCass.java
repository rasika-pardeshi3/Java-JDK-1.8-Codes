package org.techhub;

interface ABC {
	void show();

}

public class AnonymousInnercCass {

	public static void main(String[] args) {
		ABC a1 = new ABC() {

			@Override
			public void show() {
				System.out.println("I am show method");

			}
		};
		a1.show();

	}
}
