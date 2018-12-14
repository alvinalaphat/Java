import java.util.Scanner;

public class ProductionWorkerDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = keyboard.nextLine();
		String employeeNumber;
		System.out.print("Enter employee number XXX-L, X is a digit 0-9 and L is a letter: ");
		employeeNumber = keyboard.nextLine();
		System.out.print("Enter the payrate: ");
		double payRate = keyboard.nextDouble();
		System.out.print("Enter the hire date: ");
		keyboard.nextLine();
		String hireDate = keyboard.nextLine();
		int shift;
		
		
		do {
			System.out.print("What shift do you work? 0 for day shift, 1 for night shift: ");
			shift = keyboard.nextInt();
		} while (shift < 0 || shift > 1);
		
		
		ProductionWorker worker = new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);
		System.out.println("Employee name: " + worker.getName());
		System.out.println("Employee number: " + worker.getNumber());
		System.out.println("Hire date: " + worker.getHireDate());
		
		
		
		if (worker.getHours() == 0) {
			System.out.println("Working day shift for normal rate.");
			System.out.println("Pay Rate: " + worker.getRate());
		} else if (worker.getHours() == 1) {
			System.out.println("Working night shift for twice the rate.");
			System.out.printf("Pay Rate: %.2f\n", (worker.getRate() * 2));
		}
	}
}
