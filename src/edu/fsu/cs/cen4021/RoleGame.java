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

        Weapon simpleArrow = WeaponFactory.getWeapon("simpleArrow");
        System.out.println("SimpleArrow does " + simpleArrow.hit() + " damage.");
        System.out.println("SimpleArrow was able to do " + simpleArrow.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon simpleAxe = WeaponFactory.getWeapon("simpleAxe");
        System.out.println("SimpleAxe does " + simpleAxe.hit() + " damage.");
        System.out.println("SimpleAxe was able to do " + simpleAxe.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon simpleMagicStaff = WeaponFactory.getWeapon("simpleMagicStaff");
        System.out.println("SimpleMagicStaff does " + simpleMagicStaff.hit() + " damage.");
        System.out.println("SimpleMagicStaff was able to do " + simpleMagicStaff.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon theChosenOneAxe = WeaponFactory.getWeapon("theChosenOneAxe");
        System.out.println("TheChosenOneAxe does " + theChosenOneAxe.hit() + " damage.");
        System.out.println("TheChosenOneAxe was able to do " + theChosenOneAxe.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon ancientMagicStaff = WeaponFactory.getWeapon("ancientMagicStaff");
        System.out.println("AncientMagicStaff does " + ancientMagicStaff.hit() + " damage.");
        System.out.println("AncientMagicStaff was able to do " + ancientMagicStaff.hit(armor) + " damage due to an armor with " + armor + " points.");

        Weapon webRitualArrow = WeaponFactory.getWeapon("webRitualArrow");
        System.out.println("WebRitualArrow does " + webRitualArrow.hit() + " damage.");
        System.out.println("WebRitualArrow was able to do " + webRitualArrow.hit(armor) + " damage due to an armor with " + armor + " points.");

    }
}
