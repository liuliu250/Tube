public class Tube extends Human implements DoLove{

    private Tube(String name, int age, Place School, boolean isMale, boolean isMarried, Game favGame) {
        super(name, age, School, isMale, isMarried);
    }

    private static Tube ShuiGuan = new Tube("水管", 18, new Place("电子科技大学（沙河校区）", "建设路", false), true, false, );

    public static Tube getShuiGuan() {
        return ShuiGuan;
    }

    @Override
    public void givePresent(Human human) {
        if (!human.isMale && !human.isMarried) {

        }
    }

    @Override
    public void doLove() {
        if (this.School.isDoLovable && !this.isMarried) {

        }
    }
}