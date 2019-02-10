package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColor;
    private Context mContext;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mBackgroundColor = backgroundColor;
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Word currentWord = getItem(position);

        TextView firstTextView = listItemView.findViewById(R.id.first_text_view);
        TextView secondTextView = listItemView.findViewById(R.id.second_text_view);
        ImageView imageView = listItemView.findViewById(R.id.image_view);
        RelativeLayout textLayout = listItemView.findViewById(R.id.text_layout);

        firstTextView.setText(currentWord.getBaseWord());
        secondTextView.setText(currentWord.getTranslatedWord());
        textLayout.setBackgroundColor(mBackgroundColor);

        if (currentWord.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResourceId());
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
