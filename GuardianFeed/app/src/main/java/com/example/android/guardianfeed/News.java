package com.example.android.guardianfeed;

/**
 * An {@link News} object contains information related to a single News.
 */
public class News {

    private String section;

    private String title;

    private String dateTimeAsString;

    private String author;

    private String link;

    public News(String sectionInput, String titleInput, String dateTimeAsStringInput, String authorInput, String linkInput) {
        section = sectionInput;
        title = titleInput;
        dateTimeAsString = dateTimeAsStringInput;
        author = authorInput;
        link = linkInput;
    }

    public String getSection() { return section;}

    public String getTitle() { return title;}

    public String getDateTimeAsString() { return dateTimeAsString;}

    public String getAuthor() { return author;}

    public String getLink() { return link;}

}

