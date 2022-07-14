public class CaracteristicasLibro extends Libro
{
    protected String nomColeccion;
    protected int numColeccion;

    public CaracteristicasLibro(String nomLibro, String nomAutor, int añoEdicion, String lujo, String coleccion,String nomColeccion, int numColeccion) 
    {
        super(nomLibro, nomAutor, añoEdicion, lujo, coleccion);
        this.nomColeccion = nomColeccion;
        this.numColeccion = numColeccion;
    }

    public CaracteristicasLibro(String nomLibro, String nomAutor, int añoEdicion, String lujo, String coleccion) 
    {
        super(nomLibro, nomAutor, añoEdicion, lujo, coleccion);
    }
    
    

    
    
    
    
    public void organizarInformacion1()
    {
        informacion = nomLibro + "\n" + nomAutor + "\n" + añoEdicion + "\nLa edicion "+ lujo +" es de lujo"+"\nColección: "+ nomColeccion +" #"+ numColeccion;
    }
    
    public void organizarInformacion2()
    {
        informacion = nomLibro + "\n" + nomAutor + "\n" + añoEdicion + "\nLa edicion "+ lujo +" es de lujo" + "\nEl libro no pertenece a ninguna colección";
    }
    
    
    
    
}
