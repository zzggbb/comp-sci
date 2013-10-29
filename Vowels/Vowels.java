import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Vowels {

    public static void main(String[] args) {

        final String INFILE = "poetry.txt";
        final String OUTFILE = "BRADLEY_ZANE_dentist.txt";
        final String[] VOWELS = {"a","e","i","o","u"}; // not this time, y
        int[] vowelCount =      { 0,  0,  0,  0,  0 };

        try {

            // instantiate file io objects
            File input = new File(INFILE);
            Scanner read = new Scanner(input);
            FileWriter output = new FileWriter(OUTFILE);

            // main loop
            // for every iteration of the loop, grap the next line, so long as
            // there is one, and do stuff with it
            while (read.hasNext()) {
                String line = read.nextLine();

                // output the current line to the monitor with a new line because
                // nextLine() only goes UP TO the newline, but does not include
                // it write to the output file the current line, with all spaces
                // converted to tildes (~) and append '\r\n' to keep output
                // consistent across UNIX, OSX and Windows
                System.out.print(line + '\n');
                output.write(line.replace(' ','~') + "\r\n");

                // vowel counting code
                // for every character in the current line, if it equals the
                // current that we are checking (defined by 'v'), increment the
                // 'v' vowel index of vowelcount
                for (int i=0; i<line.length(); i++) {
                    for (int v=0; v<5; v++){
                        String letter = line.charAt(i)+"").toLowerCase();
                        if ((letter.equals(VOWELS[v])) {
                            vowelCount[v]++;
                        }
                    }
                }
            }

            // Sum up the findings of the vowel counting code by simultaneously
            // looping through the contents of 'vowelCount' and 'VOWELS'
            output.write("\r\n");
            for (int v=0; v<5; v++) {
                output.write("Count of"+VOWELS[v]+": "+vowelCount[v]+'\r\n');
            }

            output.close();

        } catch (Exception e) {
            System.out.println("Provided input file not found...");
        }
    }
}