public class SoftwareSales
{
  private final double retail = 99;
  private double numSold;
  private double disc;
  public SoftwareSales(double sold) {
    numSold = sold;
  }
  public void setNum(double num){
    numSold = num;
  }
  public double getNum(){
    return numSold;
  }
  public double calcPrice(){
    if(numSold>=10 && numSold<=19){
      disc = .8;
    }
    else if(numSold>=20 && numSold<=49){
      disc = .7;
    }
    else if(numSold>=50 && numSold<=99){
      disc = .6;
    }
    else if(numSold>=100){
      disc = .5;
    }
    else{
      disc = 1;
    }
    return retail * disc * numSold;
  }
  public double pricePer(){
    return retail * disc;
  }
}
