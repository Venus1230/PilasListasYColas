/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Lista;
import Model.NodoL;
import View.frm_lista;
import View.frm_menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ELVIS
 */
public class ctl_listas implements ActionListener {

    public frm_lista frm_lista_view;
    Lista List = new Lista();

    public ctl_listas(frm_lista frm_lista_view) {
        this.frm_lista_view = frm_lista_view;

        this.frm_lista_view.btn_pushReferencia_listas.addActionListener(this);
        this.frm_lista_view.btn_push_listas.addActionListener(this);
        this.frm_lista_view.btn_pushFinal_listas.addActionListener(this);
        this.frm_lista_view.btn_extraerCabecera_listas.addActionListener(this);
        this.frm_lista_view.btn_extraerFinal_listas.addActionListener(this);
        this.frm_lista_view.btn_salir_lista.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.frm_lista_view.btn_push_listas) {

            String Dato = this.frm_lista_view.txt_dato_listas.getText();

            NodoL Nodo = new NodoL(Integer.parseInt(Dato), null);
            List.PushCab(Nodo);
            ShowData();

        }

        if (e.getSource() == this.frm_lista_view.btn_pushFinal_listas) {

            String Dato = this.frm_lista_view.txt_dato_listas_final.getText();
            NodoL Nodo = new NodoL(Integer.parseInt(Dato), null);
            List.PushFinal(Nodo);
            ShowData();

        }

        if (e.getSource() == this.frm_lista_view.btn_pushReferencia_listas) {

            try {
                String datoNuevo = this.frm_lista_view.txt_datoNuevo_listas.getText();
                String datoAnterior = this.frm_lista_view.txt_datoAnterior_listas.getText();

                NodoL nuevoNodo = new NodoL(Integer.parseInt(datoNuevo), null);

                NodoL nodoReferencia = List.FinNode(Integer.parseInt(datoAnterior));

                List.PushReferencia(nuevoNodo, nodoReferencia);

                ShowData();

            } catch (NumberFormatException ex) {
                System.err.println("Error: Ingrese números válidos");
            }

        }

        if (e.getSource() == this.frm_lista_view.btn_extraerCabecera_listas) {

            List.PopCab();
            ShowData();

        }

        if (e.getSource() == this.frm_lista_view.btn_extraerFinal_listas) {

            List.PopFinal();
            ShowData();
        }

        if (e.getSource() == this.frm_lista_view.btn_salir_lista) {

            this.frm_lista_view.dispose();

            frm_menu frmMenu = new frm_menu();
            ctl_menu ctlMenu = new ctl_menu(frmMenu);
            frmMenu.show();

        }

    }

    public void ShowData() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int value : List.RcorrerYDevolver()) {
            stringBuilder.append(value).append("\n");
        }

        this.frm_lista_view.txt_showData_listas.setText(stringBuilder.toString());

    }

}
