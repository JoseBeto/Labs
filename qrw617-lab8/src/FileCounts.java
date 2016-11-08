import java.io.*;
import java.util.Scanner;

public class FileCounts {
    private File file;
    
    public FileCounts(File file) {
        this.file = file;
    }
 
    public int lineCount() throws FileNotFoundException{
    	int count = 0;
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				count++;
				scanner.nextLine();
			}
			scanner.close(); 
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Error Reading File");
		}
        return count;
    }
    
    public int tokenCount() throws FileNotFoundException{
    	int count = 0;
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()){
				count++;
				scanner.next();
			}
			scanner.close(); 
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Error Reading File");
		}
        return count;
    }
    
    public int charCount() throws IOException{
    	int count = 0, i;
    	String c = "";
    	BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            while((i = reader.read()) != -1){
            	c = String.valueOf((char) (i));
            	if(c.matches("[a-zA-Z]+")){
            		count++;
            	}
            }
            reader.close();
        } catch (IOException e) {
        	throw new IOException("IO Error");
        }
    	return count;
    }
    
    public int byteCount() throws IOException{
    	FileInputStream in = null;
    	int count = 0;
		try {
			in = new FileInputStream(file);
			count = in.available();
			in.close();
		} catch (IOException e) {
			throw new IOException("IO Error");
		}
		return count;
    }
}
