public class Movie extends Watchable {

    private String studio;
    private int boxOfficeGross;

    public Movie (int runtime, String releaseDate, String director, String studio, int boxOfficeGross) {
        super(runtime, releaseDate, director);
        this.studio = studio;
        this.boxOfficeGross = boxOfficeGross;
    }

    //getters
    public static String getStudio() {return this.studio};
    public static int getBoxOfficeGross() {return this.boxOfficeGross};

    //setters
    public static void setStudio(String studio) {this.studio = studio};
    public static void setBoxOfficeGross(int boxOfficeGross) {this.boxOfficeGross = boxOfficeGross};
}