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
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CreacionArchivo  ca = new CreacionArchivo();
       List<InformacionVendedores> vendedores = ca.Lectura("vendedores.txt");
        
       //ca.Escribir("Empleados.txt");
       ca.Lectura("Vendedores.txt");
       
         if (!vendedores.isEmpty()) {
            InformacionVendedores primerVendedor = vendedores.get(0);
            System.out.println("Primer Vendedor: " + primerVendedor.getName() + primerVendedor.getDocument());
        }
        
        // Si deseas obtener el segundo vendedor
        if (vendedores.size() > 1) {
            InformacionVendedores segundoVendedor = vendedores.get(1);
            System.out.println("Segundo Vendedor: " + segundoVendedor.getName());
        }
    }

}
