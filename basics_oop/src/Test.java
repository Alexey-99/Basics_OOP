import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;

public class Test {

	public static void main(String[] args) {
		 try {
	            // исходный файл
	            File file = new File("demo.txt");
	            file.createNewFile();
	            if (!file.exists()) {
	                throw new NoSuchFileException("The source file does not exist.");
	            }
	 
	            // целевой файл
	            File dest = new File("demo_success.txt");
	            //dest.createNewFile();
	            if (dest.exists()) {
	                throw new FileAlreadyExistsException("The destination path exists.");
	            }
	 
	            boolean success = file.renameTo(dest);
	            if (success) {
	                System.out.println("File successfully renamed");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
