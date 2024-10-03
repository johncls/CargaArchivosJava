/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author jonce
 */
public class Employed 
{

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
       FileService fileService = new FileService();
        SalesService salesService = new SalesService(fileService);

        // Lee todos los archivos de la carpeta de vendedores y genera reportes de ventas
        File[] files = fileService.findFilesInFolder("Vendedores");
        List<File> fileList = Arrays.asList(files);
        fileList.forEach(x -> {
            if (!x.isDirectory()) {
                salesService.generateSalesReport(x.getName(), "Productos.txt", "vendedores.txt");
            }
        });   
    } 
}
