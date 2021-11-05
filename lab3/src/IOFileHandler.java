import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Cocktail.Cocktail;

public class IOFileHandler {
  
  public static boolean writeToFile(String FileName, ArrayList<Cocktail> arr) throws IOException {
    FileOutputStream fo = new FileOutputStream(new File(FileName));
    ObjectOutputStream oo = new ObjectOutputStream(fo);
    boolean Result = false;
    try {
      for (int i = 0; i < arr.size(); i++) {
        oo.writeObject( arr.get(i) );
      }
      oo.close();
      fo.close();
    } catch (Exception e) {
      System.err.println("writeToFile is bad right now" + e.getMessage());;
    } finally {
      oo.close();
      fo.close();
    }
    return !Result;
  }

  public static ArrayList<Cocktail> readFromFile(String FileName) throws IOException, ClassNotFoundException {

    FileInputStream fi = new FileInputStream(new File(FileName));
		ObjectInputStream oi = new ObjectInputStream(fi);
    ArrayList<Cocktail> tmp = new ArrayList<Cocktail>();
    try {
      while (true) {
        tmp.add((Cocktail) oi.readObject());
      }  
    } catch (Exception e) {
      oi.close();
      fi.close();
      return tmp;

    } finally {
      oi.close();
      fi.close();
      
    }
  }
}
