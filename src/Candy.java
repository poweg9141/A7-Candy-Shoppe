/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Candy extends DessertItem {

    //stores the weight of the candy
    private double weight;
    //stores the price per pound of the candy
    private int ppL;

    /**
     * Constructor to create a candy
     *
     * @param name the name of the candy
     * @param weight the weight of the candy
     * @param pricePerLbs the price per pound of the candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        //calls the superclass passing in the name
        super(name);
        //stores the weight and price per pound in this class
        this.weight = weight;
        ppL = pricePerLbs;
    }

    /**
     * converts the candy to a string that can be output onto a receipt
     *
     * @return the string that can be output onto a receipt
     */
    @Override
    public String toString() {
        //creates a string to store the answer string
        String ans = "";
        //adds the weight and appropriate symbols after
        ans += weight + " lbs. @ $";
        //adds the cost per pound in dollars and cents
        ans += DessertShoppe.cents2dollarsAndCents(ppL);
        //adds the appropriate symbols after, and drops to a new line
        ans += " /lb.\n";
        //adds the name of the candy
        ans += super.getName();
        //gets the cost of the candy in dollars and cents using this classes getCost method
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //adds as many spaces as are required to put the cost of the candy on the last few characters int the reciept
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            ans += " ";
        }
        //adds the cost of the candy in dollars and cents to the string
        ans += cost;
        //returns the string
        return ans;
    }

    /**
     * gets the cost of the candy
     *
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        //multiplies the weight in pounds by the price per pound, rounds and converts to an int
        //returns the result
        return (int) Math.round(weight * ppL);
    }
}