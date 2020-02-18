/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sverdecadilla
 */
public class Lista {

    public int [][] matriz(int [][]tabla){
        for (int f =0;f<tabla.length;f++)
            for (int c =0;c<tabla[f].length;c++){
                
            }
        return tabla;
    }
        public void mostratodo(int[][]tabla,String[]titulo,String[]autor){

        for(int m =0;m<titulo.length;m++ )
            System.out.println(""+autor[m]+"  ");            
        for(int f =0;f<tabla.length;f++ ){
            System.out.println("\n"+titulo[f]);
        for (int c =0;c<tabla[f].length;c++)
            System.out.print(tabla [f][c]+"  ");
        }
    }
        
        public void addDatos (ArrayList<Libr>Lista){
            String titulo=JOptionPane.showInputDialog("Titulo");
            Lista.add(
            
            
        }
    
        public void BuscarElemento (ArrayList<Libr>Lista){
        String nome=JOptionPane.showInputDialog("Nome :");
        for (Libr x:Lista){
            if(nome.equals(x.getTitulo()))
                System.out.println(nome+" "+x.getAutor());
        }
    }
    
    public void darBaixa (ArrayList<Libr>Lista){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Nombre del Libro"));
        for(int i=0;i<Lista.size();i++){
            if(num == Lista.get(i).getUnidades())
                Lista.remove(Lista.get(i));
        }
            if(Lista.get(num).getUnidades() == 0);
                Lista.remove(num).getTitulo();
    }
    /*
    public void Ordenar(ArrayList<Libr>Lista){
        Collections.sort(Lista);
    }*/
}

