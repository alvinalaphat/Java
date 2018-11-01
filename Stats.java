import java.util.Arrays;
import java.lang.Math;
public class Stats{
  public int array[];
  public double mean;
  public double median;
  public Stats(int arr[]){
    array = arr;
    Arrays.sort(array);
  }
  public double Mean(){
    double total = 0;
    for(int i:array)
    {
      total += i;
    }
    mean = total/array.length;
    return mean;
    }

  public double Median(){
    int i = (array.length)/2;
    int r = (int)(array.length/2 + .5);
    if(array.length % 2 == 0) {
      median = (double)(array[i-1]+array[i])/2;
    }
    else {
      median = array[r];
    }
    return median;
  }
  public double sDeviation(){
    double sum = 0;
    for(int i:array)
    {
      sum += Math.pow((i-mean),2);
    }
    double sDeviation = Math.pow((sum/array.length),.5);
    return sDeviation;
  }
  public double Mode(){
    int maxValue = 0, maxCount = 0;

       for (int i = 0; i < array.length; ++i)
       {
           int count = 0;
           for (int j = 0; j < array.length; ++j)
           {
               if (array[j] == array[i])
                   ++count;
           }
           if (count > maxCount)
           {
               maxCount = count;
               maxValue = array[i];
           }
       }

       return maxValue;
  }
  public double Max(){
    return array[array.length-1];
  }
  public double Min(){
    return array[0];
  }
}
