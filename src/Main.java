/*
22195124 Metin Kutay Demirci

We use a simple mathematical algorithm to convert decimal to hexadecimal:

1- Divide the integer by 16,
2- Divide the result of division by 16,
3- Take the remainder of the division and convert it to a hexadecimal digit,
4- Repeat steps one and two until the result of the division is 0,
5- Reverse the hexadecimal string.

*/

import java.util.Scanner;
public class Main {


    static String decToHex(int n)
    {
        char [] hexaValues = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuilder conversionResult = new StringBuilder();

        while(n > 0){
            int digit = n % 16;
            conversionResult.append(hexaValues[digit]);
            n = n/16;

        }

        return conversionResult.reverse().toString();


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Enter a decimal value for hexadecimal conversion. -1 for exit \n");

            try {
                int x = sc.nextInt();
                if(x==-1) break;
                String result = decToHex(x);
                System.out.println(result);
            }
            catch(Exception e){
                System.out.println("Please enter a valid decimal \n");
                sc.next();
            }


        }
        System.out.println("Bye");

    }
}