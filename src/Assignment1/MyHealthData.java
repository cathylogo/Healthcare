package Assignment1;
/**
 * MyHealtData share health records of patients to presents key information 
 * such as firstName,lastName,gender,etc and also health data 
 * (height,weight,BMI,heart rate and more)
 * MyHealthData class inherits from MyHealthDataBase, which provides BMI calculation.
 */
public class MyHealthData extends MyHealthDataBase{
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private final int currentYear;
	private double height;
	private double weight;
    
	/**
	 * generate constructor for the class with the given parameters
	 * @param firstName  the firstName of the patient
	 * @param lastName   the lastName of the patient
	 * @param gender     the gender of the patient
	 * @param birthYear  the birthYear of the patient
	 * @param currentYear the current year cannot be modified
	 * @param height      the height of the patient
	 * @param weight      the weight of the patient
	 */
	public MyHealthData(String firstName, String lastName, String gender, int birthYear,
		int currentYear,double height, double weight) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.birthYear=birthYear;
		this.currentYear=currentYear;
		this.height=height;
		this.weight=weight;
	};
    
	/**
	 * get the firstName of the patient
	 * @return  the firstName of the patient
	 */
	public String getFirstName(){
		return firstName;
	} 
	/**
	 * set the last Name of the patient
	 * @param firstName set the first Name
	 */
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	/**
	 * get the lastName of the patient
	 * @return the lastName of the patient
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * set the lastName of the patient
	 * @param lastName set the last name
	 */
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	/**
	 * get the gender of the patient
	 * @return the gender of the patient
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * set the gender of the patient
	 * @param gender set the gender
	 */
	public void setGender(String gender) {
		this.gender=gender;
	}
	/**
	 * get the birth year of the patient
	 * @return the birth year of the patient
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * set the birth year of the patient
	 * @param birthYear birthYear to be set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear=birthYear;
	}
	/**
	 * get the currentYear 
	 * @return the currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * get the height of the patient
	 * @return the height of the patient in inches
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * set the height of the patient 
	 * @param height the height to be set
	 */
	public void setHeight(double height) {
		this.height=height;
	}
	/**
	 * get the weight of the patient 
	 * @return the weight of the patient in pounds
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * set the weight of the patient 
	 * @param weight the weight to be set
	 */
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	
	/**
	 * Calculates the age of the patient based on the current year and their birth year.
	 * @return Age of the patient in years.
	 */
	public int getAge() {
        return currentYear - birthYear;
    }
	/**
	 * calculates the maximum heart rate of the patient based on the age 
	 * @return Maximum heart rate
	 */
    
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    /**
     * Calculate the Minimum target heart rate of the patient, which is 50%
     *  of the maximum heart rate 
     * @return the Minimum Target Heart 
     */
    public double getMinimumTargetHeartRate() {
        return 0.50 * getMaximumHeartRate();
    }
    /**
     * calculate the Maximum target heart rate of the patient, which is 85% of the 
     * Maximum heart rate
     * @return the Maximum target Heart
     */
    public double getMaximumTargetHeartRate() {
        return 0.85 * getMaximumHeartRate();
    }
    
	/**
	 * Display all the patient's health data 
	 * including the calculations
	 */
    public void displayMyHealthData(){
        System.out.printf("Patient Name: %s %s%n", getFirstName(), getLastName());
        System.out.printf("Gender: %s%n", getGender());
        System.out.printf("Year of Birth: %d%n", getBirthYear());
        System.out.printf("Height: %.2f inches%n", getHeight()); 
        System.out.printf("Weight: %.2f pounds%n", getWeight()); 
        System.out.printf("Age: %d years%n", getAge());
        System.out.printf("BMI: %.2f%n", calculateBMI(getWeight(), getHeight())); 
        System.out.printf("Maximum Heart Rate: %d bpm%n", getMaximumHeartRate());
        System.out.printf("Target Heart Rate Range: %.2f bpm - %.2f bpm%n", 
                          getMinimumTargetHeartRate(), getMaximumTargetHeartRate());

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

} 