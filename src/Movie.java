public class Movie {
    private String title;
    private boolean isVip;
    private boolean is3D;

    public Movie(String title, boolean isVip, boolean is3D) {
        this.title = title;
        this.isVip = isVip;
        this.is3D = is3D;
    }

    public String getTitle() {
        return title;
    }

}