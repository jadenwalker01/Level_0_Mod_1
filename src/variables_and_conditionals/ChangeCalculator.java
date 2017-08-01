package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
    	String nickles = JOptionPane.showInputDialog("how many nickels you have");
        // Convert their answer to an int using Integer.parseInt()
    	int money1 = Integer.parseInt(nickles);
        // Ask the user how many dimes they have, and convert their answer
    	String dimes = JOptionPane.showInputDialog("how many dimes you have");
    	int money2 = Integer.parseInt(dimes);
        // Ask the user how many quarters they have, and convert their answer
    	String quarters = JOptionPane.showInputDialog("how many quarters you have");
    	int money3 = Integer.parseInt(quarters);
        // Calculate how much money the user has and save it in a double variable 
    	double money = money1 * 0.05 + money2 * 0.10 + money3 * 0.25;
    	
        // Tell the user how much money they have
    	JOptionPane.showMessageDialog(null, "you have $"+ money);
    }
}