package com.education;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    //Inicializar formulario (constructor)
    public LoginForm()
    {
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void validar() {
        //leer los valores
        String usuario = this.usuarioTexto.getText();
        String password = new String(this.passwordTexto.getPassword());
        if("root".equals(usuario) && "admin".equals(password))
        {
            mostrarMensaje("Datos correctos, bienvenido!");
        }
        else if("root".equals(usuario))
        {
            mostrarMensaje("Password incorrecto, intentar de nuevo!");
        }
        else {
            mostrarMensaje("Usuario incorrecto, intentar de nuevo!");
        }
    }
    private void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void inicializarForma()
    {
        // ver el panel principal
        setContentPane(panelPrincipal);
        // cerra la aplicacion cuando se cierre el panel principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // organizar el tamaño del panel principal
        setSize(600,400);
        //centramos la ventana
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        //Cambia la ventana a modo oscuro (tiene que integrar la dependencia en el pom.xml)
        FlatDarculaLaf.setup();
        // Se crea una instancia del formulario
        LoginForm loginForm = new LoginForm();
        //que sea visible
        loginForm.setVisible(true);
    }
}
