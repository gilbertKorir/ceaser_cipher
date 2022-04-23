import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        scan.nextLine();

        System.out.println("___________________________________");
        System.out.println("Welcome to Caesar cipher Platform");
        System.out.println("Enter message to encrypt: ");
        String msgEncrypt=scan.nextLine();
        System.out.println("Enter encryption key between 1 and 25");
        int encryptKey=scan.nextInt();
        if(encryptKey>0 && encryptKey<=25) {
            Ceaser caesar = new Ceaser(msgEncrypt, encryptKey);
            Encrypt encrypt = new Encrypt();
            encrypt.Encrypt(caesar.getMessage(), caesar.getKey());
            Decrypt decrypt = new Decrypt();
            decrypt.Decrypt(encrypt.getmyEncription(), caesar.getKey());

            System.out.println("----------------------");
            System.out.println("Input Message : " + caesar.getMessage());
            System.out.println("Encrypted Message : " + encrypt.getmyEncription());
            System.out.println("Decrypted Message : " + decrypt.getmyDEcription());
            System.out.println("---------------------------");
        }
        else{
            System.out.println("The key entered is Wrong Re-run the program....");
        }
    }
}