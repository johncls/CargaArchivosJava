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
public class SalesReport {
    private String typeDocument;
    private Number document;
    private String name;
    private String lastName;
    private Integer idProduct;
    private String nameProduct;
    private Number quantitySolid;
    private Number priceProduct;
    private Number total;
    
    public SalesReport(String TypeDocument, 
            Number Document, 
            String Name, 
            String LastName, 
            Integer IdProduct, 
            String NameProduct, 
            Number QuantitySolid,
            Number PriceProduct,
            Number Total){
        
        this.typeDocument = TypeDocument;
        this.document = Document;
        this.name = Name;
        this.lastName = LastName;
        this.idProduct = IdProduct;
        this.nameProduct = NameProduct;
        this.quantitySolid = QuantitySolid;
        this.priceProduct = PriceProduct;
        this.total = Total;
    }
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
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    
    public Number getQuantitySolid(){
        return quantitySolid;
    }
    
    public void setquantitySolid(Number quantitySolid){
        this.quantitySolid = quantitySolid;
    }
    
    public Number getPriceProduct(){
        return priceProduct;
    }
    
    public void setPriceProduct(Number priceProduct){
        this.priceProduct = priceProduct;
    }
    
    public Number getTotal(){
        return total;
    }
    
    public void setTotal (Number total){
        this.total = total;
    }
    
}
