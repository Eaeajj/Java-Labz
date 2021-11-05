import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Preloader {
  

  public Preloader(String FileName, Properties props) throws IOException, FileNotFoundException, Exception{
    getConfigFile(FileName, props);
    Preloader.class.getResource("config.txt");
  }

  private static void getConfigFile(String FileName, Properties props) throws Exception, IOException, FileNotFoundException {
    InputStream fs;
    try {
      File f = new File(FileName);
      System.out.println(f.canRead() + " " + f.canWrite() + " " + f.getAbsolutePath());
      if (f.exists()) {
        fs = new FileInputStream(f);
      } else {
        fs = Preloader.class.getResourceAsStream(FileName);
      }
      props.load(fs);
      System.out.println("Config is loaded");
      fs.close();
    } catch (FileNotFoundException e) {
      System.err.println("Config file is not found. Error - "+e.getMessage());
    } catch (IOException e) {
      System.err.println("Config cannot be read. Error - "+e.getMessage());
    } catch (Exception e) {
      throw new Exception("config load error. Error - "+ e.getMessage());
    }
  }



}
