import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileOperation {
	public static void fileCopy(File in, File out) throws IOException {
		byte [] buffer = new byte[1024*1024];
		int readByte = 0;
		try (FileInputStream fis = new FileInputStream(in.getAbsolutePath());
				FileOutputStream fot = new FileOutputStream(out.getAbsolutePath())) {
			
			for(;(readByte=fis.read(buffer))>0;) {
				fot.write(buffer, 0, readByte);
			}
			
		} catch(IOException e) {
			throw e;
		}
	}

	public static void copyFileWithExt(File source, File receiver, FilenameFilter only) {
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
