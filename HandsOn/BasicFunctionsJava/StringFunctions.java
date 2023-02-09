package BasicFunctionsJava;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {

        String originalStatement = "Words are, in my not so humble opinion, our most inexhaustible source of magic, capable of both influencing injury, and remedying it.";

        String function1 = originalStatement.toLowerCase(); //Convert all string to lower case
        String function2 = originalStatement.toUpperCase(); //Convert all string to upper case
        String function3 = originalStatement.trim(); //remove spaces at start and end
        String function4 = originalStatement.substring(2); //remove chars before 2 index position
        String function5 = originalStatement.substring(0,5); //Leaves chars between 0 and 5 index position
        String function6 = originalStatement.replace("T", "t"); //Replace T for t
        String function7 = originalStatement.replace("opinion", "feeling"); //Replace more than one char
        int index = originalStatement.indexOf("inexhaustible");

        System.out.printf("Your original statement is #%s#%n" +
                "To Lower Case: #%s#%n" +
                "To Upper Case: #%s#%n" +
                "Trim: #%s#%n" +
                "Substring arg=(2): #%s#%n" +
                "Substring arg=(0, 5): #%s#%n" +
                "Replace T for t: #%s#%n" +
                "Replace opinion for feeling: #%s#%n" +
                "The 'inexhaustible' word starts at %d position%n",
                originalStatement,
                function1,
                function2,
                function3,
                function4,
                function5,
                function6,
                function7,
                index
        );
    }
}
