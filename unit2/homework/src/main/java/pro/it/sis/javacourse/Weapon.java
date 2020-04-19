package pro.it.sis.javacourse;

public abstract class Weapon {
    void hit(Target target) {
    target.gottenDamage = getGivenDamage();
    }

    public abstract Damage getGivenDamage();
}
