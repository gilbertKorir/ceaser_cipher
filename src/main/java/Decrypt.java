public class Decrypt {

    private String mLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String mInitialmessage;
    private StringBuilder myDecription = new StringBuilder("");
    private int currLetter;
    private int newIndex;
    private int mKey;
    private char decryptedLetter;
    private char[] mOriginalArray;

    public String Decrypt(String message,int key){
        this.mInitialmessage = message.toUpperCase();
        mKey=key;
        mOriginalArray=mInitialmessage.toCharArray();

        for(int i=0;i<mOriginalArray.length;i++){

            currLetter=mLetters.indexOf(mOriginalArray[i]);

            if (currLetter!=-1){

                newIndex=(currLetter + mKey)%26;

                if(newIndex > 26){
                    newIndex-=26;
                    decryptedLetter=mLetters.charAt(newIndex);
                    myDecription.append(decryptedLetter);                    }
                else {
                    decryptedLetter=mLetters.charAt(newIndex);
                    myDecription.append(decryptedLetter);
                }
            }
        }
        return myDecription.toString();
    }
    public String getmyDEcription() {
        return myDecription.toString();
    }

}