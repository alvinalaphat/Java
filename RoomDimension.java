public class RoomDimension{
  public double length;
  public double width;
  public double area;
  public RoomDimension(){
    length = 0;
    width = 0;
  }
  public RoomDimension(double l, double w){
    length = l;
    width = w;
  }
  public RoomDimension(RoomDimension r){
    length = r.length;
    width = r.width;
  }
  public double calcArea(){
    return length * width;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public void setLength(double l){
    length = l;
  }
  public void setWidth(double w){
    width = w;
  }
  public String toString(){
    str = "Length: " + getLength() + "\nWidth: " + getWidth();
    return str; 
  }
}
