/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appquanlybanhang;

/**
 *
 * @author Admin
 */
public class DetailBill {
    private String idBill;
    private String idProduct;
    private int quantity;
    private int total;

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public DetailBill(String idBill, String idProduct, int quantity, int total) {
        this.idBill = idBill;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.total = total;
    }
    
    
    
}
