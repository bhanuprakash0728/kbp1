import java.io.*;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
	String file = "src\\factbook.csv";
    BufferedReader reader = null;	
    String line = "";
    
    try {
    	reader = new BufferedReader(new FileReader(file));
    	while((line = reader.readLine()) != null) {
    		
    		String[] row = line.split(",");
    		
    	    for(String index : row) {
              System.out.printf("%10s", index); 
    	    }
    	    System.out.println();
    	}
    	
    }
    catch(Exception e) {
    	e.printStackTrace();	
    }
    finally {
    	reader.close();
    }
  }

}
