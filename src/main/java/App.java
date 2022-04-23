import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Prompting for entry of the text to be encrypted.
        System.out.println("Enter the text to be Encrypted");
        scan.nextLine();

        String msgEncipher = scan.nextLine();
        System.out.println("Enter a number between 1 and 25 to shift your message");
        int encipherKey = scan.nextInt();
        if(encipherKey > 0 && encipherKey <=25){
            Ceaser ceaser = new Ceaser(msgEncipher, encipherKey);
            Encipher encipher = new Encipher();
            encipher.Encipher(ceaser.getmMessage(), ceaser.getmKey());

            System.out.println(".............................................");
            System.out.println("Original Text: " + ceaser.getmMessage());
            System.out.println("Encrypted message: " + ceaser.getEncipheredText());
            System.out.println("..............................................");
        }
    }
}