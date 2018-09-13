package com.rabbi.tarikul.recyclerviewict;

public class NewsDetails {
    private String textviewTitle, textViewDetails, webUrl;
    private int image;

    public NewsDetails(String textviewTitle, String webUrl, String textViewDetails, int image) {
        this.textviewTitle = textviewTitle;
        this.textViewDetails = textViewDetails;
        this.webUrl = webUrl;
        this.image = image;
    }

    public String getTextviewTitle() {
        return textviewTitle;
    }

    public void setTextviewTitle(String textviewTitle) {
        this.textviewTitle = textviewTitle;
    }

    public String getTextViewDetails() {
        return textViewDetails;
    }

    public void setTextViewDetails(String textViewDetails) {
        this.textViewDetails = textViewDetails;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
