package Section4OfOracleCourse;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 10;
    
    public void findTotal(){
        //Calculate an individual's total after tax and tip
        double totalValue = originalPrice * tax + tip;
        //Print this value
        System.out.println("Total Tax: " + totalValue);
    }


}
