import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        scan.nextLine();

        System.out.println("___________________________________");
        System.out.println("Welcome to Caesar cipher Encrypt");
        System.out.println("Enter message to encrypt");
        String msgEncrypt=scan.nextLine();
        System.out.println("Enter encryption key between 1 and 25");
        int encryptKey=scan.nextInt();
        if(encryptKey>0 && encryptKey<=25) {
            Ceaser caesar = new Ceaser(msgEncrypt, encryptKey);
            Encrypt encrypt = new Encrypt();
            encrypt.Encrypt(caesar.getmMessage(), caesar.getmKey());
            Decrypt decrypt = new Decrypt();
            decrypt.Decrypt(encrypt.getmEncryptedMessage(), caesar.getmKey());

            System.out.println("----------------------");
            System.out.println("Input Message : " + caesar.getmMessage());
            System.out.println("Encrypted Message : " + encrypt.getmEncryptedMessage());
            System.out.println("Decrypted Message : " + decrypt.getmDecryptedMessage());
            System.out.println("---------------------------");
        }
    }
}