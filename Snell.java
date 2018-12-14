import java.lang.Math;
public class Snell{
  public double initial;
  public double n2;
  public double n1;
  public double radian;
  public Snell(double f, double d, double h){
    initial = Math.toRadians(f);
    n1 = d;
    n2 = h;
  }
  public double calcIndex(){
    radian = n2 * Math.sin(initial)/n1;
    return Math.toDegrees(Math.asin(radian));
  }
}
