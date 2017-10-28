package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Test_scorer 
{
	public static void main(String[] args) {
		
			
		
		String test = JOptionPane.showInputDialog("enter test score (ex:95)");
		
		float score = Float.parseFloat(test);
		
		if(!test.equals(""))
		{
			JOptionPane.showMessageDialog(null,"whoops type a number");
		}
		
		
		
		if(score>105)
		{
			JOptionPane.showMessageDialog(null, "Cheater");
		}
		else if(score>96 && score<106)
		{
			JOptionPane.showMessageDialog(null,"you got an A+");
		}
		else if(score>93)
		{
			JOptionPane.showMessageDialog(null,"you got an A");
		}
		else if(score>89)
		{
			JOptionPane.showMessageDialog(null,"you got an A-");
		}
		else if(score>86)
		{
			JOptionPane.showMessageDialog(null,"you got an B+");
		}
		else if(score>83)
		{
			JOptionPane.showMessageDialog(null,"you got an B");
		}
		else if(score>79)
		{
			JOptionPane.showMessageDialog(null,"you got an B-");
		}
		else if(score>76)
		{
			JOptionPane.showMessageDialog(null,"you got an C+");
		}
		else if(score>73)
		{
			JOptionPane.showMessageDialog(null,"you got an C");
		}
		else if(score>69)
		{
			JOptionPane.showMessageDialog(null,"you got an C-");
		}
		else if(score>66)
		{
			JOptionPane.showMessageDialog(null,"you got an D+");
		}
		else if(score>63)
		{
			JOptionPane.showMessageDialog(null,"you got an D");
		}
		else if(score>59)
		{
			JOptionPane.showMessageDialog(null, "you got an D-");
		}
		else if(score<=59 && score>=0)
		{
			JOptionPane.showMessageDialog(null,"you got an F");
		}
		else if(score<0)
		{
			JOptionPane.showMessageDialog(null, "How did you get a negative score");
		}
		
		}
		
		
}

