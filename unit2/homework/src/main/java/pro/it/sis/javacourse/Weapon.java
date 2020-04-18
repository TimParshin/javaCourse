package pro.it.sis.javacourse;

public class Weapon {
    void hit(Target target, Damage.DamageBuilder givenDamage) {
    target.gottenDamage = givenDamage;
    }
}
