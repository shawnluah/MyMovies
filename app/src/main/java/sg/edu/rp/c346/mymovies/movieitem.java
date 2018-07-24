package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

/**
 * Created by 17010564 on 24/7/2018.
 */

public class movieitem {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;
    private boolean pg13;

    public movieitem(String title, String year, String genre, boolean pg13) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.pg13 = pg13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getDateString() {
        String str = watched_on.get(Calendar.DAY_OF_MONTH)+"/"+watched_on.get(Calendar.MONTH)+"/"+watched_on.get(Calendar.YEAR);
        return str;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPg13() {
        return pg13;
    }

    public void setPg13(boolean pg13) {
        this.pg13 = pg13;
    }

    @Override
    public String toString() {
        return "movieItem{" +
                "title='" + title + '\'' + ", date=" + getDateString()+ ", pg13=" + pg13 + "}"
                ;
    }
}
