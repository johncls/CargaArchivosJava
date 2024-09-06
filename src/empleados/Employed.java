/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author jonce
 */
public class Employed 
{

    ReadingInfoFiles rif = new ReadingInfoFiles();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
       // Crear una instancia de la clase Employed
       Employed employed = new Employed();
        
       // Llamar a los métodos a través de la instancia
       employed.EmployedData();
       employed.productReader();
    }
    /**
     * Lectura del empleado
     */
    public void EmployedData()
    {
       GenerateInfoFiles  ca = new GenerateInfoFiles();
       List<SellerInformation> employedData = this.rif.SellerInformationData("vendedores.txt");
      
        employedData.forEach(x -> {
            ca.GenerateDocument(x.getName());
        });
        
         if (!employedData.isEmpty()) {
            SellerInformation primerVendedor = employedData.get(0);
            System.out.println("Primer Vendedor: " + primerVendedor.getName() + primerVendedor.getDocument());
        }
        
        // Si deseas obtener el segundo vendedor
        if (employedData.size() > 1) {
            SellerInformation segundoVendedor = employedData.get(1);
            System.out.println("Segundo Vendedor: " + segundoVendedor.getName());
        }
    }
    /**
     * Lectura del producto
     */
    public void productReader()
    {
      
       List<ProductInformation> productData = this.rif.ProductInformationData("Productos.txt");
      
       //ca.Escribir("Empleados.txt");
       //this.rif.ProductInformationData("Vendedores.txt");
       
         if (!productData.isEmpty()) {
            ProductInformation productOne = productData.get(0);
            System.out.println("Primer producto: " + productOne.getNameProduct()+ productOne.getPriceProduct());
        }
        
        // Si deseas obtener el segundo vendedor
        if (productData.size() > 1) {
            ProductInformation productTwo = productData.get(2);
            System.out.println("Segundo producto: " + productTwo.getNameProduct());
        }
    }

}
