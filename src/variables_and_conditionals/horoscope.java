package variables_and_conditionals;

import javax.swing.JOptionPane;

public class horoscope 
{
public static void main(String[] args) 

{
	String January= "you will be cought in a blizard then you will be rescued by a helicopter and brought safly home";
	String Febuary = "you will get lots of candy durng valentines day";
	String March = "your house will go completly green including you";
	String April = "you will see the easter bunny";
	String May = "you will have a delicous cake for your birthday";
	String June = "you will have good grades at the end of the scool year";
	String July = "you will be part of a biog parade";
	String August = "you will travel to an exotic place";
	String September = "You will get good teachers";
	String October = "You will get your dream costume";
	String November = "you will have the bigest meal of your life";
	String December = "you will get your dream present";
	String month = JOptionPane.showInputDialog("what month were you born in");

	if(month.equals("january"))
	{
	JOptionPane.showMessageDialog(null, January);
	}
	if(month.equals("febuary"))
	{
	JOptionPane.showMessageDialog(null, Febuary);
	}
	if(month.equals("march"))
	{
	JOptionPane.showMessageDialog(null, March);
	}
	if(month.equals("april"))
	{
	JOptionPane.showMessageDialog(null, April);
	}
	if(month.equals("may"))
	{
	JOptionPane.showMessageDialog(null, May);
	}
	if(month.equals("june"))
	{
	JOptionPane.showMessageDialog(null, June);
	}
	if(month.equals("july"))
	{
	JOptionPane.showMessageDialog(null, July);
	}
	if(month.equals("august"))
	{
	JOptionPane.showMessageDialog(null, August);
	}
	if(month.equals("september"))
	{
	JOptionPane.showMessageDialog(null, September);
	}
	if(month.equals("october"))
	{
	JOptionPane.showMessageDialog(null, October);
	}
	if(month.equals("november"))
	{
	JOptionPane.showMessageDialog(null, November);
	}
	if(month.equals("december"))
	{
	JOptionPane.showMessageDialog(null, December);
	}











}
}