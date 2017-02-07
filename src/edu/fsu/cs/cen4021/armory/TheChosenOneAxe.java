package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.util.*;

/**
 * @author kpmcmanus
 */
class TheChosenOneAxe implements Weapon {

    TheChosenOneAxe() {
        // The code to read a text file line by line was adopted from
        // http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html
        int count = 1;
        String string1 = "", string2 = "";
        try {
            File file = new File("conf/thechosenone.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if(string1.equals("")) {
                    //System.out.println(line);
                    string1 = line;
                }
                else if(string2.equals("") && !string1.equals(line))
                {
                    //System.out.println(line);
                    string2 = line;
                    DAMAGE = count;
                }
                count++;
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage;
        if(armor > 0 && armor < 20) {
            damage = DAMAGE;
        }
        else {
            damage = DAMAGE - armor;
        }

        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    private int DAMAGE;
}
