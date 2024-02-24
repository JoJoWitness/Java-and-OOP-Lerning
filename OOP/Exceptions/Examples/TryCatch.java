package OOP.Exceptions.Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
  public void readFile() throws FileNotFoundException, IOException{
    File file = new File("/home/ryuk/Repos/Java-and-OOP-Lerning/OOP/Exceptions/Examples/text.txt");
    FileReader fr = new FileReader(file);
    BufferedReader bf = new BufferedReader(fr);

    String line;
    while((line = bf.readLine()) != null){
      System.out.println(line);
    }
    System.out.println(fr);
  }

  public void readFile2(){
    try{
      readFile();
    } catch( FileNotFoundException ex){
      System.out.println("The file was not found");
    } catch(IOException ex){
      System.out.println("The was a verified exception");
    } finally
  }


  public static void main(String[] args) {
    
    TryCatch test = new TryCatch();
    test.readFile2();

  }
  
}
