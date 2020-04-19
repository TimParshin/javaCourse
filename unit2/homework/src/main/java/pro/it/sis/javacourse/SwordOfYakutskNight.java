package pro.it.sis.javacourse;

public class SwordOfYakutskNight extends Weapon  {

    private int physicalDamage = 100;
    private int iceDamage = 50;
    private Damage givenDamage = new Damage()
        .setPhysicalDamage(this.physicalDamage)
        .setIceDamage(this.iceDamage);

    @Override
    public Damage getGivenDamage() {return this.givenDamage;}

}
