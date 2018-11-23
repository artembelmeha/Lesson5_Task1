import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
}
