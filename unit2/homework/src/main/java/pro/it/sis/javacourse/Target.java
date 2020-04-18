package pro.it.sis.javacourse;

public class Target {

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    protected int physicalDamage;
    private int fireDamage;
    private int iceDamage;
    public Damage.DamageBuilder gottenDamage = Damage.builder()
            .physicalDamage(this.physicalDamage)
            .iceDamage(this.iceDamage)
            .fireDamage(this.fireDamage);
}
