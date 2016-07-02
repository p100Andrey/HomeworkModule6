package Homework6.Exercise5;

public class WrongGoodsAreMissingException extends Exception {
    private String wrongKey;

    public WrongGoodsAreMissingException(String wrongKey) {
        this.wrongKey = wrongKey;
    }

    public String getWrongKey() {
        return wrongKey;
    }
}
