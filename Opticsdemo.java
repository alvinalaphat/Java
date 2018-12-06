import java.util.Scanner;

public class Opticsdemo{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter focal length: ");
    double f = keyboard.nextDouble();
    System.out.print("Enter object distance: ");
    double d = keyboard.nextDouble();
    System.out.print("Enter object height: ");
    double h = keyboard.nextDouble();
    Optics optics = new Optics(f, d, h);

    System.out.println("Focal length: " + optics.focus);
    System.out.println("Object distance: " + optics.dob);
    System.out.println("Object height: " + optics.ho);
    System.out.println("Image distance: " + optics.diMethod());
    System.out.println("Magnification: " + optics.magnificationMethod());
    System.out.printf("Image height: %.2f\n", optics.hi());
  }
}
