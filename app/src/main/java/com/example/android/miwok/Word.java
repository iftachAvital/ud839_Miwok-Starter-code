package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE = -1;

    private String mBaseWord;
    private String mTranslatedWord;
    private int mImageResourceId;

    public Word(String translatedWord, String baseWord) {
        mBaseWord = baseWord;
        mTranslatedWord = translatedWord;
        mImageResourceId = NO_IMAGE;
    }

    public Word(String translatedWord, String baseWord, int imageResourceId) {
        mBaseWord = baseWord;
        mTranslatedWord = translatedWord;
        mImageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

    public String getBaseWord() {
        return mBaseWord;
    }

    public String getTranslatedWord() {
        return mTranslatedWord;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
