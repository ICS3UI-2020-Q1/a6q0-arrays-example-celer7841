import java.util.Scanner;
/**
 * Calculate the average from 5 grades
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make the Scanner for input
    Scanner input = new Scanner(System.in);

    // create the array to store the grades
    double[] grades = new double[5];

    // use a for loop to get all the grades from the user
    for(int i = 0; i < grades.length; i++){
      // ask the user for a grade
      System.out.println("Enter mark " + (i + 1));
      // fill the array with a value 
      grades[i] = input.nextDouble();
    }

    // create a variable to store the total of all grades
    double total = 0;
    // use the for loop too add each value to total
    for(int i = 0; i < grades.length; i++){
      // add each group into total 
      total = total + grades[i];
    }

    // calculate the average
    double average = total/grades.length;

    // let the user know the average
    System.out.println("Your average mark is " + average);

    grades[2] = grades[0] + grades[1];
  
    
  }
}
