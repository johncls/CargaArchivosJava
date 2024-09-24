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
        private Number idProduct;
        private Number quantitySold;
        
    // Constructor
        public SalesInformation(String TypeDocument, Number Document, int IdProducto, int QuantitySold ) {
            this.typeDocument = TypeDocument;
            this.document = Document;
            this.idProduct = IdProducto;
            this.quantitySold = QuantitySold;
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

        public Number getIdProducto() {
            return idProduct;
        }

        public void setIdProduct(int idProduct) {
            this.idProduct = idProduct;
        }
        
        public Number getQuantitySold() {
            return quantitySold;
        }

        public void setQuantitySold(int quantitySold) {
            this.quantitySold = quantitySold;
        } 
}
