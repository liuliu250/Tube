public class Game {

    public String name;
    public String type;

    public String[] goods;

    public Game(String name, String type, String goods) {
        this.name = name;
        this.type = type;
        this.goods = new String[]{goods};
    }

    public Game BangDream = new Game("BanG Dream!", "节奏游戏", "冰川日菜");
    public Game Arknights = new Game("明日方舟", "塔防游戏", "能天使");

}
