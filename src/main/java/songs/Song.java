package songs;

public class Song {

    private String title;
    private String duration;
    private int releaseYear;

    public Song(String title, String duration, int releaseYear) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
