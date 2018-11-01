import java.util.Arrays;
import java.util.Scanner;

public class Statsdemo{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of elements in the array: ");
    int n = keyboard.nextInt();
    int a[] = new int[n];
    System.out.print("Enter the elements in the array: ");
    for(int i=0;i<n;i++){
      a[i] = keyboard.nextInt();
    }
    Stats stats = new Stats(a);
    System.out.println(Arrays.toString(a));
    System.out.println("Mean: "+stats.Mean());
    System.out.println("Median: "+stats.Median());
    System.out.println("Mode: " + stats.Mode());
    System.out.printf("Standard Deviation: %.2f\n", stats.sDeviation());
    System.out.println("Maximum: " + stats.Max());
    System.out.println("Minimum: " + stats.Min());
  }
}
