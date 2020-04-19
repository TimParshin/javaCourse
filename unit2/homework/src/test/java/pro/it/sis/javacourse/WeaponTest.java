package pro.it.sis.javacourse;

import org.junit.Test;

import java.nio.file.Watchable;

import static org.junit.Assert.*;

public class WeaponTest {

//    @Test
//    public void testPhysicalDamage() {
//
//        Target t = new Target();
//        Weapon w = new Weapon();
//        w.hit(t);
//
//        assertEquals(100, t.getPhysicalDamage());
//    }
//
//    @Test
//    public void testFireDamage() {
//
//        Target t = new Target();
//        Weapon w = new Weapon();
//        w.hit(t);
//
//        assertEquals(100, t.getFireDamage());
//    }
//
//    @Test
//    public void testIceDamage() {
//
//        Target t = new Target();
//        Weapon w = new Weapon();
//        w.hit(t);
//
//        assertEquals(100, t.getIceDamage());
//    }

    @Test
    public void testYakutskSwordHitIceGiant() {

        Target t = new IceGiant();
        Weapon w = new SwordOfYakutskNight();
        w.hit(t);

       int pd = t.getPhysicalDamage();
        int id = t.getIceDamage();
        int fd = t.getFireDamage();

        assertEquals(100, t.getPhysicalDamage());
        assertEquals(0, t.getIceDamage());
        assertEquals(0, t.getFireDamage());
    }

    @Test
    public void testYakutskSwordHitEfrit() {

        Target t = new Efrit();
        Weapon w = new SwordOfYakutskNight();
        w.hit(t);

        int pd = t.getPhysicalDamage();
        int id = t.getIceDamage();
        int fd = t.getFireDamage();

        assertEquals(100, t.getPhysicalDamage());
        assertEquals(50, t.getIceDamage());
        assertEquals(0, t.getFireDamage());
    }
}