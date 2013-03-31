public class Libro{
  private String ISBN;
  private String title;
  private int year;
  private DBPersister p = new DBPersister();
  // mas datos...
 
  public void guardar(){
    p.save(this);
  }
}
