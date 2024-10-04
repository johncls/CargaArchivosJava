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
import java.io.PrintWriter;
import com.opencsv.*;

/**
 *
 * @author jonce
 */
public class GenerateInfoFiles {
   /**
    * Metodo para generar el documento
    * @param report lista del reporte
    */

    public void GenerateDocument(String salesFile, List<SalesReport> report) throws IOException {
        String archCSV = "C:\\Users\\jonce\\Documents\\empleados\\"+salesFile+".csv";
        
        // Crea el CSVWriter para escribir en el archivo
        try (CSVWriter writer = new CSVWriter(new FileWriter(archCSV))) {
            String[] header = { "ID Producto", "Nombre Producto", "Cantidad Vendida", "Precio Unitario", "Total Vendido" };
            writer.writeNext(header);
            
            report.forEach(x -> {
                String[] row = {
                    x.getIdProduct().toString(),
                    x.getNameProduct(),
                    String.valueOf(x.getQuantitySolid()),
                    String.valueOf(x.getPriceProduct()),
                    String.valueOf(x.getTotal())
                };
                writer.writeNext(row);  // Escribe la fila en el CSV
            });
        }

        System.out.println("Archivo CSV creado: " + archCSV);
    }

    
//        File f;
//        FileWriter w; 
//        BufferedWriter bw;
//        PrintWriter wr;
//        String name;
//        try {
//            
//            f = new File("Reporte "+salesFile);
//            w = new FileWriter(f);
//            bw = new BufferedWriter(w);
//            wr = new PrintWriter(bw);
//            
//            report.forEach(x -> {
//                wr.write("Reporte "+ x.getName()+ " - "+x.getLastName());
//                wr.append("\n"
//                        + " ID del producto: " + x.getIdProduct()
//                        + " | Nombre del producto: " + x.getNameProduct()
//                        + " | Cantidad vendida: " + x.getQuantitySolid()
//                        + " | Precio unitario del producto: " + x.getPriceProduct()
//                        + " | Total vendido: " + x.getTotal()
//                );
//                //wr.append("\nLinea final");
//            });
//            wr.close();
//            bw.close();
//        }catch( Exception e){
//            JOptionPane.showMessageDialog(null, "Ocurrio un erro");
//        }
//    } 
    
}