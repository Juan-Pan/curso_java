package com.pan.com.zona_fit.gui;

import com.pan.com.zona_fit.servicio.ClienteServicio;
import com.pan.com.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Component
public class ZonaFitForma extends  JFrame{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    IClienteServicio clienteServicio;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
        iniciarForma();
    }
    private void iniciarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
    }
}
