package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.util.*;

/**
 * @author kpmcmanus
 */
class AncientMagicStaff extends BasicWeapon implements Weapon {

    AncientMagicStaff() {
        super(50);
        List<Integer> numberList = new ArrayList<>();

        // The code to deserialize a java .obj file was adopted from
        // http://crunchify.com/how-to-serialize-deserialize-list-of-objects-in-java-java-serialization-example/
        try {
            FileInputStream fileIn = new FileInputStream("conf/ancientstaff.obj");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //System.out.println("Deserialized Data: \n" + in.readObject().toString());
            //numberList = in.readObject();
            numberList = (List)in.readObject();

            in.close();
            fileIn.close();
            //System.out.println("Contents of file:");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Square all the elements of the list
        for(int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) * numberList.get(i));
        }
        numberList.remove(1); // remove the 2nd element of the list
        numberList.remove(3); // remove what was the 5th element of the list
        List<Integer> numberListReversed = new ArrayList<>();
        for(int i = numberList.size()-1; i > -1; i--) {
            numberListReversed.add(numberList.get(i));
            //System.out.println(numberList.get(i));
        }

        // Damage is the sum of the 1st, 3rd, and 7th elements of the list
        DAMAGE = numberListReversed.get(0) + numberListReversed.get(2) + numberListReversed.get(6);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (3 * armor) / 4;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
