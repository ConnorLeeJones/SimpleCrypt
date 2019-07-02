import org.junit.Test;

import static org.junit.Assert.*;

public class ConnorCipherTest {


    @Test
    public void connorTest1() {
        // Given
        ConnorCipher cipher = new ConnorCipher();

        String Q1 = "This is the Connor cipher!";
        String A1 = "Qkcp#cp#neh\u001A@rhkrl\u001Dfcmk_o$";

        String actual = cipher.encrypt(Q1);

        assertTrue(actual.equals(A1));
    }


    @Test
    public void connorTest2() {
        // Given
        ConnorCipher cipher = new ConnorCipher();

        String Q1 = "Fw\u001Atdm\u001Dwbb#\\ixlpw\u001Ali\u001Aqlgbv";
        String A1 = "It was the blurst of times";

        String actual2 = cipher.decrypt(Q1);

        assertTrue(actual2.equals(A1));
    }


}