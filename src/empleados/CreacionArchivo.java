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
public class CreacionArchivo {
    
    /**
     * Metodo para escribir en un archivo plano
     * @param data 
     */
    public void Escribir(String nombre){
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
    
    /**
     * Lectura del archivo plano
     * @param nombreArchivo 
     */
    public List<InformacionVendedores> Lectura(String nombreArchivo){
        File archivo;
        FileReader fr;
        BufferedReader br;
        String [] dataEMpleado = null;
        List<InformacionVendedores> vendedores = new ArrayList<>();
        try{
            archivo = new File(nombreArchivo);
            fr= new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine()) != null){
                if (linea != null) {
                     dataEMpleado = linea.split(";");                  
                }
                
                InformacionVendedores infoven = new InformacionVendedores(dataEMpleado[0],Integer.parseInt(dataEMpleado[1]), dataEMpleado[2], dataEMpleado[3]);
                vendedores.add(infoven);
            }
            
            
            br.close();
            fr.close();
            
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo" + e);
        }
        
        return vendedores;
    }
    
    
}
