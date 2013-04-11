import java.io.*;


public class BusBeepFileReader {

  public static void main(String args[]) throws InterruptedException {
    int atSpeed = Integer.valueOf(args[0]);
    try {
      readFile(atSpeed);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void readFile(int atSpeed) throws IOException, InterruptedException {
    BufferedReader reader = null;
    String str = "",lastStr = "";
    FileReader fileReader = new FileReader("targetFile.txt");
    reader = new BufferedReader(fileReader);
    while(true){
        boolean beeps = ( (str = reader.readLine()) != null);
        //boolean useless = !str.equals(lastStr);
      if( beeps ){
        System.out.println(str);
      }
        Thread.sleep(atSpeed);
    }
  }
}
