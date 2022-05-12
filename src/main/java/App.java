import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        scan.nextLine();
        boolean encode=true;
        while (encode){
            System.out.println("Welcome to the Caesar Cipher");
            System.out.println("Do you want to Encrypt or Decrypt or Exit");
            String navigate =scan.next();
            scan.nextLine();

            if(navigate.equals("Encrypt")){
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
         else if(navigate.equals("Decrypt")){
            System.out.println("___________________________________");
            System.out.println("Welcome to Caesar cipher Decrypt");
            System.out.println("Enter message to Decrypt");
            String msgDecrypt=scan.nextLine();
            System.out.println("Enter Decryption key between 1 and 25");
            int decryptKey=scan.nextInt();
            if(decryptKey>=1 && decryptKey<=25){
                Ceaser caesar=new Ceaser(msgDecrypt,decryptKey);
                Decrypt decrypt=new Decrypt();
                decrypt.Decrypt(caesar.getMessage(),caesar.getKey());
                Encrypt encrypt=new Encrypt();
                encrypt.Encrypt(decrypt.getmyDEcription(),caesar.getKey());
                System.out.println("----------------------");
                System.out.println("Input Message : "+caesar.getMessage());
                System.out.println("Decrypted Message : "+decrypt.getmyDEcription());
                System.out.println("Encrypted Message : "+encrypt.getmyEncription());
                System.out.println("--------------------------");
            }
            else {
                System.out.println("key must be between 1 and 25");
            }

        }
        else if(navigate.equals("Exit")){
            encode=false;
        }
        else {
            System.out.println("No option like that");
        }
    }
        }
}