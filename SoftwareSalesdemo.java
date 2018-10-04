import java.util.Scanner;

public class SoftwareSalesdemo{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many packages were sold? ");
    double numSold = input.nextDouble();
    SoftwareSales purchase = new SoftwareSales(numSold);
    System.out.printf("Price: $%.2f\n", purchase.calcPrice());
    System.out.printf("Price Per Unit: $%.2f\n", purchase.pricePer());
  }
}
