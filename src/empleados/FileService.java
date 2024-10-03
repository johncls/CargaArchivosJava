/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.io.File;
import java.util.List;

/**
 * Clase encargada del manejo de la lectura de archivos
 * @author jonce
 */
public class FileService {

    ReadingInfoFiles rif = new ReadingInfoFiles();

    public List<SellerInformation> readSellerInformation(String fileName) {
        return rif.SellerInformationData(fileName);
    }

    public List<ProductInformation> readProductInformation(String fileName) {
        return rif.ProductInformationData(fileName);
    }

    public List<SalesInformation> readSalesInformation(String fileName) {
        return rif.SalesInformation(fileName);
    }

    public File[] findFilesInFolder(String folderName) {
        File folder = new File(folderName);
        return folder.listFiles();
    }
}
