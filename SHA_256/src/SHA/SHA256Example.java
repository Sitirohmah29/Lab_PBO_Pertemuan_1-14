package SHA;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Example {

    public static void main(String[] args) {
        String input = "Hello, SHA-256!";

        try {
            // Buat instance dari MessageDigest dengan algoritma SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Ambil byte dari input string
            byte[] hash = digest.digest(input.getBytes());

            // Ubah byte menjadi format hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            System.out.println("Input: " + input);
            System.out.println("SHA-256 Hash: " + hexString.toString());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
