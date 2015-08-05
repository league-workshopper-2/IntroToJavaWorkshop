package day1.robot;

import javax.swing.JOptionPane;

public class NewClass2 {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog("What is your name?");
	String age=JOptionPane.showInputDialog("How old are you");
		String number= JOptionPane.showInputDialog("What is your phone number");
		String birthday= JOptionPane.showInputDialog("when is your birthday");
		String food= JOptionPane.showInputDialog("What is your favorite food");
		JOptionPane.showMessageDialog(null, "my name is "+ answer +". "+ answer+ " 's phone number is "+number+"."+answer+ " 's birthday is "+birthday+"."+ answer+ " 's favorite food is"+food+"."+answer+"");
	}

}
