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
  public String diMethod(){
    di = Math.pow((Math.pow(focus, -1) - Math.pow(dob, -1)), -1);
    String type = "";
    if (di < 0){
      type = "The object is virtual and is " + di + " cm behind the mirror or behind the lens";
    }
    else {
      type = "The object is real and is " + di + " cm in front of the mirror or lens";
    }
    return type;
  }
  public String magnificationMethod(){
     magnification = di/dob;
     String str = "";
     if (Math.pow(magnification, 2) < 1){
       str = "The image of the object is reduced by " + magnification + " times its original size";
     }
     else if (magnification == 1) {
       str = "The image of the object is the same size as the original object";
     }
     else{
       str = "The image of the object is increased by " + magnification + " times its original size";
     }
     return str;
  }
  public double hi(){
    hi = magnification * ho;
    return hi;
  }
}
