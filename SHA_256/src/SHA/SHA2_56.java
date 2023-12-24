package SHA;

import org.apache.commons.codec.digest.DigestUtils;
import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class SHA2_56 {

    public static void main(String[] args) throws Exception {
        // Hash string "Hello, world!"
        String hash = DOMUtils.sha256Hex("Hello, world!");

        // Cetak hasil hash
        System.out.println(hash);
    }
}

