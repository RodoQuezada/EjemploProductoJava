/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productojavaapp;

import java.util.Scanner;

/**
 *
 * @author rodo
 */
public class Producto {
    
    private int codigo;
    private String descripcion;
    private int stock;

    public Producto(int codigo, String descripcion, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
     if (codigo >=0 && codigo <= 19)
        {
           this.codigo = codigo;
        }else{
            System.out.println("datos no válidos");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {  
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", stock=" + stock + '}';
    }
    
    public Producto add(){
        Scanner read = new Scanner(System.in);
         
        System.out.print("Codigo: ");
        this.setCodigo(read.nextInt());
        System.out.print("Descripcion: ");
        this.setDescripcion(read.next());
        System.out.print("Stock: ");
        this.setStock(read.nextInt());
        Producto p = new Producto(this.getCodigo(),this.getDescripcion(),this.getStock());
        return p;
    }
    
  
    
}
