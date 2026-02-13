import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame {
    // Panel principal creado por el diseñador (.form) y asociado como contenido.
    private JPanel panelPrincipal;
    // Campo de texto que se coloca en el panel del formulario.
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma()
    {
        // Configura la ventana al construirse.
        inicializarForma();
     //   campoTexto.addActionListener(e ->
     //   {
     //       replicarTexto();
     //   });
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }
    private void replicarTexto()
    {
        this.replicadorLabel.setText(this.campoTexto.getText());
    }
    private void inicializarForma()
    {
        // Asocia el panel creado en el formulario como contenido de la ventana.
        setContentPane(panelPrincipal);
        // Cierra la aplicacion al cerrar la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define el tamano inicial de la ventana.
        setSize(600,400);
        // Centra la ventana en la pantalla.
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        // Aplica el tema oscuro de FlatLaf antes de crear la UI.
        FlatDarculaLaf.setup();
        // Crea la ventana y la muestra.
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
