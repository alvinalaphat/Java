import java.util.Scanner;
import java.io.*;

public class Filewriter{
  public static void main(String[] args) throws IOException{
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of items in list: ");
    int num = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter a filename: ");
    String filename = keyboard.nextLine();
    FileWriter fwriter = new FileWriter(filename, true);
    PrintWriter outputfile = new PrintWriter(fwriter);

    for(int x=1;x<=num;x++){
      System.out.println("Enter an item: ");
      String item = keyboard.nextLine();
      outputfile.println(item);
    }
    outputfile.close();
  }
}
