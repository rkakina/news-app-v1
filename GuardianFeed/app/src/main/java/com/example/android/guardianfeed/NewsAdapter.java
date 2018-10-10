package com.example.android.guardianfeed;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each News
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param articles is the list of News, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the News at the given position
     * in the list of News.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the News at the given position in the list of News
        News currentArticle = getItem(position);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(currentArticle.getSection());

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentArticle.getTitle());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentArticle.getDateTimeAsString());

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentArticle.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

//insert code for FormatDate() here.


}
