package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.net.*;

/**
 * @author kpmcmanus
 */
class WebRitualArrow implements Weapon {

    WebRitualArrow() {
        String numberLine = "";

        // Used some code from http://stackoverflow.com/questions/9825798/how-to-read-a-text-from-a-web-page-with-java
        // for extracting text from the webpage
        try {
            // Create a URL for the desired page
            URL url = new URL("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html");

            // Read all the text returned by the server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str = "";
            while ((str = in.readLine()) != null) {
                str = in.readLine();
                if(str == null)
                    str = "";
                if(str.length() > 4)
                    if(str.charAt(0) == '<' && str.charAt(1) == 'h' && str.charAt(2) == '1' && str.charAt(3) == '>')
                         numberLine = str; // numberLine will be <h1>number</h1>
                //System.out.println(str.length());
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get the Damage value from the html line
        DAMAGE = Integer.parseInt((numberLine.substring(4, numberLine.length()-5)));
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - armor + 10;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    private int DAMAGE;

}
