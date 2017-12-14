/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends IceCream{
    
    //string to store the name of the topping
    private String topping;
    
    /**
     * constructor to create a sundae
     * @param icName the name of the ice cream in the sundae
     * @param icCost the cost of the ice cream in the sundae
     * @param toppingName the name of the topping on the sundae
     * @param toppingCost the cost of the topping on the sundae
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       //calls the super class passing in the ice cream name
       //and the total cost of the ice cream and topping since ice cream is priced singly
       super(icName, icCost + toppingCost);
      //stores the name of the topping in this class
       topping = toppingName;
    }
    
    /**
     * converts the sundae to a string that can be output onto a receipt
     *
     * @return the string that can be output onto a receipt
     */
    @Override
    public String toString()
    {
        //creates a string to store the answer
        String ans = "";
        //adds the topping name plus Sunae with, then drops to a new line
        ans += topping + " Sundae with\n";
        //adds the name of the ice cream to the string
        ans += super.getName();
        //string to store the cost of the sundae in dollard and cents
        String cost = DessertShoppe.cents2dollarsAndCents(super.getCost());
        //adds as many spaces as are required to put the cost of the sundae on the last few characters int the reciept
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++){
            ans += " ";
        }
        //adds the cost of the sundae to the string        
        ans += cost;
        //returns the string
        return ans;
    }  
}