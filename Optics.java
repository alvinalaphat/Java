import java.lang.Math;
public class Optics{
  public double focus;
  public double dob;
  public double di;
  public double ho;
  public double magnification;
  public double hi;
  public Optics(double f, double d, double h){
    focus = f;
    dob = d;
    ho = h;
  }
  public double di(){
    di = Math.pow((Math.pow(focus, -1) - Math.pow(dob, -1)), -1);
    return di;
  }
  public double magnification(){
     magnification = di/dob;
     return magnification;
  }
  public double hi(){
    hi = magnification * ho;
    return hi;
  }
}
