/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomchargen;
import java.util.Random;
/**
 *
 * @author Tony
 */
public class RandomCharGen {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String[] nameArray = {
        "Valentine", "Damien", "Declan"
    };
            String[] hairColourArray = {
                "black", "red", "blonde"
            };
            Random rn = new Random();
            int randNum = rn.nextInt(3);
            int randNum2 = rn.nextInt(3);
            System.out.println("It's a boy named " + nameArray[randNum] + " and he has " + hairColourArray[randNum2] + " hair.");
    }
    
}
