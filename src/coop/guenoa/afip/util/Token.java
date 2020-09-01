package coop.guenoa.afip.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Token {

	private static Key key;
	private static Cipher aes;
	private static String carpeta;

	static {
		String clave = "BA8A0D4525ADD01198A80800361B1103";
		// Alternativamente, una clave que queramos que tenga al menos 16 bytes
		// y nos quedamos con los bytes 0 a 15
		 key = new SecretKeySpec(clave.getBytes(), "AES");
		 
		 carpeta = ".cache";
		 
	}

	public static String leer(String filename) throws IOException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,
			NoSuchAlgorithmException, NoSuchPaddingException {
		FileInputStream fileInputStream = null;
		File file = new File(carpeta.concat("/").concat(filename));

		byte[] desencriptado = null;

		if (file.exists()) {

			byte[] encriptado = new byte[(int) file.length()];

			aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
			aes.init(Cipher.DECRYPT_MODE, key);

			fileInputStream = new FileInputStream(file);
			fileInputStream.read(encriptado);
			fileInputStream.close();

			desencriptado = aes.doFinal(encriptado);
			return new String(desencriptado);

		} else {
			return null;
		}

	}

	public static void guardar(String filename, String ticket) throws IllegalBlockSizeException, BadPaddingException,
			NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException {
		// Se obtiene un cifrador AES
		crearDirectorio();
		
		aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
		aes.init(Cipher.ENCRYPT_MODE, key);
		byte[] encriptado = aes.doFinal(ticket.getBytes());

		FileOutputStream fileOuputStream = new FileOutputStream(carpeta.concat("/").concat(filename));
		fileOuputStream.write(encriptado);
		fileOuputStream.close();
	}
	
	private static void crearDirectorio(){

		File directorio=new File(carpeta);
		if(!directorio.exists()) {
			directorio.mkdir();	
		}

	}

}
