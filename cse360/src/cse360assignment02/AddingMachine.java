package cse360assignment02;
/**
 * The AddingMachine program implements an anpplication that 
 * adding/subtracting a number to the total variable. The program 
 * also gives the string of history of the transactions.
 * 
 * @author Lingge Zhang 
 *
 */
public class AddingMachine {
  private int total;
  StringBuffer sb = new StringBuffer("0");
  
  /**
   *This is the constructor of the AddingMachine class, 
   *initializing the total number.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * This method is used to get the recent total variable.
   * @return int This returns the total variable
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * This method is used to add a parameter to the total variable.
   * @param value A integer that is added to the total variable
   */
  public void add (int value) {
	  total = total + value;
	  sb.append("+" + value);
  }

  /**
   * This method is used to subtract a parameter from the total variable.
   * @param value An integer that is subtracted from the total variable.
   */
  public void subtract (int value) {
	  total = total - value;
	  sb.append("-" + value);
  }

 /**
  * This method is used to record the history of the transactions.
  * @return String a string of transactions
  */
  public String toString () {
    return sb.toString();
  }

  /**
   * This method is used to clear the memory.
   */
  public void clear() {
	  total = 0;
  }
}