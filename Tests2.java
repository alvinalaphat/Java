import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tests2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name = JOptionPane.showInputDialog("What's your name?" );
		
		int sc1 = Byte.parseByte(JOptionPane.showInputDialog("Enter first test score: "));
		int sc2 = Byte.parseByte(JOptionPane.showInputDialog("Enter second test score: "));
		int sc3 = Byte.parseByte(JOptionPane.showInputDialog("Enter third test score: "));
		
		double avg = (sc1 + sc2 + sc3)/3.0;
		
		JOptionPane.showMessageDialog(null, name +
		"\n\tTest Score 1: " + sc1 + "\n\tTest Score 2: " + sc2 +
		"\n\tTest Score 3: " + sc3 +
		"\n\tAverage Score: " + avg);
		
		System.exit(0);
	}
}