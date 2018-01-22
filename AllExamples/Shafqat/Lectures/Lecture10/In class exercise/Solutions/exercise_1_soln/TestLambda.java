package lesson10.exercise_1_soln;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


/** We view Problem1 lambda as a simple expression since each
 *  piece of the pipeline is just a getter. We test the lambda
 *  as a black box, making sure correct outputs are returned
 *  for given inputs.
 */
public class TestLambda {
	@Test
	public void testLambda() {
		
		//create test data
		Customer cust1 = new Customer("101", "Bob", "Jones");
		cust1.getCheckingAccount().updateBalance(100);
		Customer cust2 = new Customer("102", "Tom", "Brokaw");
		cust2.getCheckingAccount().updateBalance(100);
		Customer cust3 = new Customer("103", "Ron", "Regis");
		cust3.getCheckingAccount().updateBalance(10);
		List<Account> testList = Arrays.asList(cust1.getCheckingAccount(), 
				cust2.getCheckingAccount(), cust3.getCheckingAccount());
		List<Customer> expected = Arrays.asList(cust2, cust1);
		
		//perform test
		Problem1 p1 = new Problem1();
		List<Customer> result = p1.specialAccounts(testList);
		assertEquals(expected, result);
		
	}
}
