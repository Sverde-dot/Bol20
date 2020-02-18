/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol20;

import javax.swing.JOptionPane;

/**
 *
 * @author sverdecadilla
 */
public class Bol20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] tabla = new int [5][5];
        String[]titulo={"ATH","ATM","FCB","RMA"};
        String[]autor={""};

        int option;
        Lista obx = new Lista();
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("\n 1 --> crear Matriz\n 2 --> muestra matriz\n 3 --> salir \n La opcion"));
            switch(option){
                case 1: tabla=obx.matriz(tabla);
                break;
                case 2: obx.mostratodo(tabla, titulo, autor);
                break;
                case 3: 
                break;
                
            }
                    
        }while(option<3);
    }
    }
    
}
