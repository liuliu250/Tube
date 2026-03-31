public class Seven extends Human{

    private Seven(String name, int age, Place School, boolean isMale, boolean isMarried, Game favGame) {
        super(name, age, School, isMale, isMarried, favGame);
    }

    private static Seven QiJie = new Seven("琪姐", 18,
            new Place("电子科技大学（沙河校区）", "建设路", false),
            false, false, Game.BangDream);

    public static Seven getQiJie() {
        return QiJie;
    }

}
