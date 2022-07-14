import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args)
    {
        
        String nomLibro = JOptionPane.showInputDialog("Digite el nombre del libro: ");
        String nomAutor = JOptionPane.showInputDialog("Digite el nombre del autor: ");
        int añoEdicion =Integer.parseInt(JOptionPane.showInputDialog("Digite el año de salida del libro: "));
        String coleccion = JOptionPane.showInputDialog("El libro '"+ nomLibro +"' pertenece a una colección");
        String lujo = JOptionPane.showInputDialog("El libro: " + nomLibro + " es edicion de lujo: ");
        
        if(coleccion.equals("si"))
        {
            String nomColeccion = JOptionPane.showInputDialog("Digite el nombre de la colección: ");
            int numColeccion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que ocupa en la collecion: "));
            CaracteristicasLibro miCaracteristicasLibro = new CaracteristicasLibro(nomLibro,nomAutor,añoEdicion,lujo,coleccion,nomColeccion,numColeccion);
            miCaracteristicasLibro.organizarInformacion1();
            JOptionPane.showMessageDialog(null,("La informacion del libro es\n"+ miCaracteristicasLibro.mostrarInformación()));
        }
        if(coleccion.equals("no"))
        {
            CaracteristicasLibro miCaracteristicasLibro = new CaracteristicasLibro(nomLibro,nomAutor,añoEdicion,lujo,coleccion);
            miCaracteristicasLibro.organizarInformacion2();
            JOptionPane.showMessageDialog(null,("La informacion del libro es\n" + miCaracteristicasLibro.mostrarInformación()));
        }
        
        
    }
}
