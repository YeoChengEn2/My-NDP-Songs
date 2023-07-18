package sg.edu.rp.c346.id22022416.myndpsongs;

import androidx.annotation.NonNull;

public class SecondActivity {
    private String title;
    private String year;
    private String stars;
    private String singer;

    public SecondActivity(String title, String year, String stars, String singer) {
        this.title = title;
        this.year = year;
        this.stars = stars;
        this.singer = singer;
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

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return title + year + stars + singer;
    }
}