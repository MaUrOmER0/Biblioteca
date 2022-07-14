package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author njpae
 */
public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbX;
    private JLabel lbY;
    private JTextField tfX;
    private JTextField tfY;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/libro.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,15,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas X e Y
        lbX = new JLabel("Nombre Libro ");
        lbX.setBounds(250,40,40,20);
        add(lbX);
        
        lbY = new JLabel("Autor ");
        lbY.setBounds(250,70,40,20);
        add(lbY);
        
        //Creación y adición de campos de texto
        tfX = new JTextField();
        tfX.setBounds(300, 40, 40, 20);
        add(tfX);
        
        tfY = new JTextField();
        tfY.setBounds(300, 70, 40, 20);
        add(tfY);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);  
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getTfX()
    {
        return tfX.getText();
    }
    
    public String getTfY()
    {
        return tfY.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
    }
}
