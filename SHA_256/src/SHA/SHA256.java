
package SHA;

import java.security.MessageDigest;

public class SHA256 {

    public static void main(String[] args) throws Exception {
        // Buat objek MessageDigest dengan algoritma SHA-256
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // Hash string "Hello, world!"
        byte[] hash = md.digest("Hello, world!".getBytes());

        // Cetak hasil hash
        System.out.println(new String(hash));
    }
}
