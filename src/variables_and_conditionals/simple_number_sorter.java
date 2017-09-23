package variables_and_conditionals;

import javax.swing.JOptionPane;

public class simple_number_sorter {
	

public static void main(String[] args) 
{
	String num1 = JOptionPane.showInputDialog("pick a number");
	String num2 = JOptionPane.showInputDialog("pick a number");
	String num3 = JOptionPane.showInputDialog("pick a number");
	
	int  number1 = Integer.parseInt(num1);
	int  number2 = Integer.parseInt(num2);
	int  number3 = Integer.parseInt(num3);
	
	if(number1<number3 && number1<number2 && number2<number3)
	{
		JOptionPane.showMessageDialog(null, number1 +" " + number2+" " + number3);
		JOptionPane.showMessageDialog(null, number3 +" " + number2+" " + number1);
	}
	else if(number1<number3 && number1<number2 && number3<number2)
	{
		JOptionPane.showMessageDialog(null, number1 +" " + number3+" " + number2);
		JOptionPane.showMessageDialog(null, number2 +" " + number3+" " + number1);
	}
	
	
	
	
	else if(number2<number1 && number2<number3 && number1<number3)
	{
		JOptionPane.showMessageDialog(null, number2 +" " + number1+" " + number3);
		JOptionPane.showMessageDialog(null, number3 +" " + number1+" " + number2);
	}
	else if(number2<number3 && number2<number1 && number3<number1)
	{
		JOptionPane.showMessageDialog(null, number2 +" " + number3+" " + number1);
		JOptionPane.showMessageDialog(null, number1 +" " + number3+" " + number2);
	}
	
	
	
	
	
	else if(number3<number1 && number3<number2 && number2<number1)
	{
		JOptionPane.showMessageDialog(null, number3 +" " + number2+" " + number1);
		JOptionPane.showMessageDialog(null, number1 +" " + number2+" " + number3);
	}
	
	else if(number3<number1 && number3<number2 && number1<number2)
	{
		JOptionPane.showMessageDialog(null, number3 +" " + number1+" " + number2);
		JOptionPane.showMessageDialog(null, number2 +" " + number1+" " + number3);
	}
	}

}
