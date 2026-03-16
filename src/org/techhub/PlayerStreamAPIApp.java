/*WAP to create List with Player collection and Player contain id, name, run, age, boolean status you have to store 10 player record in list 
and by default every player status is true means active and if player age is greater than 35 then change its status from true to false and 
calculate the sum of all player run and display it and multiply every player run by 3 and display it.
Note: Implement it using Stream API*/

package org.techhub;

import java.util.ArrayList;
import java.util.List;

class Player {
	private int id;
	private String name;
	private int run;
	private int age;
	private boolean status;

	public Player(int id, String name, int run, int age) {
		this.id = id;
		this.name = name;
		this.run = run;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRun() {
		return run;
	}

	public int getAge() {
		return age;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

public class PlayerStreamAPIApp {
	public static void main(String args[]) {
		List<Player> players = new ArrayList<>();
		players.add(new Player(1, "Sachin", 12000, 38));
		players.add(new Player(2, "Virat", 11000, 34));
		players.add(new Player(3, "Dhoni", 10500, 40));
		players.add(new Player(4, "Rohit", 9000, 36));
		players.add(new Player(5, "Rahul", 8000, 32));
		players.add(new Player(6, "Yuvraj",8500, 39));
		players.add(new Player(7, "Pant", 6000, 26));
		players.add(new Player(8, "Hardik", 7000, 30));
		players.add(new Player(9, "Jadeja", 6500, 35));
		players.add(new Player(10,"Ashwin", 7500, 37));

//        1. Change status if age > 35
		players.stream().filter(p -> p.getAge() > 35).forEach(p -> p.setStatus(false));

//        2. Sum of all player runs
		int totalRuns = players.stream().mapToInt(Player::getRun).sum();
		System.out.println("Total Runs=" + totalRuns);

//        3. Multiply each player run by 3 and display
		System.out.println("\nPlayer Runs multiplied by 3:");
		players.stream().forEach(p -> System.out.println(p.getName() + ":" + (p.getRun() * 3)));

//         4. Display player status
		System.out.println("\nPlayer Status:");
		players.forEach(p -> System.out.println(p.getName() + " | Age:" + p.getAge() + " | Active:" + p.isStatus()));

	}

}

