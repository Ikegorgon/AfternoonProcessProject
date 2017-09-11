package process.controller;

import process.model.PlayDohCircle;
import process.model.Rope;

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
		
		PlayDohCircle thirdCircle = new PlayDohCircle(1);
		System.out.println(thirdCircle);
		
		Rope ropeOne = new Rope(5, "Red");
		Rope ropeTwo = new Rope(27, "Green");
		Rope ropeThree;
		ropeThree = new Rope(300, "Purple");
		
		System.out.println(ropeOne);
		System.out.println(ropeTwo);
		System.out.println(ropeThree);
	}
}
