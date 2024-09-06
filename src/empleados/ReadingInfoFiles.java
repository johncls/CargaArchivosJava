/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jonce
 */
public class ReadingInfoFiles {
    /**
     * Lectura del archivo plano
     * @param nombreArchivo 
     */
    public List<SellerInformation> SellerInformationData(String dataName){
        File archivo;
        FileReader fr;
        BufferedReader br;
        String [] dataEmployed = null;
        List<SellerInformation> employed = new ArrayList<>();
        try{
            archivo = new File(dataName);
            fr= new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine()) != null){
                if (linea != null) {
                     dataEmployed = linea.split(";");                  
                }
                
                SellerInformation infoven = new SellerInformation(dataEmployed[0],Integer.parseInt(dataEmployed[1]), dataEmployed[2], dataEmployed[3]);
                employed.add(infoven);
            }
                       
            br.close();
            fr.close();
                       
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo" + e);
        }
        
        return employed;
    }
    /**
     * Metodo se encarga de leer los productos
     * @param dataName
     * @return Lista de productos
     */
    public List<ProductInformation> ProductInformationData(String dataName){
        File file;
        FileReader fr;
        BufferedReader br;
        String [] dataProduct = null;
        List<ProductInformation> product = new ArrayList<>();
        try{
            file = new File(dataName);
            fr= new FileReader(file);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine()) != null){
                if (linea != null) {
                     dataProduct = linea.split(";");                  
                }
                
                ProductInformation productData = new ProductInformation(Integer.parseInt(dataProduct[0]),dataProduct[1], Integer.parseInt(dataProduct[2]));
                product.add(productData);
            }
                       
            br.close();
            fr.close();
                       
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo" + e);
        }
        
        return product;
    }
}
