/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *Clase donde se obtiene la informacion de los productos
 * @author jonce
 */
public class ProductInformation {
        private Integer IdProduct;
        private String NameProduct;
        private Number PriceProduct;

        // Constructor
        public ProductInformation(Integer idProduct, String nameProduct, Number priceProduct ) {
            this.IdProduct = idProduct;
            this.NameProduct = nameProduct;
            this.PriceProduct = priceProduct;
        }
        
         // Getters && Setters

        public Integer getIdProduct() {
            return IdProduct;
        }

        public void setIdProduct(Integer idProduct) {
            this.IdProduct = idProduct;
        }

        public String getNameProduct() {
            return NameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.NameProduct = nameProduct;
        }

        public Number getPriceProduct() {
            return PriceProduct;
        }

        public void setPriceProduct(Number priceProduct) {
            this.PriceProduct = priceProduct;
        }        
}
