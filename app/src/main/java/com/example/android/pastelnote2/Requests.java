package com.example.android.pastelnote2;

import androidx.annotation.NonNull;

public class Requests Implements Serializable{

    private String title;
    private String content;

    private String key;

    public Requests(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Requests() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @NonNull
    @Override
    public String toString() {
        return ""+title+"\n" +
                ""+content;
    }
}
