package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE = -1;

    private String mBaseWord;
    private String mTranslatedWord;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String translatedWord, String baseWord, int audioResourceId) {
        mBaseWord = baseWord;
        mTranslatedWord = translatedWord;
        mImageResourceId = NO_IMAGE;
        mAudioResourceId = audioResourceId;
    }

    public Word(String translatedWord, String baseWord, int imageResourceId, int audioResourceId) {
        mBaseWord = baseWord;
        mTranslatedWord = translatedWord;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
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

    @Override
    public String toString() {
        return "Word{" +
                "mBaseWord='" + mBaseWord + '\'' +
                ", mTranslatedWord='" + mTranslatedWord + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
