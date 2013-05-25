package utilitarios;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA1{
    private static MessageDigest md;
    private static byte[] buffer, digest;
    private static String hash;
    
    public static String getHash(String message) throws NoSuchAlgorithmException{
        hash = "";
        buffer = message.getBytes();
        md = MessageDigest.getInstance("SHA1");
        md.update(buffer);
        digest = md.digest();
        for(byte aux : digest){
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) hash += "0";
                hash += Integer.toHexString(b);
        }
        return hash;
    }
}