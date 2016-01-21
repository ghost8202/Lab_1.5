/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Owner
 */
public class Lab1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String orgPic = "C:\\temp\\pocahontas.jpg";
        String newPic = "C:\\temp\\newFile.txt";
        String newerPic = "C:\\temp\\pocahontas1.jpg";

        File oP = new File(orgPic);
        File nP = new File(newPic);
        File nnP = new File(newerPic);

        try {

            FileReader fr = new FileReader(oP);
            FileWriter fw = new FileWriter(nP);
            FileWriter fww = new FileWriter(nnP);

            try {
                int p = fr.read();
                while (p != -1) {
                    fw.write(p);
                    p = fr.read();
                    fww.write(p);
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            } finally {
                fr.close();
                fw.close();
                fww.close();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
