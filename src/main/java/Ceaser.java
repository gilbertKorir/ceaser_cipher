public class Ceaser {

    private String mMessage;
    private int mKey;
    public Ceaser(String mMessage, int mKey) {
        this.mMessage = mMessage.toUpperCase();
        this.mKey = mKey;
    }

    public String getmMessage() {
        return mMessage;
    }

    public int getmKey() {
        return mKey;
    }
}
