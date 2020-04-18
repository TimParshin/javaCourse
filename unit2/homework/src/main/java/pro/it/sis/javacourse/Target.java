package pro.it.sis.javacourse;

public class Target {

    public int getPhysicalDamage() {
        return physicalDamage = gottenDamage.getPhysicalDamage();
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
//    public Damage.DamageBuilder gottenDamage = Damage.builder()
//            .physicalDamage(this.physicalDamage)
//            .iceDamage(this.iceDamage)
//            .fireDamage(this.fireDamage);

    public Damage gottenDamage = new Damage()
        .setPhysicalDamage(this.physicalDamage)
        .setFireDamage(this.fireDamage)
        .setIceDamage(this.iceDamage);
}
