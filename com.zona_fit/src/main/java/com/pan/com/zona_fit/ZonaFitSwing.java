package com.pan.com.zona_fit;

import com.pan.com.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

@SpringBootApplication
public class ZonaFitSwing {
    public static void main(String[] args) {
        // toca antes de instanciar la fabrica de swing
        FlatDarculaLaf.setup();
        //instanciar la fabrica de spring
        ConfigurableApplicationContext contextoSpring=
                new SpringApplicationBuilder(ZonaFitSwing.class)
                        .headless(false).
                        web(WebApplicationType.NONE)
                        .run(args);
    //crear un objeto de swing
        SwingUtilities.invokeLater(() ->
        {
            ZonaFitForma zonaFitForma = contextoSpring.getBean(ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });
    }
}
