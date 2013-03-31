public class Libro{
  private String ISBN;
  private String title;
  private int year;
  private Persister persister;
  // mas datos...
 
  // Con este setter pasamos el Persister concreto
  public void setPersister(Persister persister){
    this.persister = persister;
  }
  public void guardar(){
    persister.save(this);
  }
}
