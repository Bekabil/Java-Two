
/**
 * Name:	Bekabil Tolassa
 * Class:	ICS 141, Java-Two
 * Project: This program is computing mean and standard variation.
 *          This program prompt user to enter 10 double type numbers.
 * 			First, method mean will be called to compute mean.
 *          Second, methods variation will be called to compute variation
 *          This program uses JOption dialog boxes for input and output
 */
//imports class decimal format and JOptionPane
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//class compute deviation
public class ComputeDeviation {
    //variable average is declared and available for methods to access
    static protected double average;

    //main method
    public static void main(String[] args) {

        //meanDeviaiationFormat is type DecimalFormat
        DecimalFormat meanDeviationFormat = new DecimalFormat("##.#####");

        //array declaration with 10 allocation
        double[] arrayScores = new double[10];
       
        
        
        //loop 10 times, prompt the user fill up arrayScores
        for (int i = 0; i < arrayScores.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter students' score: ",
                "The Standard Deviation and Mean Calculator", JOptionPane.QUESTION_MESSAGE);
            //input is converted to double data type
            arrayScores[i] = Double.parseDouble(input);
        }

        //method mean is called and the value is stored in average
        average = mean(arrayScores);

        //output is string type storing information to be printed to message box 
        String output = "\n  The Mean is  " + meanDeviationFormat.format(average) +
            "\n  The Standard deviation is: " + meanDeviationFormat.format(deviation(arrayScores));

        //men and deviation are printed out to message dialog box	
        JOptionPane.showMessageDialog(null, output, "The Standard Deviation and Mean Calculator",

            JOptionPane.INFORMATION_MESSAGE);

    }

    /*
     * method mean returns double type
     * input: double type array
     * output: double type mean
     * the method go through array and
     * add the values, and finds the mean
     */

    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }
        return sum / array.length;
    }

    /*
     * method deviation is returning double type
     * input: double type array
     * output: double type standard deviation
     * the method go through array to use each
     * input to use is to calculate standard
     * deviation, value of mean in average
     * will be used for this computation.
     */

    public static double deviation(double[] array) {

        double difference, squaredSum = 0;


        for (int i = 0; i < array.length; i++) {

            difference = array[i] - average;
            squaredSum += Math.pow(difference, 2);
        }


        return Math.sqrt(squaredSum / (array.length - 1));

    }




}