package pro.it.sis.javacourse;

import lombok.Builder;

public class Damage {

    @Builder
    public Damage(int physicalDamage, int iceDamage, int fireDamage) {
        this.physicalDamage = physicalDamage;
        this.iceDamage = iceDamage;
        this.fireDamage = fireDamage;
    }

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;

    public Damage() {}
}
