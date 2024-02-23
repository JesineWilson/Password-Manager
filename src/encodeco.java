import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

 class encodeco 
{
	private static String encrypt(String text,SecretKey key)
	{
		try
		{
			Cipher ver = Cipher.getInstance("AES");
			ver.init(Cipher.ENCRYPT_MODE,key);
			
			byte[] encryptedbytes=ver.doFinal(text.getBytes(StandardCharsets.UTF_8));
			return Base64.getEncoder().encodeToString(encryptedbytes);		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return null;
	}

}
 private static String decrypt(String text,SecretKey key)
 {
	 Cipher ver=Cipher.getInstance("AES");
	 ver.init(Cipher.DECRYPT_MODE,key);
	 byte[] encryptedBytes=Base64.get
	 
 
 
 
 
 }
