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
public class AppQuanLyBanHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyBanHang_Frame QL = new QuanLyBanHang_Frame();
        Product iphone = new Product("1", "IPhone11", 30000000);
        QL.setProduct(iphone);
        Product samSung = new Product("2", "Samsung Note 10+", 30000000);
        QL.setProduct(samSung);
        QL.show();
    }
    
}
