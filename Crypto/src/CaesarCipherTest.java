import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {


    @Test
    public void caesarTest1() {
        // Given
        CaesarCipher cipher = new CaesarCipher();

        String Q1 = "The quick brown fox jumped over the lazy brown dog.";
        String A1 = "Qeb nrfzh yoltk clu grjmba lsbo qeb ixwv yoltk ald.";

        String actual = cipher.encrypt(Q1);

        assertTrue(actual.equals(A1));
    }


    @Test
    public void caesarTest2() {
        // Given
        CaesarCipher cipher = new CaesarCipher();

        String Q1 = "Qefp fp x Zxbpxo zfmebo!";
        String A1 = "This is a Caesar cipher!";

        String actual2 = cipher.decrypt(Q1);

        assertTrue(actual2.equals(A1));
    }


}