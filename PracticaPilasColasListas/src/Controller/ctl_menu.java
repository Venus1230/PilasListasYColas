/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.frm_cola;
import View.frm_lista;
import View.frm_menu;
import View.frm_pila;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ELVIS
 */
public class ctl_menu implements ActionListener {

    public frm_menu frm_menu_view;

    public ctl_menu(frm_menu frm_menu_view) {

        this.frm_menu_view = frm_menu_view;

        this.frm_menu_view.btn_menu_lista.addActionListener(this);
        this.frm_menu_view.btn_menu_cola.addActionListener(this);
        this.frm_menu_view.btn_menu_pila.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.frm_menu_view.btn_menu_lista) {

            this.frm_menu_view.dispose();

            frm_lista frmLista = new frm_lista();
            ctl_listas ctlListas = new ctl_listas(frmLista);
            frmLista.show();

        }

        if (e.getSource() == this.frm_menu_view.btn_menu_cola) {

            this.frm_menu_view.dispose();

            frm_cola frmCola = new frm_cola();
            ctl_colas ctlColas = new ctl_colas(frmCola);
            frmCola.show();

        }

        if (e.getSource() == this.frm_menu_view.btn_menu_pila) {

            this.frm_menu_view.dispose();

            frm_pila frmPilas = new frm_pila();
            ctl_pilas ctlPilas = new ctl_pilas(frmPilas);
            frmPilas.show();

        }

    }

}
