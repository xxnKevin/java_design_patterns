package cn.com.patterns.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * 在 io流中,inputStream 的子类FilterInputStream就是一个装饰类，他的子类有 BufferedInputStream,等。
 * 
 * @author liwenyi
 *
 */
public class IOTest {
	
	@Test
	public void testDecorator() throws IOException{
		File file = new File("src/test/resources/test.txt");
		
		//read by byte,这里有装饰体现
		InputStream is = new FileInputStream(file);
		is = new BufferedInputStream(is);
		byte b[] = new byte[1024];
		int length = -1;
		while((length = is.read()) != -1){
			is.read(b,0,length);
			System.out.println(new String(b,"UTF-8"));
		}
		is.close();
		
		//read by line,这里无装饰体现
		InputStream fis=new FileInputStream(file);
        InputStreamReader isr= new InputStreamReader(fis);
        BufferedReader in= new BufferedReader(isr);
        String line=null;
        while(( line = in.readLine()) !=null){
        	System.out.println(line);
        }
        in.close();
        isr.close();
        fis.close();
	}
}
