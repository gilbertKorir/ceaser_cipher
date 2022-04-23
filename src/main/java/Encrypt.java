public class Encrypt {

    private String mLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String mInitialmessage;
    private StringBuilder myEncription = new StringBuilder("");
    private int currLetter;
    private int newIndex;
    private int mKey;
    private char encryptedLetter;
    private char[] mOriginalArray;


//constructor:
    public String Encrypt(String message,int key){
        this.mInitialmessage = message.toUpperCase();
        mKey = key;
        mOriginalArray=mInitialmessage.toCharArray();

        for(int i=0;i<mOriginalArray.length;i++){

            currLetter = mLetters.indexOf(mOriginalArray[i]);
            if(currLetter!=-1){

                newIndex = (currLetter - mKey)%26;

                if(newIndex < 0){

                    newIndex += 26;
                    encryptedLetter = mLetters.charAt(newIndex);
                    myEncription.append(encryptedLetter);
                }
                else {
                    encryptedLetter = mLetters.charAt(newIndex);
                    myEncription.append(encryptedLetter);
                }
            }
        }
        return myEncription.toString();
    }

    public String getmyEncription() {
        return myEncription.toString();
    }
}