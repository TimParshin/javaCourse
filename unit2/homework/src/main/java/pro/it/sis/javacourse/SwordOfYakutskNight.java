package pro.it.sis.javacourse;

import lombok.Getter;

@Getter
public class SwordOfYakutskNight extends Weapon  {

    private int physicalDamage = 100;
    private int iceDamage = 100;
//    private Damage.DamageBuilder givenDamage = Damage.builder()
//            .physicalDamage(this.physicalDamage)
//            .iceDamage(this.iceDamage);
    private Damage givenDamage = new Damage()
        .setPhysicalDamage(this.physicalDamage)
        .setIceDamage(this.iceDamage);

    @Override
    public Damage getGivenDamage() {return this.givenDamage;}

}
