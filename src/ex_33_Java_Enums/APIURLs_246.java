package ex_33_Java_Enums;

public enum APIURLs_246 {

    vwo("https://app.vwo.com"),
    katalon("https://katalon.com/"),
    google("https://www.google.com/");


    private String url;

    APIURLs_246(String url){
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }


}
