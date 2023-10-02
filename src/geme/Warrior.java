package geme;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int coef = random.nextInt(1,3) +getDamage();
        boss.setHealth(boss.getHealth() - coef);
        System.out.println(this.getName() + " hist critical " + coef);
    }
}
