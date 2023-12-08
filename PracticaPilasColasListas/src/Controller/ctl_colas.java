/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cola;
import Model.NodoL;
import View.frm_cola;
import View.frm_menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ELVIS
 */
public class ctl_colas implements ActionListener {

    public frm_cola frm_cola_view;
    Cola queue = new Cola();

    public ctl_colas(frm_cola frm_cola_view) {
        this.frm_cola_view = frm_cola_view;
        this.frm_cola_view.btn_pushCabecera_cola.addActionListener(this);
        this.frm_cola_view.btn_popFInal_cola.addActionListener(this);
        this.frm_cola_view.btn_salir_cola.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.frm_cola_view.btn_pushCabecera_cola) {

            String Dato = this.frm_cola_view.txt_pushCabecera_cola.getText();

            NodoL Nodo = new NodoL(Integer.parseInt(Dato), null);
            queue.PushCabecera(Nodo);

            StringBuilder stringBuilder = new StringBuilder();
            for (int value : queue.RcorrerYDevolver()) {
                stringBuilder.append(value).append("\n");
            }

            this.frm_cola_view.txt_showData_cola.setText(stringBuilder.toString());

        }

        if (e.getSource() == this.frm_cola_view.btn_popFInal_cola) {

            queue.PopFinal();

            StringBuilder stringBuilder = new StringBuilder();
            for (int value : queue.RcorrerYDevolver()) {
                stringBuilder.append(value).append("\n");
            }

            this.frm_cola_view.txt_showData_cola.setText(stringBuilder.toString());

        }

        if (e.getSource() == this.frm_cola_view.btn_salir_cola) {

            this.frm_cola_view.dispose();

            frm_menu frmMenu = new frm_menu();
            ctl_menu ctlMenu = new ctl_menu(frmMenu);
            frmMenu.show();

        }

    }

}
