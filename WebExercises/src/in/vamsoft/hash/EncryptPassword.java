package in.vamsoft.hash;
/**
 * 
 * @author vamsoft
 *
 */

public class EncryptPassword {
  /**
   * Method to encrypt password.
   * 
   * @param args
   */
  public static String encrypt(String password){
    String encryptPassword=null;
    encryptPassword=AeSimpleSHA1.SHA1(password);
    System.out.println("Encryted text:" + encryptPassword);
    return encryptPassword;
  }
}
