package process.controller;

import process.model.PlayDohCircle;
import process.model.Rope;
import process.model.Monster;
import java.util.Scanner;

public class ProcessController {
	public ProcessController() {
		
	}
	
	public void start() {
		System.out.println("This is a practice Project.");
		System.out.println("By practicing I develop muscle memory :D");
		System.out.println("This is a testing line.");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look  I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		Rope ropeOne = new Rope(5, "Red");
		Rope ropeTwo = new Rope(27, "Green");
		Rope ropeThree;
		ropeThree = new Rope(300, "Purple");
		
		System.out.println(ropeOne);
		System.out.println(ropeTwo);
		System.out.println(ropeThree);
		
		Monster monster = new Monster();
		Monster newMonster = new Monster("Juble", 2, false, 7, 1, 34);
		System.out.println(monster);
		System.out.println(newMonster);
		
		System.out.println("Create a Monster!");
		
		Scanner nameScanner = new Scanner(System.in);
		System.out.println("What is your monsters name? (String)");
		String name = nameScanner.nextLine();
		
		Scanner legScanner = new Scanner(System.in);
		System.out.println("How many legs does your monster have? (Number)");
		double legs = legScanner.nextDouble();
		
		Scanner bellyScanner = new Scanner(System.in);
		System.out.println("True/False: Your monster has a belly button? (true or false)");
		boolean belly = bellyScanner.nextBoolean();
		
		Scanner nosesScanner = new Scanner(System.in);
		System.out.println("How many noses does your monster have? (Number)");
		int noses = nosesScanner.nextInt();
		
		Scanner eyesScanner = new Scanner(System.in);
		System.out.println("How many eyes does your monster have? (Number)");
		int eyes = eyesScanner.nextInt();
		
		Scanner armsScanner = new Scanner(System.in);
		System.out.println("How many arms does your monster have? (Number)");
		int arms = armsScanner.nextInt();
		
		Monster myMonster = new Monster(name, legs, belly, noses, eyes, arms);
		
		System.out.println(myMonster);
		
	}
}
