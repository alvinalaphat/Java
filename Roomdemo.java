import java.util.Scanner;
import java.text.DecimalFormat;
public class Roomdemo{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter room length: ");
    double l = keyboard.nextDouble();
    System.out.println("Enter room width: ");
    double w = keyboard.nextDouble();

    RoomDimension room = new RoomDimension(l, w);
    
    System.out.println("Enter price for carpet: ");
    double p = keyboard.nextDouble();

    RoomCarpet roomcarpet = new RoomCarpet(room, p);
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    System.out.println("Length: " + room.getLength());
    System.out.println("Width: " + room.getWidth());
    System.out.println("Area: " + room.calcArea());
    System.out.println("Price: $" + dollar.format(roomcarpet.getPrice()));
    System.out.println("Total Cost: $" + dollar.format(roomcarpet.calcCost()));
  }
}
