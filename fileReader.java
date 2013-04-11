import java.io.*;


public class fileReader{
	public static void main(String args[]){
		BufferedReader reader = null;
		String str="",lastStr="";
		try{
		FileReader fileReader = new FileReader("targetFile.txt");
		reader = new BufferedReader(fileReader);
		while(true){
			if(((str = reader.readLine())!=null) && !str.equals(lastStr)){
				lastStr=str;
				System.out.println(str);
			}
			else{
			Thread.sleep(1);
			}
		}
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		

	}
}
