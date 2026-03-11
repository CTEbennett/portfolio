// Evan Bennett, 4/17/2024, ShowMeMoreMoney, 
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class ShowMeMoreMoney {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter a total amount of change in ¢: ");
		//int change = input.nextInt();
		String money = JOptionPane.showInputDialog ("Enter a total amount of change in ¢: ");
		int change = Integer.parseInt (money);
		int hundreds = (change - (change%10000))/10000;
		change = change - hundreds*10000;
		int tens = (change -(change%1000))/1000;
		change = change - tens*1000;
		int dollar = (change - (change%100))/100;
		change = change - dollar*100;
		int quarter = (change/25)%25;
		change = change - quarter*25;
		int dimes = (change/10)%10;
		change = change - dimes*10;
		int nickels = (change/5)%5;
		change = change - nickels*5;
		int cents = (change/1);
//		if (hundreds > 1) {
//			System.out.println("Hundreds:   " + hundreds);
//		}else {
//			System.out.println("Hundred:   " + hundreds);
//		}
//		if (tens > 1) {
//			System.out.println("Tens:      " + tens);
//		}else {
//			System.out.println("Ten:       " + tens);
//		}
//		if (dollar > 1) {
//			System.out.println("Dollars:    " + dollar);
//		}else {
//			System.out.println("Dollar:    " + dollar);
//		}
//		if (quarter > 1) {
//			System.out.println("Quarters:   " + quarter);
//		}else {
//			System.out.println("Quarter:   " + quarter);
//		}
//		if (dimes > 1) {
//			System.out.println("Dimes:      " + dimes);
//		}else {
//			System.out.println("Dime:      " + dimes);
//		}
//		if (nickels > 1) {
//			System.out.println("Nickels:    " + nickels);
//		}else {
//			System.out.println("Nickel:    " + nickels);
//		}
//		if (cents > 1) {
//			System.out.println("Cents:     " + cents);
//		}else {
//			System.out.println("Cent:      " + cents);
//		}
		JOptionPane.showMessageDialog(null, "Hundreds: " + hundreds + "\n"  + "Tens:          " + tens + "\n" + "Dollars:      " + dollar + "\n" + "Quarters:   " + quarter + "\n " + "Dimes:       " + dimes + "\n" + "Nickels:      " + nickels + "\n" + "Cents:         " + cents);
	}
}
