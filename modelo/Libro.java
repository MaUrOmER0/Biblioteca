public class Libro 
{
    protected String nomLibro;
    protected String nomAutor;
    protected int añoEdicion;
    protected String informacion;
    protected String lujo;
    protected String coleccion;

    public Libro(String nomLibro, String nomAutor, int añoEdicion, String lujo , String coleccion) 
    {
        this.nomLibro = nomLibro;
        this.nomAutor = nomAutor;
        this.añoEdicion = añoEdicion;
        this.lujo = lujo;
        this.coleccion = coleccion;
    }
    
    public String mostrarInformación()
    {
        return this.informacion;
    }
    
  
}
