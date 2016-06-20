package Homework6.Exercise5;

public class WrongKeyException extends Exception {
    private String wrongKey;

    public WrongKeyException(String wrongKey) {
        this.wrongKey = wrongKey;
    }

    public String getWrongKey() {
        return wrongKey;
    }
}
