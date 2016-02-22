/** Calculator
 * @author Maria Castro - editor
 * PIN: 209
 * @version 2/22/16
 */

package cse360assign3;

public class Calculator {

	private int total;
	StringBuilder arrayString = new StringBuilder();
	
	/** Total is 0 **/
	public Calculator () {
		total = 0;  // not needed - included for clarity
		arrayString.append(0);
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
		arrayString.append(" + " + value);
	}
	
	/** Subtracts specified value from total
	 * @param value value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		arrayString.append(" - " + value);
	}
	
	/** Multiplies total by specified value
	 * @param value value to multiply total by
	 */
	public void multiply (int value) {
		total = total * value;
		arrayString.append(" * " + value);
	}
	
	/** Divides total by specified value
	 * @param value value to divide total by
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
		arrayString.append(" / " + value);
	}
	
	/** Returns history of all actions as a string
	 * 
	 * @return text action history
	 */
	public String getHistory () {
		return arrayString.toString();
	}
}
