/*package edu.gatech.oad.antlab.person;*/

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
	  name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      char[] array = new char[input.length()];
      for (int i = 0, n = input.length(); i < n; i++) {      
    	  	char c = input.charAt(i);
            char newChar = (char)(c+1);
            System.out.println(newChar);
            array[i] = newChar;
        }
     
      return new String(array);
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
      
    }
    
    public static void main(String[] args) {
        Person4 person = new Person4("sarah");
        String newTest = person.toString("abc123");
        String testCalc = person.calc("abc123");
        System.out.println(testCalc);
        System.out.println(newTest);

     }
    
  
}

