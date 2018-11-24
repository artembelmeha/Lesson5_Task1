import java.io.File;
import java.io.FilenameFilter;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilenameFilter only = new MyFileFilter("doc");
		File receiver = new File("/Users/artembelmeha/eclipse-workspace/Lesson5Task1/receiver");		
		File source = new File("/Users/artembelmeha/eclipse-workspace/Lesson5Task1/source");

		FileOperation.copyFileWithExt(source,receiver,only);
	}

	

}
