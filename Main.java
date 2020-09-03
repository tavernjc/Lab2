class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int TotalMMs=55*10;
    double BlueClr=TotalMMs*.24;
    double BrownClr=TotalMMs*.13;
    double GreenClr=TotalMMs*.16;
    double OrangeClr=TotalMMs*.20;
    double RedClr=TotalMMs*.13;
    double YellowClr=TotalMMs*.14;
  System.out.println("Blue: " + BlueClr);
  System.out.println("Brown: " + BrownClr);
  System.out.println("Green: " + GreenClr);
  System.out.println("Orange: " + OrangeClr);
  System.out.println("Red: " + RedClr);
  System.out.println("Yellow: " + YellowClr);
  double SumOfMMS;
  SumOfMMS=BlueClr+BrownClr+GreenClr+OrangeClr+RedClr+YellowClr;
  System.out.println("Sum: " + SumOfMMS);
  if (BlueClr > BrownClr && GreenClr > OrangeClr){
    System.out.println("Blue over Brown and Green over Orange");
  }
  if(BrownClr <= RedClr){
   System.out.println("Brown is less than or equal to Red");
  }
if (TotalMMs == SumOfMMS){
  System.out.println("Numbers match");
}
  }
}