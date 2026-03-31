import org.jetbrains.annotations.Nullable;

import static java.lang.Math.abs;

public class Human {

    public String name;
    public int age;

    public Place School;
    public boolean isMale;
    public boolean isMarried;

    @Nullable
    public Buff buff;

    public Game favGame;

    public Human(String name, int age, Place School, boolean isMale, boolean isMarried, Game favGame) {
        this.name = name;
        this.age = age;
        this.School = School;
        this.isMale = isMale;
        this.isMarried = isMarried;
        this.favGame = favGame;
    }

    public float getLength() {
        return 7.0f + abs(hashCode() % 10);
    }

}
