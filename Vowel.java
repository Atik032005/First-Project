import java.util.Scanner;

public class Vowel {
    public static void main(String [] args) {

        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a chracter:");
        ch = input.next().charAt(0);

        if(ch == 'a') {
            System.out.println("Vowel");
        }

        else if(ch == 'e') {
            System.out.println("Vowel");
        }

        else if(ch == 'i') {
            System.out.println("Vowel");
        }

        else if(ch == 'o') {
            System.out.println("Vowel");
        }

        else if(ch == 'u') {
            System.out.println("Vowel");
        }

        else {
            System.out.println("Consonant");
        }


    }
    
}
