package Types;

import java.util.Objects;

public class Movie {
    private String title;
    private String director;
    private String ID;

    public Movie(String title, String director, String ID) {
        this.title = title;
        this.director = director;
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(director, movie.director) && Objects.equals(ID, movie.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, ID);
    }

    @Override
    public String toString() {
        return "title= " + title + "\n" +
                ", director= " + director + "\n" +
                ", ID= " + ID;
    }
}
