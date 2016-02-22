/** Calculator tests
 * @author Maria Castro - editor
 * PIN: 209
 * @version 2/22/16
 */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	// Tests if Calculator object is created
	@Test
	public void testCalculator() {
		Calculator newCalc = new Calculator();
		assertNotNull(newCalc);
	}

	// Tests if the getTotal method returns the total
	@Test
	public void testGetTotal() {
		Calculator newCalc = new Calculator();
		assertEquals(0, newCalc.getTotal());
	}

	// Tests the calculator's add function
	@Test
	public void testAdd() {
		Calculator newCalc = new Calculator();
		newCalc.add(10);
		assertEquals(10, newCalc.getTotal());
	}

	// Tests the calculator's subtract function
	@Test
	public void testSubtract() {
		Calculator newCalc = new Calculator();
		newCalc.add(10);
		newCalc.subtract(15);
		assertEquals(-5, newCalc.getTotal());
	}

	// Tests the calculator's multiplication function
	@Test
	public void testMultiply() {
		Calculator newCalc = new Calculator();
		newCalc.add(7);
		newCalc.multiply(7);
		assertEquals(49, newCalc.getTotal());
	}

	// Tests the calculator's division function
	@Test
	public void testDivide() {
		Calculator newCalc = new Calculator();
		newCalc.add(25);
		newCalc.divide(5);
		assertEquals(5, newCalc.getTotal());
	}
	
	// Tests division by zero
	@Test
	public void testDivByZero() {
		Calculator newCalc = new Calculator();
		newCalc.add(35);
		newCalc.divide(0);
		assertEquals(0, newCalc.getTotal());
	}

	// Tests if the getHistory function returns the empty string function
	@Test
	public void testGetHistory() {
		Calculator newCalc = new Calculator();
		newCalc.add(9);
		newCalc.subtract(3);
		newCalc.multiply(3);
		newCalc.divide(2);
		newCalc.add(1);
		assertEquals("0 + 9 - 3 * 3 / 2 + 1", newCalc.getHistory());
	}
}
