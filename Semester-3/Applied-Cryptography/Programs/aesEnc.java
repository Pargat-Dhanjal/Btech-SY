
/**
 * It uses AES 256 bit encryption in CBC mode, with a random IV and a random 256 bit key, which is
 * derived from a password using PBKDF2WithHmacSHA256
 */
import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

class AES {
        private static final String SECRET_KEY = "secret_key_pargat_vatsal";
        private static final String SALT = "saltsalt";

        public static String encrypt(String strToEncrypt) {
                try {
                        byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0, 0, 0 };
                        IvParameterSpec ivspec = new IvParameterSpec(iv);

                        SecretKeyFactory factory = SecretKeyFactory.getInstance(
                                        "PBKDF2WithHmacSHA256");
                        KeySpec spec = new PBEKeySpec(
                                        SECRET_KEY.toCharArray(), SALT.getBytes(),
                                        65536, 256);
                        SecretKey tmp = factory.generateSecret(spec);
                        SecretKeySpec secretKey = new SecretKeySpec(
                                        tmp.getEncoded(), "AES");

                        Cipher cipher = Cipher.getInstance(
                                        "AES/CBC/PKCS5Padding");
                        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
                        return Base64.getEncoder().encodeToString(
                                        cipher.doFinal(strToEncrypt.getBytes(
                                                        StandardCharsets.UTF_8)));
                } catch (Exception e) {
                        System.out.println("Error while encrypting: " + e.toString());
                }
                return null;
        }

        public static String decrypt(String strToDecrypt) {
                try {

                        byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0, 0, 0 };
                        IvParameterSpec ivspec = new IvParameterSpec(iv);
                        SecretKeyFactory factory = SecretKeyFactory.getInstance(
                                        "PBKDF2WithHmacSHA256");
                        KeySpec spec = new PBEKeySpec(
                                        SECRET_KEY.toCharArray(), SALT.getBytes(),
                                        65536, 256);
                        SecretKey tmp = factory.generateSecret(spec);
                        SecretKeySpec secretKey = new SecretKeySpec(
                                        tmp.getEncoded(), "AES");

                        Cipher cipher = Cipher.getInstance(
                                        "AES/CBC/PKCS5PADDING");
                        cipher.init(Cipher.DECRYPT_MODE, secretKey,
                                        ivspec);
                        return new String(cipher.doFinal(
                                        Base64.getDecoder().decode(strToDecrypt)));
                } catch (Exception e) {
                        System.out.println("Error while decrypting: "
                                        + e.toString());
                }
                return null;
        }
}

public class aesEnc {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Plain Text: ");
                String plaintext = sc.nextLine();
                String ciphertext = AES.encrypt(plaintext);
                String decryptedText = AES.decrypt(ciphertext);
                System.out.println("Cipher text: " + ciphertext);
                System.out.println("Now Decrypting....");
                System.out.println("Decrypted Cipher Text: " + decryptedText);
        }
}
