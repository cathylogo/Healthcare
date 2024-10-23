package Assignment1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class to verify the correct and incorrect BMI calculations in MyHealthDataBase.
 * The `incorrectBMI()` method contains a mistake where height is divided by itself 
 * (heightParam / heightParam), leading to an abnormally high BMI. 
 * This class tests both the correct and incorrect BMI calculations.
 * 
 * @author Catherine Logo
 */

public class MyHealthDataTest2 {
	/**
	 * Test method to verify the BMI calculation
	 */

	@Test
	public void testCalculateBMI() {
		MyHealthDataBase patientData = new MyHealthDataBase();
	    
	    
	    double weight = 92.59; 
	    double height = 39.37; 
	    
	    
	    double expectedBMI = weight * 703 / (height * height);
	    double actualBMI = patientData.calculateBMI(weight, height);
	    
	    assertEquals(expectedBMI, actualBMI, 0.01);
	}
	/**
	 * Test method to verify the incorrect BMI calculation.
	 */

	@Test
	public void testIncorretcBMI() {
		MyHealthDataBase patientData = new MyHealthDataBase();
		
		
	    double weight = 92.59; 
	    double height = 39.37; 
	    
	    
	    double expectedIncorrectBMI = weight * 703 / 1; 
	    double actualIncorrectBMI = patientData.incorectBMI(weight, height);
	    
	    
	    assertEquals(expectedIncorrectBMI, actualIncorrectBMI, 0.01);
	    
	 }
}






