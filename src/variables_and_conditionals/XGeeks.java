package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
		String June = "writing recipes";
		String Jeffery = "robotics";

        // 2. Ask the user to enter a name. Store their answer in a variable.
	String input = JOptionPane.showInputDialog("enter a name");
		
        // 3. Show the superpower in a pop-up, depending on the name entered.
		
		if(input.equals("june"))
		{
		JOptionPane.showMessageDialog(null, "her super power is "+ June);
		}
		else if(input.equals("jeffery"))
		{
		JOptionPane.showMessageDialog(null, "his superpower is " +Jeffery);
		}

    }
}