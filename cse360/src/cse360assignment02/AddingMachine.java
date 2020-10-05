package cse360assignment02;
/**
 * The AddingMachine program implements an anpplication that 
 * adding/subtracting a number to the total variable. The program 
 * also gives the string of history of the transactions.
 * 
 * @author Lingge Zhang 
 * @version 1.0
 * @since 2020-10-04
 *
 */
public class AddingMachine {
  private int total;
  
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
    return 0;
  }
  
  /**
   * This method is used to add a parameter to the total variable.
   * @param value A integer that is added to the total variable
   */
  public void add (int value) {
  }

  /**
   * This method is used to subtract a parameter from the total variable.
   * @param value An integer that is subtracted from the total variable.
   */
  public void subtract (int value) {
  }

 /**
  * This method is used to record the history of the transactions.
  * @return String a string of transactions
  */
  public String toString () {
    return "";
  }

  /**
   * This method is used to clear the memory.
   */
  public void clear() {
  }
}