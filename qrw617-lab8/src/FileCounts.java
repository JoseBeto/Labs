import java.io.*;
import java.util.Scanner;

/**
 * FileCounts class will calculate the chosen files lines, 
 * 	tokens, chars and bytes.
 * 
 * @author Jose Bocanegra
 */

public class FileCounts {
    private File file;
    
    /**
     * FileCounts constructor stores the file
     * 	given in file
     * @param file
     */
    public FileCounts(File file) {
        this.file = file;
    }
 
    /**
     * lineCount counts the number of lines in file
     * 	while checking for errors.
     * @return int
     * @throws FileNotFoundException
     */
    public int lineCount() throws FileNotFoundException{
    	int count = 0;
		Scanner scanner;
		try {
			scanner = new Scanner(new BufferedReader(new FileReader(file)));
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
    
    /**
     * tokenCount counts the number of tokens in file
     * 	while checking for errors.
     * @return int
     * @throws FileNotFoundException
     */
    public int tokenCount() throws FileNotFoundException{
    	int count = 0;
		Scanner scanner;
		try {
			scanner = new Scanner(new BufferedReader(new FileReader(file)));
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
    
    /**
     * charCount counts the number of chars in file
     * 	while checking for errors. 
     * @return int
     * @throws IOException
     */
    public int charCount() throws IOException{
    	int count = 0;
    	BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while(reader.read() != -1){
            	count++;
            }
            reader.close();
        } catch (IOException e) {
        	throw new IOException("IO Error");
        }
    	return count;
    }
    
    /**
     * byteCount counts the number of bytes of the file
     * 	while checking for IO errors.
     * @return int
     * @throws IOException
     */
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
