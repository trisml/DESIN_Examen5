package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interface {
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Mi Interfaz");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

        JLabel mensaje = new JLabel("Bienvenido Diego");

        JButton boton = new JButton("Pulsa aquí");
        boton.setPreferredSize(new Dimension(120, 40)); 

      
        frame.add(mensaje);
        frame.add(boton);

       
        frame.setVisible(true);
    }
}
