import lombok.Data;

@Data
public class Game {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private double na_sales;
    private double eu_sales;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private double other_sales;
    private double global_sales;
}
