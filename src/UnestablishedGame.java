import java.util.Date;
import java.util.List;

public class UnestablishedGame extends Game {
    public Date releaseDate;
    public UnestablishedGame(String name, String type, List<String> goods, Date releaseDate) {
        super(name, type, goods);
        this.releaseDate = releaseDate;
    }

    public static final UnestablishedGame GirlsBandCry = null;

}
