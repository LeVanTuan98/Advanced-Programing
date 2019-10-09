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
public class Bill {
    private String idBill;
    private String day;
    private String payment;

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Bill(String idBill, String day, String payment) {
        this.idBill = idBill;
        this.day = day;
        this.payment = payment;
    }
   
    
}
