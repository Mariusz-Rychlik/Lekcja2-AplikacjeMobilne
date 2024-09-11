//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.lang.Math;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\student\\Desktop\\Dane_PR2\\liczby.txt");
            Scanner myReader = new Scanner(myObj);
            int powerof3 = 0;
            int amountofSumoffact = 0;
            int Sumoffact = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int number = Integer.parseInt(data);


                // zadanie 4.1
                if (floor(Math.log(number)/Math.log(3))==Math.log(number)/Math.log(3)) {
                    powerof3 += 1;
                }

                // zadanie 4.2
                for (int i=0; i<data.length(); i++) {
                    int fact = 1;
                    int number2 = Integer.parseInt(String.valueOf(data.charAt(i)));
                    for (int j=1; j<number2; j++) {
                        fact = fact*j;
                    }
                    Sumoffact += fact;
                }
                if (Sumoffact == number) {
                    amountofSumoffact +=1;
                }
                Sumoffact =0;

                // zadanie 4.3
                int firstnumber,lenofnumbers,nwd = 0;



            }
            System.out.println("Zadanie 4.1");
            System.out.println(powerof3);

            System.out.println();
            System.out.println();

            System.out.println("Zadanie 4.2");
            System.out.println(amountofSumoffact);

            System.out.println();
            System.out.println();

            System.out.println("Zadanie 4.3");

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}