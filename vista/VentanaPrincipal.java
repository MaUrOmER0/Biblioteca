package vista;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author njpae
 */
public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultado miPanelResultado;
    
    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        add(miPanelEntradaDatos);
       
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,60);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultado();
        miPanelResultado.setBounds(10,290,380,60);
        add(miPanelResultado);
        
        //Caracteristicas de la ventana
        setTitle("Mayor de 2 números");
        setSize(400,400);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
