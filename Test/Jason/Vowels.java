//name:    Jason Tsai
//
//title:   Vowels.java
//
//purpose: To utilize the exceptions and use simple IO functions and to also use some of the methods from the String() class

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Vowels {
    public static void main (String[] args){
        try {
            //creating objects and integers

            File fileName = new File ("poetry.txt");
            Scanner inFile = new Scanner(fileName);
            FileWriter outFile = new FileWriter ("TSAI_JASON_dentist.txt");
            int aVowel = 0;
            int eVowel = 0;
            int oVowel = 0;
            int iVowel = 0;
            int uVowel = 0;
            //checks if theres a next line in the file
            while(inFile.hasNext()){
                String printPoetry = inFile.nextLine();
                System.out.println(printPoetry);
                //for loop to count all the vowels
                for (int i = 0; i < printPoetry.length(); i++){
                    char a = printPoetry.charAt(i);
                    if (a == 'a'){
                        aVowel ++;
                    }
                    else if (a == 'e'){
                        eVowel ++;
                    }
                    else if (a == 'o'){
                        oVowel ++;
                    }
                    else if (a == 'i'){
                        iVowel ++;
                    }
                    else if (a == 'u'){
                        uVowel ++;
                    }
                }

                String replace = printPoetry.replace(' ', '~');
                outFile.write(replace);
                outFile.write("\r\n");
            }
            String temp;
            outFile.write("\r\n");
            temp = "A: " + aVowel + "\n";
            outFile.write(temp);
            temp = "E: " + eVowel + "\n";
            outFile.write(temp);
            temp = "I: " + iVowel + "\n";
            outFile.write(temp);
            temp = "O: " + oVowel + "\n";
            outFile.write(temp);
            temp = "U: " + uVowel + "\n";
            outFile.write(temp);

            outFile.close();

        //catch exception phrase
        } catch (IOException x) {
            System.out.println("An error occured while trying to run the program: " + x.getMessage());
        }
    }
}