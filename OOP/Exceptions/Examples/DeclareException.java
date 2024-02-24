package OOP.Exceptions.Examples;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class DeclareException {

  public void readFile() throws FileNotFoundException{
    File file = new File("./Text.txt");
    FileReader fr = new FileReader(file);
    System.out.println(fr);
  
    
  }
  public static void main(String[] args) {
    
  }
  
}
