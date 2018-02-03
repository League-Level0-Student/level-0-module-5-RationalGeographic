import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
//String we = JOptionPane.showInputDialog(null, "how many dimes do ye have?");
//int er = Integer.parseInt(we);


// Tell them how many cents they have (hint multiply by 10)

//JOptionPane.showInputDialog("you have " + er*10 + "cents");


// Ask the user how tall they are (inches)

//String qw = JOptionPane.showInputDialog("how tall are you in inches");

//int wty = Integer.parseInt(qw);
//if(wty<36) {
//	System.out.println("eat ye wheaties matie!");
//}
// If they are shorter than 36 inches, tell them to eat their Wheaties




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

//for (int i = 0; i < 31; i++) {
//	if(i%3==0) {
//		System.out.println(i);
//	}
//}





}

void skill3() { // Get a random number that is less than 20 and print it to the console 

//Random random = new Random();


//System.out.println(random.nextInt(21));

// Get another random number that is less than 10 and print it to the console 
//Random rand = new Random();


//System.out.println(rand.nextInt(10));

//int yu = random.nextInt(21);
//int ui = rand.nextInt(10);
// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
//JOptionPane.showInputDialog(yu-ui);
//System.out.println(yu);System.out.println(ui);

}

void skill4() { // In a pop-up, ask the user for the city they live in 

JOptionPane.showInputDialog("where do you live?");

// If they answered "San Diego", tell them they live in Americ's Finest City 



// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



}
}