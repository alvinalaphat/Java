 gb nn   import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tests
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name = JOptionPane.showInputDialog("What's your name?" );
		
		System.out.print("Enter first test score: ");
		int x = input.nextInt();     
		System.out.print("Enter second test score: ");
		int y = input.nextInt();
		System.out.print("Enter third test score: ");
		int z = input.nextInt();
		
		int avg = (x + y + z)/3;
		
		JOptionPane.showMessageDialog(null, name +
		"\n\tTest Score 1: " + x + "\n\tTest Score 2: " + y +
		"\n\tTest Score 3: " + z +
		"\n\tAverage Score: " + avg);
	}
}