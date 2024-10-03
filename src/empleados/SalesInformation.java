/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author jonce
 */
public class SalesInformation {
        private String typeDocument;
        private Number document;
        Sales salesData; 
        
    // Constructor
        public SalesInformation(String TypeDocument, Number Document, Sales SalesData ) {
            this.typeDocument = TypeDocument;
            this.document = Document;
            this.salesData = SalesData;
        }

        
        
        // Getters && Setters

        public String getTypeDocument() {
            return typeDocument;
        }

        public void setTypeDocument(String typeDocument) {
            this.typeDocument = typeDocument;
        }

        public Number getDocument() {
            return document;
        }

        public void setDocument(Number document) {
            this.document = document;
        }

        public Sales getSales() {
            return salesData;
        }

        public void setSalesData(Sales salesData) {
            this.salesData = salesData;
        }     
}
