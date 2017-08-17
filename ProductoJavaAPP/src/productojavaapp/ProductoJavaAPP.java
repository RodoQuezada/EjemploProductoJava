/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productojavaapp;

/**
 *
 * @author rodo
 */
public class ProductoJavaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
       Producto [] productos = new Producto[3];
        for (int i = 0; i < productos.length; i++) {
            System.out.println("ingresando Producto "+(i+1));
            Producto pro = new Producto();
            pro.add(); 
            productos[pro.getCodigo()] = pro;
        }
        
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println(producto.toString());
            }else{
                System.out.println("Sin dato");
            }
        }            
    }    
}
