import java.util.Scanner;

public class Snelldemo{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter initial angle: ");
    double initial = keyboard.nextDouble();
    System.out.print("Enter index of refraction of first medium: ");
    double n1 = keyboard.nextDouble();
    System.out.print("Enter index of refraction of second medium: ");
    double n2 = keyboard.nextDouble();
    Snell optics = new Snell(initial, n1, n2);

    System.out.println("Final Angle: " + optics.calcIndex());
  }
}
