package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {
            int sum = 0;
            try {
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));

                while (fileIn.hasNext()) {
                    String lineIn = fileIn.nextLine();
                    sum += Integer.parseInt(lineIn);

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println(sum);
            // Print out a running total of all the
            // values in the input file.
        }
}