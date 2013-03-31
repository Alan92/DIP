public class Prueba{
 
  public static void main(String[] args){
    Libro l = new Libro(); //Datos del libro
    XMLPersister p = new XMLPersister();
    l.setPersister(p);
    l.guardar();
  }
 
}
