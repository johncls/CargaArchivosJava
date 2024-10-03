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
import java.io.IOException;
/**
 *
 * @author jonce
 */
public class ReadingInfoFiles {
    
    /**
     * Lectura del archivo plano vendedores
     * @param dataName  
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
                String typeDocument = dataEmployed[0];
                int document = Integer.parseInt(dataEmployed[1]);
                String nameEmployed = dataEmployed[2];
                String lastNameEmployed = dataEmployed[3];
                
                SellerInformation infoven = new SellerInformation(typeDocument, document, nameEmployed, lastNameEmployed);
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
    /**
     * Método para obtener las ventas por cliente
     * @param dataName Nombre del archivo con los datos
     */
    public List<SalesInformation> SalesInformation(String dataName) {
        File file;
        FileReader fr = null;
        BufferedReader br = null;
        
        List<SalesInformation> sales = new ArrayList<>();
        
        try {
            // Especificar la ruta del archivo dentro de la carpeta "Vendedores"
            file = new File("Vendedores\\" + dataName);
//            System.out.println("Ruta del archivo: " + file.getAbsolutePath());
            
            // Verificar si el archivo existe
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "El archivo no existe: " + dataName);
                return null;
            }

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            // Leer el tipo de documento y el número de documento en la primera línea
            String linea = br.readLine();
            if (linea != null) {
                String[] header = linea.split(";");
                String typeDocument = header[0];
                int document = Integer.parseInt(header[1]);
                
//                System.out.println("Tipo de Documento: " + typeDocument);
//                System.out.println("Número de Documento: " + document);
                
                // Procesar las siguientes líneas con los pares de productos y cantidades
                while ((linea = br.readLine()) != null) {
                    String[] dataSales = linea.split(";");
                    
                    if (dataSales.length == 2) {
                        int productId = Integer.parseInt(dataSales[0]);
                        int quantity = Integer.parseInt(dataSales[1]);
                        Sales salesData = new Sales(productId,quantity);
                        SalesInformation salesInformation = new SalesInformation(typeDocument, document, salesData);              
                        sales.add(salesInformation);
                    }
                }
                              
            }
         
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }
        return sales;
    }
 }
    

