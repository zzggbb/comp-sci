import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class VowelsNoComments {
    public static void main(String[] args) {
        final String INFILE = "poetry.txt";
        final String OUTFILE = "BRADLEY_ZANE_dentist.txt";
        final String[] VOWELS = {"a","e","i","o","u"};
        int[] vowelCount =      { 0,  0,  0,  0,  0 };
        try {
            File input = new File(INFILE);
            Scanner read = new Scanner(input);
            FileWriter output = new FileWriter(OUTFILE);
            while (read.hasNext()) {
                String line = read.nextLine();
                System.out.print(line + '\n');
                output.write(line.replace(' ','~') + "\r\n");
                for (int i=0; i<line.length(); i++) {
                    for (int v=0; v<5; v++){
                        String letter = (line.charAt(i)+"").toLowerCase();
                        if ((letter.equals(VOWELS[v]))) {
                            vowelCount[v]++;
                        }
                    }
                }
            }
            output.write("\r\n");
            for (int v=0; v<5; v++) {
                output.write("Count of "+VOWELS[v]+": "+vowelCount[v]+"\r\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Provided input file not found...");
        }
    }
}