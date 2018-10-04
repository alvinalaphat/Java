import java.util.Scanner;

public class Payrolldemo
{
  public static void main(String[] args)
  {
    String name;
    double IDnumber;
    double payRate;
    double hours;
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name? ");
    name = input.nextLine();
    System.out.println("What is your Id? ");
    IDnumber = input.nextDouble();
    System.out.println("How much do you get paid? ");
    payRate = input.nextDouble();
    System.out.println("How many hours did you work? ");
    hours = input.nextDouble();
    Payroll emp = new Payroll(name,IDnumber,payRate,hours);
    System.out.printf("Employee: %s\n", emp.getName());
    System.out.printf("ID Number: %.0f\n", emp.getID());
    System.out.printf("Pay Rate: %.2f\n", emp.getPay());
    System.out.printf("Hours Worked: %.2f\n", emp.getHours());
    System.out.printf("Gross Pay: %.2f\n" + emp.calcPay());
  }
}
