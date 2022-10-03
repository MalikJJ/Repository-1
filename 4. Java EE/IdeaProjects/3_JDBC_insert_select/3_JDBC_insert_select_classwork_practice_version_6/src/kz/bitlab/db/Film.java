package kz.bitlab.db;

public class Film {

    private int id;
    private String name;
    private String description;
    private String genre;
    private int year;
    private int duration;
    private double rating;

    public Film() {
    }

    public Film(int id, String name, String description, String genre, int year, int duration, double rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
