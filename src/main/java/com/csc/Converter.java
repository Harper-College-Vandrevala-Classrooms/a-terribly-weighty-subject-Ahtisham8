package com.csc;

public class Converter {

  public String toPounds(int ounces) {
    String answer = "";
    double convert;

    convert = (double) ((Math.round((double) ounces*10000)/10000.0) / 16.0000);
    
    if (ounces == 16) {
      answer = String.format("%.4f", convert) + " lb";
      return answer;
    }

    
      answer = String.format("%.4f", convert) + " lbs";
      return answer;
    
  }

  public String toPounds()
  {
    return "0 oz";
  }

  public String toPoundsAndOunces(int ounces) {
    String answer = "";
    int lb;
    int oz;

    lb = (int) (ounces / 16);
    oz = (int) (ounces % 16);
    
if (lb == 1) {
  answer = lb + " lb " + oz + " oz";
  
  return answer;
  
}

  answer= lb + " lbs " + oz + " oz";

  return answer;

  }

  public String toPoundsAndOunces()
  {
    return "0 oz";
  }

  public String toOunces(int lb, int oz)
  {
    int lbToOz = lb * 16;
    int total = lbToOz + oz;

    return total + " ounces";
  }
}
