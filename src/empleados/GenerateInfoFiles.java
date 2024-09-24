/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author jonce
 */
public class GenerateInfoFiles {
    
    /**
     * Metodo para escribir en un archivo plano
     * @param data 
     */
    public void GenerateDocument(String nombre){
        File f;
        FileWriter w; 
        BufferedWriter bw;
        PrintWriter wr;
        
        try {
            
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            wr.write("Esta es nuestra primer linea de codigo");
            wr.append("\nEsta es nuestra segunda linea de codigo");
            wr.append("\nLinea final");
            
            wr.close();
            bw.close();
        }catch( Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un erro");
        }
    } 
}
