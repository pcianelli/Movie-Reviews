package Types;

public class Movie {
    private String title;
    private String director;
    private int ID;

    public Movie(String title, String director, int ID) {
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
