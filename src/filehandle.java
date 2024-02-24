import java.io.*;
public class filehandle 
{
 protected void writer(String filename,String Hash)
 {
	try
	{
		File fox=new File(filename);
		FileWriter fw=new FileWriter(fox);
		fw.write(Hash);
		fox.setReadOnly();
		fw.close();
		}
	catch(IOException e)
	{
		e.printStackTrace();
		
	}
	
 }
 protected void reader()
 {
	 
 }
 protected void rewrite()
 {
	 
 }
 protected void delete()
{
	 
}
 
}
