package pro.it.sis.javacourse;

public class FlamingAsphaltSword extends Weapon {

    private int physicalDamage = 100;
    private int fireDamage = 50;

    private Damage givenDamage = new Damage()
            .setPhysicalDamage(this.physicalDamage)
            .setFireDamage(this.fireDamage);

    @Override
    public Damage getGivenDamage() {return this.givenDamage;}
}
