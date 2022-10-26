package com.abdullah_aladham.kalemati.Security.DBSec;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.SerializationUtils;

import jakarta.persistence.AttributeConverter;
import lombok.SneakyThrows;

@Configuration
public class AES_Encrypter implements AttributeConverter<Object,String>{
private final String Enc_Key="This-is-not-the-real-key";//this key is just for testing purpose
private final String encryptionCipher="AES";
private  Key key;
private  Cipher cipher;


	private Key getKey() {
		if(key==null) 
		key=new SecretKeySpec(Enc_Key.getBytes(),encryptionCipher);
		
	return key;
}



public  Cipher getCipher() throws GeneralSecurityException {
	if(cipher==null)
		cipher.getInstance(encryptionCipher);
	return cipher;
}
private void initCipher(int encryptMode) throws InvalidKeyException, GeneralSecurityException {
	getCipher().init(encryptMode,getKey());
}



	@SneakyThrows
	@Override
	public String convertToDatabaseColumn(Object attribute) {
		// TODO Auto-generated method stub
	if(attribute==null)
		return null;
	try {
		initCipher(cipher.ENCRYPT_MODE);
	} catch (GeneralSecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	byte[] bytes=SerializationUtils.serialize(attribute);
	return Base64.getEncoder().encodeToString(getCipher().doFinal(bytes));
	}
	
	@SneakyThrows
	@Override
	public Object convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		if(dbData==null)
			return null;
		try {
			initCipher(cipher.DECRYPT_MODE);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] bytes=getCipher().doFinal(Base64.getDecoder().decode(dbData));
		return SerializationUtils.deserialize(bytes);
	}

}
