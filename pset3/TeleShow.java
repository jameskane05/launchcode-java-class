public class TeleShow extends Watchable {

    private String network;
    private int season;
    private int episode;

    public TeleShow(int runtime, String releaseDate, String director, String network, int season, int episode) {
        super(runtime, releaseDate, director);
        this.network = network;
        this.season = season;
        this.episode = episode;
    }

    //getters
    public static String getNetwork() {return this.network};
    public static int getSeason() {return this.season};
    public static int getEpisode() {return this.episode};

    //setters
    public static void setNetwork(String network) {this.network = network};
    public static void setSeason(String season) {this.season = season};
    public static void setEpisode(String episode) {this.episode = episode};
}