/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class IceCream extends DessertItem {

    //stores the cost of the ice cream
    private int cost;

    /**
     * constructor to create an ice cream
     *
     * @param name the name of the ice cream
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost) {
        //calls the super class passing the name
        super(name);
        //stores the cost in this class
        this.cost = cost;
    }

    /**
     * converts the ice cream to a string that can be output onto a receipt
     *
     * @return the string that can be output onto a receipt
     */
    @Override
    public String toString() {
        //creates the string that will be outputted
        String ans = "";
        //adds the name of the ice cream to the string
        ans += super.getName();
        //calculates the cost of the ice cream in dollars and cents
        String cost = DessertShoppe.cents2dollarsAndCents(this.cost);
        //adds as many spaces as are required to put the cost of the ice cream on the last few characters int the reciept
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            ans += " ";
        }
        //adds the cost of the ice cream
        ans += cost;
        //returns the string
        return ans;
    }

    /**
     * gets the cost of the ice cream in cents
     *
     * @return the cost of the ice cream in cents
     */
    @Override
    public int getCost() {
        //returns the cost of the ice cream in cents
        return cost;
    }
}
