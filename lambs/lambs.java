package com.google.challenges; 

public class Answer {  
  public static void main(String[] args)
  {
    System.out.println(answer(250));
  }
    public static int answer(int total_lambs) { 
	double phi = (1+Math.sqrt(5))/2; //golden search ratio
        double x = (1-Math.sqrt(5))/2;
        double y = Math.pow(10, -10);
    
        int maxLamb = (int)(Math.round(Math.log((total_lambs +1)*Math.sqrt(5)+x)/Math.log(phi)))-2;
        int fibonnaciNumber = (int)(Math.round((Math.pow(phi, maxLamb+2)-Math.pow(x, maxLamb+2))/Math.sqrt(5)));
        if (total_lambs+1 < fibonnaciNumber)
            maxLamb -= 1;
            
        int minLamb = (int)(Math.log(total_lambs + 1)/Math.log(2));
        
        return maxLamb - minLamb; 
    } 
}
