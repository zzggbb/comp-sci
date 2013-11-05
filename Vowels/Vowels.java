import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Vowels {
    public static void main(String[] args) {

        final String INFILE  = "poetry.txt";
        final String OUTFILE = "BRADLEY_ZANE_dentist.txt";
        final String LETTERS = "aeiou";
        int[] letterCount    = new int[LETTERS.length()];

        try {

            // instantiate file io objects
            Scanner input = new Scanner(new File(INFILE));
            FileWriter output = new FileWriter(OUTFILE);

            // main loop
            // for every iteration of the loop, grap the next line, so long as
            // there is one, and do stuff with the line.
            while (input.hasNext()) {
                String line = input.nextLine();

                // Print the current line to the monitor
                System.out.println(line);

                // Write the current line to the output file, with all spaces
                // converted to tildes (~) and '\r\n' appended to keep output
                // consistent across *NIX, OSX and Windows.

                // not so nice
                for (int i=0; i<line.length(); i++){
                    if (line.charAt(i) == ' '){
                        output.write('~');
                    } else {
                        output.write(line.charAt(i));
                    }
                }
                output.write("\r\n");
                // much nicer...
                // output.write(line.replace(' ','~') + "\r\n");

                // letter counting code
                // loop through character in the current line and check if it
                // equals the current letter that we are checking. If it does,
                // increment the appropriate value of the 'letterCount' array.
                for (int i=0; i<line.length(); i++) {
                    for (int v=0; v<5; v++){
<<<<<<< HEAD
                        char letter = line.toLowerCase().charAt(i);
                        if (letter == LETTERS.charAt(v)) {
                            letterCount[v]++;
=======
                        String letter = (line.charAt(i)+"").toLowerCase();
                        if ((letter.equals(VOWELS[v]))) {
                            vowelCount[v]++;
>>>>>>> 19b9b8e4d22469b2439d9acc9ed07999e64d0778
                        }
                    }
                }
            }

            // Sum up the findings of the letter counting code by simultaneously
            // looping through the contents of 'letterCount' and 'LETTERS' and
            // and displaying a letter and its corresponding count.
            output.write("\r\n");
            for (int v=0; v<5; v++) {
<<<<<<< HEAD
                output.write("Count of "+LETTERS.charAt(v)+": "+letterCount[v]+"\r\n");
=======
                output.write("Count of "+VOWELS[v]+": "+vowelCount[v]+"\r\n");
>>>>>>> 19b9b8e4d22469b2439d9acc9ed07999e64d0778
            }

            output.close();

        } catch (Exception e) {
            System.out.println("Provided input file not found...");
        }
    }
}