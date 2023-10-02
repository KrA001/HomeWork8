package geme;

public class Golem extends Hero{
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
