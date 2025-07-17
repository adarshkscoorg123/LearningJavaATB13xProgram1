package ex_33_Java_Enums;

public enum Colors_245 {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    Colors_245(String hexCode) {
        this.hexCode = hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }

    private String hexCode;


}
