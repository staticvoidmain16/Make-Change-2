import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MakeChange2
{
  public static void main(String [] args)
  {
    
   DecimalFormat money = new DecimalFormat("##.##");
    
   
   String totalCents;
   totalCents = JOptionPane.showInputDialog(null, "Please enter an amout of money (with or without $). \nEx: $3.27 or 3.27");
   totalCents = totalCents.replace("$", ""); //If user enters with "$", this line will replace it with "" so that it does not mess with code.
   double moneyInput;
   moneyInput = Double.valueOf(totalCents);
   
   
   final double quarter = .25;
   final double dime = .10;
   final double nickel = .05;
   final double penny = .01;
   
   
   //System.out.println("Input: " + money.format(moneyInput) );
   
   double quarterTotal = moneyInput / quarter;
   String quarterRemainder = money.format( (moneyInput % quarter) );
   double remaining = Double.valueOf(quarterRemainder);
   
   //System.out.println((int)quarterTotal + " Quarter(s)"); **Used these lines for reference during coding
   //System.out.println( (int)((remaining) * 100) + " cents remaining"); **These lines were helpful during coding.
   
   
   
   double dimeTotal =  (int)(remaining / dime);
   String dimeRemainder = money.format( remaining % dime );
   double remaining2 = Double.valueOf(dimeRemainder);
   
   //System.out.println( (int)dimeTotal + " Dime(s)");
   //System.out.println( (int)((remaining2) * 100) + " cents remaining");
   
   
   
   double nickelTotal =  (int)(remaining2 / nickel);
   String nickelRemainder = money.format( remaining2 % nickel );
   double remaining3 = Double.valueOf(nickelRemainder);
   
   //System.out.println( (int)nickelTotal + " Nickel(s)");
   //System.out.println( (int)((remaining3) * 100) + " cents remaining");
   
  
   
   double pennyTotal =  (int)(remaining3 / penny);
   String pennyRemainder = money.format( remaining3 % penny );
   double remaining4 = Double.valueOf(pennyRemainder);
   
   //System.out.println( (int)pennyTotal + " Pennies");
   //System.out.println( (int)((remaining4) * 100) + " cents remaining"); 
   
   
   JOptionPane.showMessageDialog(null, "$" + moneyInput + " can be made using:\n" + (int)quarterTotal + " quarter(s),\n" +
                                 (int)dimeTotal + " dime(s),\n" + (int)nickelTotal + " nickel(s),\n" + "and " + (int)pennyTotal + " pennies.");
   
   
   

  }
}

