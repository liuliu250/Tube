import java.util.ArrayList;
import java.util.List;

public class Game {

    public String name;
    public String type;

    public List<String> goods;

    public Game(String name, String type, List<String> goods) {
        this.name = name;
        this.type = type;
        this.goods = goods;
    }

    public static final Game BangDream = new Game("BanG Dream!", "节奏游戏",
            List.of("Poppin'Party", "Afterglow", "Pastel*Palettes", "Roselia", "Hello, Happy World!", "Morfonica", "RAISE A SUILEN"));
    public static final Game Arknights = new Game("明日方舟", "塔防游戏",
            List.of("能天使", "推进之王", "艾雅法拉", "陈", "莫斯提马"));
    public static final Game HeartsOfIronIV = new Game("钢铁雄心四", "战略游戏",
            List.of("德国", "苏联", "美国", "英国", "日本"));

}
