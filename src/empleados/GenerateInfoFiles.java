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
    * Metodo para generar el documento
    * @param report lista del reporte
    */
    public void GenerateDocument(String salesFile, List<SalesReport> report){
        File f;
        FileWriter w; 
        BufferedWriter bw;
        PrintWriter wr;
        String name;
        try {
            
            f = new File("Reporte "+salesFile);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            report.forEach(x -> {
                wr.write("Reporte "+ x.getName()+ " - "+x.getLastName());
                wr.append("\n"
                        + " ID del producto: " + x.getIdProduct()
                        + " | Nombre del producto: " + x.getNameProduct()
                        + " | Cantidad vendida: " + x.getQuantitySolid()
                        + " | Precio unitario del producto: " + x.getPriceProduct()
                        + " | Total vendido: " + x.getTotal()
                );
                //wr.append("\nLinea final");
            });
            wr.close();
            bw.close();
        }catch( Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un erro");
        }
    } 
}
