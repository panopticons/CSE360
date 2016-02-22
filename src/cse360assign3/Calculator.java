/** Calculator
 * @author Maria Castro - editor
 * PIN: 209
 * @version 2/22/16
 */

package cse360assign3;

public class Calculator {

	private int total;
	
	/** Total is 0 **/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Gets running total
	 * @return total total variable
	 */
	public int getTotal () {
		return total;
	}
	
	/** Adds specified value to total
	 * @param value value to be added
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/** Subtracts specified value from total
	 * @param value value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** Multiplies total by specified value
	 * @param value value to multiply total by
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** Divides total by specified value
	 * @param value value to divide total by
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}
