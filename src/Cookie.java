/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {

    //stores the number of cookies and the price per dozen cookies
    private int number, ppD;

    /**
     * constructor to create a cookie
     *
     * @param name the name of the cookie
     * @param number the number of cookies bought
     * @param pricePer12 the price per dozen cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        //calls the super class passing in the name
        super(name);
        //stores the number of cookies and price per dozen cookies in htis class
        this.number = number;
        ppD = pricePer12;
    }

    /**
     * converts the cookie to a string that can be output onto a receipt
     *
     * @return the string that can be output onto a receipt
     */
    @Override
    public String toString() {
        //the strig to be returned
        String ans = "";
        //adds the number of cookies bought and the appropriate symbols
        ans += number + " @ $";
        //adds the price per dozen in dollars and cents
        ans += DessertShoppe.cents2dollarsAndCents(ppD);
        //adds the appropriate symbols after and drops to a new line
        ans += " /dz\n";
        //adds the name of the cookie
        ans += super.getName();
        //calculates the cost of the cookies in dollars and cents
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //adds as many spaces as are required to put the cost of the cookie on the last few characters int the reciept
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            ans += " ";
        }
        //adds the cost of the cookie
        ans += cost;
        //returns the string
        return ans;
    }

    /**
     * gets the cost of the cookie in cents
     *
     * @return the cost of the cookies in cents
     */
    @Override
    public int getCost() {
        //divides the price per dozen by 12 to get the price per cookie
        double singlePrice = ppD / 12.0;
        //multiplies the price per cookie by the number of cookies to get the total cost
        int cost = (int) (singlePrice * number);
        //returns the cost of the cookies
        return cost;
    }
}