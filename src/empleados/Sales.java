/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author jonce
 */
public class Sales {

        private Number idProduct;
        private Number quantitySold;
        
    // Constructor
        public Sales(int IdProducto, int QuantitySold ) {
            this.idProduct = IdProducto;
            this.quantitySold = QuantitySold;
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
