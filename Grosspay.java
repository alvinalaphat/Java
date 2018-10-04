import java.util.Scanner;
import javax.swing.JOptionPane;

public class Grosspay
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What's your name?\n");
		String name = input.nextLine();
		System.out.print("How many hours did you work this week? ");
		int hours = input.nextInt();
		System.out.print("What is your hourly pay rate? ");
		int payRate = input.nextInt();
		
		int grossPay = hours * payRate;
		
		JOptionPane.showMessageDialog(null, "Hello " + name +
		", your gross pay is $" + grossPay);
	}
}