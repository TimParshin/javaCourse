package pro.it.sis.javacourse;

public class Damage {

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public Damage setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
        return this;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public Damage setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
        return this;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    public Damage setIceDamage(int iceDamage) {
        this.iceDamage = iceDamage;
        return this;
    }
}
