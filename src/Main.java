import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilenameFilter only = new MyFileFilter("doc");
		File receiver = new File("/Users/artembelmeha/eclipse-workspace/Lesson5Task1/receiver");		
		File source = new File("/Users/artembelmeha/eclipse-workspace/Lesson5Task1/source");

		String [] s= source.list(only);

		for (String string : s) {

			File f = new File(source.getAbsolutePath(),string);
			File res = new File(f.getAbsolutePath().replaceAll("/source/", "/receiver/"));

			try {
				FileOperation.fileCopy(f,res);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
