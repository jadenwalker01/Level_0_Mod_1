package variables_and_conditionals;

import javax.swing.JOptionPane;

public class riddler {
	

public static void main(String[] args) {

	int score = 0;	
	String riddle = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
	
	if(riddle.equalsIgnoreCase("nothing"))
	{
		JOptionPane.showMessageDialog(null, "correct");
		score = score +1;
	}
	else
	{
		JOptionPane.showMessageDialog(null, "wrong the correct answer is nothing");
	}
riddle = JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
		"Who buys it, has no use for it. \n" + 
		"Who uses it can neither see nor feel it. \n" + 
		"What is it?");
	
	if(riddle.equalsIgnoreCase("a coffin"))
	{
		JOptionPane.showMessageDialog(null, "correct");
		score = score +1;
	}
	else
	{
		JOptionPane.showMessageDialog(null, "wrong the correct answer is a coffin");
	}
	riddle = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		
		if(riddle.equalsIgnoreCase("a coin"))
		{
			JOptionPane.showMessageDialog(null, "correct");
			score = score +1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "wrong the correct answer is a coin");
		}
		JOptionPane.showMessageDialog(null, "your score is " + score);
}
}