import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 24/09/2019
 */

public class Loekker {

    public static void main(String[] args) {

        /** Der er 4 slags løkker i Java
         *  for, while, do while
         */

        // For løkke fra 0 til 100
        for (int i = 0; i <=100; i++) {
            System.out.println(i);
        }

        // For løkke fra -2 til -1000
        for (int i = -2; i >= -1000; i--) {
            System.out.println(i);
        }

        // For løkke fra 42 til og med 77 med 5
        for (int i = 42; i <=77; i=i+5) {
            System.out.println(i);
        }

        /* While løkke */
        int w = 0;
        while ( w < 10) {
            w = w + 1;
            System.out.println("Hej " + w);
        }

        Scanner scanner = new Scanner(System.in);
        String besked;
        besked ="";
        /* Så længe besked ikke er exit, så indlæs nye beskeder */
        while (!besked.equals("nu er det slut!")) {
            besked = scanner.nextLine();
            System.out.println(besked+besked);
        }

        /* Denne køres ikke */
        // while(false) {
        //     System.out.println("Noget hemmeligt");
        // }

        /* Do while løkke */
        do {
            System.out.println("Noget hemmeligt2");

        } while (false);

                /* Foreach */
        String[] strArray = {"Sune", "Mathias", "Tommy", "Henrik", "Simon"};
        for (String element : strArray)
        {
            System.out.println(element);
        }

    }

}
