public class Ceaser {

    private String mText;
    private int mKey;
    public Ceaser(String text, int mKey) {
        this.mText = text.toUpperCase();
        this.mKey = mKey;
    }

    public String getMessage() {
        return mText;
    }

    public int getKey() {
        return mKey;
    }
    public boolean isValid(){
        if ((mKey>0 && mKey < 26)){
            return true;
        }
        return false;
    }
}