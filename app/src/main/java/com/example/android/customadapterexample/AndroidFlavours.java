package com.example.android.customadapterexample;

/**
 * Created by Francislainy on 27/12/2016.
 */

public class AndroidFlavours {

    private String title;
    private String api_number;
    private int imageFlavour;

    public AndroidFlavours(String title, String api_number, int imageFlavour) {
        this.title = title;
        this.api_number = api_number;
        this.imageFlavour = imageFlavour;
    }

    public String getApi_number() {
        return api_number;
    }

    public void setApi_number(String api_number) {
        this.api_number = api_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageFlavour() {
        return imageFlavour;
    }

    public void setImageFlavour(int imageFlavour) {
        this.imageFlavour = imageFlavour;
    }

}
