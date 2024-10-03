/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonce
 */
public class SalesService {

    private final FileService fileService;

    public SalesService(FileService fileService) {
        this.fileService = fileService;
    }

    public void generateSalesReport(String salesFile, String productFile, String employeeFile) {
        
        
        List<SalesInformation> salesInformation = fileService.readSalesInformation(salesFile);
        List<ProductInformation> products = fileService.readProductInformation(productFile);
        List<SellerInformation> employees = fileService.readSellerInformation(employeeFile);
        List<SalesReport> report = new ArrayList<>();

        salesInformation.forEach(sale -> {
            Number documentNumber = sale.getDocument();
            employees.forEach(employee -> {
                if (documentNumber.intValue() == employee.getDocument().intValue()) {
                    products.forEach(product -> {
                        if (product.getIdProduct().equals(sale.getSales().getIdProducto())) {
                            Number totalSales = Integer.parseInt(sale.getSales().getQuantitySold().toString()) * 
                                                Integer.parseInt(product.getPriceProduct().toString());
                            SalesReport salesReport = new SalesReport(
                                    employee.getTypeDocument(),
                                    employee.getDocument(),
                                    employee.getName(),
                                    employee.getLastName(),
                                    product.getIdProduct(),
                                    product.getNameProduct(),
                                    sale.getSales().getQuantitySold(),
                                    product.getPriceProduct(),
                                    totalSales
                            );
                            report.add(salesReport);
                        }
                    });
                }
            });
        });

        printReport(salesFile, report);
    }

    private void printReport(String salesFile, List<SalesReport> report) {
        GenerateInfoFiles generateReport = new GenerateInfoFiles();
        generateReport.GenerateDocument(salesFile, report);
        report.forEach(r -> {        
            System.out.println("Nombre: " + r.getName() 
                + " | ID del producto: " + r.getIdProduct()
                + " | Nombre del producto: " + r.getNameProduct()
                + " | Cantidad vendida: " + r.getQuantitySolid()
                + " | Precio unitario del producto: " + r.getPriceProduct()
                + " | Total vendido: " + r.getTotal());
        });
    }
}
