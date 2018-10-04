import java.util.Scanner;

public class Payroll
{
  private String name;
  private double IDnumber;
  private double payRate;
  private double hours;
  public Payroll(String n,double ID,double p, double h) {
    name = n;
    IDnumber = ID;
    payRate = p;
    hours = h;
  }
  public Payroll() {
  	name = new String();
  	IDnumber = 0;
  	payRate = 0;
  	hours = 0;
  	}
  public String getName(){
    return name;
  }
  public double getID(){
    return IDnumber;
  }
  public double getPay(){
    return payRate;
  }
  public double getHours(){
    return hours;
  }
  public void setPay(double pay){
    payRate = pay;
  }
  public void setHours(double hrs){
    hours = hrs;
  }
  public double calcPay() {
    return hours * payRate;
  }
}
