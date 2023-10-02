package geme;

import java.util.Random;

public class Berserk extends Hero{
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.ABSORPTION, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int absortion = random.nextInt(boss.getDamage() / 2);
        setDamage(20);
        if (getHealth() > 0) {
            setDamage(getDamage() + absortion);
            System.out.println("Berserk work " + absortion);
        }
    }
}
