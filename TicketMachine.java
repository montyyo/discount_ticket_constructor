/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // the option to buy a discount ticket
    private boolean discountTicket;
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost, boolean discount)
    {
        price = cost;
        balance = 0;
        total = 0;
        discountTicket = discount;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Devuelve el dinero que hace falta
     * introducir para imprimir el ticket
     */
    public int getAmountLeftToPay()
    {
        int amountLeftToPay;
        amountLeftToPay  = price - balance;
        return amountLeftToPay;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
           
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the prince.
            balance = balance - price;
        }
        else {
             int amountLeftToPay = (price - balance);
            System.out.println("You must insert at least: " +
               amountLeftToPay  + " more cents.");

        }
    }
    
    /**
     * print a second type of ticket, the ticket have a descount of 10%
     * the simulation need a senior card.
     */
    public void printTicketWithDiscount()
    {
        int priceDescount = (price * 90)/ 100;
        
        if(balance >= price && discountTicket == true) {
           
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket with descount to seniors 10%  ");
            System.out.println("# " + priceDescount + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the priceDescount.
            total = total + priceDescount;
            // Reduce the balance by the priceDescount.
            balance = balance - priceDescount;
        }
        else {
             int amountLeftToPay = (priceDescount - balance);
            System.out.println("You must insert at least: " +
               amountLeftToPay  + " more cents.");

        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    
    
    /**
     * metodo emptyMachine, simula el vaciado de la maquina y devuelve la cantidad
     */
    public int emptyMachine()
    {
        int balanceBeforeEmpty;
        balanceBeforeEmpty = total;
        total = 0;
        return balanceBeforeEmpty;
        
    }
    
    
}
