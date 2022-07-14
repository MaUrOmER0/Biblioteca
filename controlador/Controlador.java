public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Modelo model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Modelo pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.bCalcular.addActionListener(this);
        this.venPrin.miPanelOperaciones.bBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.bSalir.addActionListener(this);
    }

    //Metodo de atención de eventos
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("calcular"))
        {
            model.setX(Integer.parseInt(venPrin.miPanelEntradaDatos.getTfX()));
            model.setY(Integer.parseInt(venPrin.miPanelEntradaDatos.getTfY()));
            model.hallarMayor();
            venPrin.miPanelResultado.mostrarResultado(model.getMayor());
        }
        
        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}