package geme;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int boostDamage = 1;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + boostDamage);
            if (heroes[i].getName() == "Medic") {
                heroes[i].setDamage(0);
            }
        }
        System.out.println(this.getName() + "USE IMPROVE DAMGE - " + boostDamage);
    }

}
