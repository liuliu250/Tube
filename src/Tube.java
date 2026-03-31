public class Tube extends Human implements DoLove{

    private Tube(String name, int age, Place School, boolean isMale, boolean isMarried, Game favGame) {
        super(name, age, School, isMale, isMarried, favGame);
    }

    private static final Tube ShuiGuan = new Tube("水管", 18,
            new Place("电子科技大学（沙河校区）", "建设路", false),
            true, false, Game.Arknights);

    public static Tube getShuiGuan() {
        return ShuiGuan;
    }

    @Override
    public void givePresent(Human human) {
        if (!human.isMale && !human.isMarried) {

        }
    }

    @Override
    public void doLove(Human human) {
        if (this.School.isDoLovable && !this.isMarried) {
            if (this.getLength() >= human.getLength()) {
                System.out.println("水管和" + human.name + "谈恋爱了");
            } else {
                System.out.println("水管觉得" + human.name + "不够配");
            }
        } else {
            System.out.println("水管不想谈恋爱了");
        }
    }
}