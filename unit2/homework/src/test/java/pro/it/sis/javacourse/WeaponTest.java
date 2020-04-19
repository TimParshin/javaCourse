package pro.it.sis.javacourse;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeaponTest {

    @Test
    public void testYakutskSwordHitIceGiant() {

        Target t = new IceGiant();
        Weapon w = new SwordOfYakutskNight();
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
        assertEquals(0, t.getIceDamage());
        assertEquals(0, t.getFireDamage());
    }

    @Test
    public void testYakutskSwordHitEfrit() {

        Target t = new Efrit();
        Weapon w = new SwordOfYakutskNight();
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
        assertEquals(50, t.getIceDamage());
        assertEquals(0, t.getFireDamage());
    }

    @Test
    public void testFireSwordHitIceGiant() {

        Target t = new IceGiant();
        Weapon w = new FlamingAsphaltSword();
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
        assertEquals(0, t.getIceDamage());
        assertEquals(50, t.getFireDamage());
    }

    @Test
    public void testFireSwordHitEfrit() {

        Target t = new Efrit();
        Weapon w = new FlamingAsphaltSword();
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
        assertEquals(0, t.getIceDamage());
        assertEquals(0, t.getFireDamage());
    }
}