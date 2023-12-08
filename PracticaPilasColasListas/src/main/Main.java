/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controller.ctl_colas;
import Controller.ctl_listas;
import Controller.ctl_menu;
import Controller.ctl_pilas;
import Model.Lista;
import Model.NodoL;
import View.frm_cola;
import View.frm_lista;
import View.frm_menu;
import View.frm_pila;
import java.util.Scanner;

/**
 *
 * @author ELVIS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        frm_menu frmMenu = new frm_menu();
        ctl_menu ctlMenu = new ctl_menu(frmMenu);
        frmMenu.show();
////

//         TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        Lista l = new Lista();
//        char op = 's';
//        while (op == 's') {
//            System.out.println("Ingrese el valor del nodo; ");
//            NodoL nodo = new NodoL(sc.nextInt(), null);
//            l.insertarFinal(nodo);
//            l.recorrer();
//            System.out.println("Desea seguir ingresando s/n; ");
//            op = sc.next().charAt(0);
//        }
//        System.out.println("Extraccion de nodos; ");
//        do {
//            NodoL extraido = l.extraerFinal();
//            if (extraido == null) {
//                break;
//            }
//            System.out.println(extraido.toString());
//            System.out.println("el valor del nodo es "
//                    + extraido.getInf());
//            l.recorrer();
//            System.out.println("Desea seguir extrayendo s/n; ");
//            op = sc.next().charAt(0);
//        } while (op == 's');
    }

}
