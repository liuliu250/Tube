import java.util.List;

public class GameMods extends Game {

    public Game parentGame;

    public GameMods(String name, String type, List<String> goods, Game parentGame) {
        super(name, type, goods);
        this.parentGame = parentGame;
    }

    public static final GameMods TheNewOrder = new GameMods("The New Order", "战略游戏",
            List.of("德国", "俄罗斯地区", "美国", "英国", "日本"), Game.HeartsOfIronIV);

}
