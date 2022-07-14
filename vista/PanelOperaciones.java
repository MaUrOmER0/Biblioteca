/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author njpae
 */
public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bCalcular;
    public JButton bBorrar;
    public JButton bSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bCalcular = new JButton("Calcular");
        bCalcular.setBounds(10,20,100,20);
        add(bCalcular);
        bCalcular.setActionCommand("calcular");
        
        bBorrar = new JButton("Borrar");
        bBorrar.setBounds(120,20,100,20);
        add(bBorrar);
        bBorrar.setActionCommand("borrar");
        
        bSalir = new JButton("Salir");
        bSalir.setBounds(230,20,100,20);
        add(bSalir);
        bSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}
