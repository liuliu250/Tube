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
            boolean isSameInterest = Utils.hasSameItemInList("Pastel*Palettes", human.favGame.goods);
            if (isSameInterest) {
                System.out.println("水管送了冰川日菜给"+human.name);
            } else {
                System.out.println("水管送了一个"+Game.HeartsOfIronIV+"给"+human.name);
            }
        } else {
            System.out.println("水管送礼物被拒绝了");
        }
    }

    @Override
    public void doLove(Human human) {
        if (this.School.isDoLovable && !this.isMarried) {
            if (this.getLength() >= human.getLength()) {
                System.out.println("水管和" + human.name + "做了");
            } else {
                System.out.println("水管觉得" + human.name + "不够配");
            }
        } else {
            System.out.println("水管不想做爱了");
        }
    }
}