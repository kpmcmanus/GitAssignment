package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword does " + sword.hit() + " damage.");
        int armor = 20, armor2 = 19;
        System.out.println("Sword was able to do " + sword.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon simplearrow = WeaponFactory.getWeapon("simplearrow");
        System.out.println("SimpleArrow does " + simplearrow.hit() + " damage.");
        System.out.println("SimpleArrow was able to do " + simplearrow.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon simpleaxe = WeaponFactory.getWeapon("simpleaxe");
        System.out.println("SimpleAxe does " + simpleaxe.hit() + " damage.");
        System.out.println("SimpleAxe was able to do " + simpleaxe.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon simplemagicstaff = WeaponFactory.getWeapon("simplemagicstaff");
        System.out.println("SimpleMagicStaff does " + simplemagicstaff.hit() + " damage.");
        System.out.println("SimpleMagicStaff was able to do " + simplemagicstaff.hit(armor) + " damage due to an armor with " + armor + " points.");


        //TODO: Add the remaining weapons here

    }
}
