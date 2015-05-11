public class Watchable {

    private int runtime;
    private String releaseDate;
    private String director;

    //constructor func
    public Watchable(int runtime, String releaseDate, String director) {
        this.runtime = runtime;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    //getters
    public static int getRuntime() {return this.runtime};
    public static String getReleaseDate() {return this.releaseDate};
    public static String getDirector() {return this.director};

    //setters
    public static void setRuntime(int runtime) {this.runtime = runtime};
    public static void setReleaseDate(String releaseDate) {this.releaseDate = releaseDate};
    public static void setDirector(String director) {this.director = director};}
}