/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Lista;
import Model.NodoL;
import Model.Pila;
import View.frm_menu;
import View.frm_pila;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ELVIS
 */
public class ctl_pilas implements ActionListener {

    public frm_pila frm_pila_view;
    Pila Stack = new Pila();

    public ctl_pilas(frm_pila frm_pila_view) {
        this.frm_pila_view = frm_pila_view;
        this.frm_pila_view.btn_pushCabecera_pilas.addActionListener(this);
        this.frm_pila_view.btn_extraerCabecera_pilas.addActionListener(this);
        this.frm_pila_view.btn_salir_pila.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.frm_pila_view.btn_pushCabecera_pilas) {

            String Dato = this.frm_pila_view.txt_datoCabecera_pilas.getText();

            NodoL Nodo = new NodoL(Integer.parseInt(Dato), null);
            Stack.PushCab(Nodo);

            StringBuilder stringBuilder = new StringBuilder();
            for (int value : Stack.RcorrerYDevolver()) {
                stringBuilder.append(value).append("\n");
            }

            this.frm_pila_view.txt_showData_pilas.setText(stringBuilder.toString());

        }

        if (e.getSource() == this.frm_pila_view.btn_extraerCabecera_pilas) {

            Stack.PopCab();

            StringBuilder stringBuilder = new StringBuilder();
            for (int value : Stack.RcorrerYDevolver()) {
                stringBuilder.append(value).append("\n");
            }

            this.frm_pila_view.txt_showData_pilas.setText(stringBuilder.toString());

        }

        if (e.getSource() == this.frm_pila_view.btn_salir_pila) {

            this.frm_pila_view.dispose();

            frm_menu frmMenu = new frm_menu();
            ctl_menu ctlMenu = new ctl_menu(frmMenu);
            frmMenu.show();

        }

    }

}
