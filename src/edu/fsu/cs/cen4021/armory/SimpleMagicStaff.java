package edu.fsu.cs.cen4021.armory;

/**
 * @author kpmcmanus
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (4 * armor) / 5;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
