
public class ROT13  {
    public Integer rotation;

    ROT13(Character cs, Character cf) {
        this.rotation = cf - cs;
    }

    ROT13() {
        this.rotation = 13;
    }

    public String crypt(String text) throws UnsupportedOperationException {
       return encrypt(text);
    }

    public String encrypt(String text) {
        return changeString(text, this.rotation);
    }

    public String decrypt(String text) {
        return changeString(text, 26 - this.rotation);
    }

    public String changeString(String str, Integer rot) {
        char[] charray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
                if (Character.isLowerCase(charray[i])) {
                    charray[i] = (char) (97 + ((charray[i] + rot - 97) % 26));
                } else if (Character.isUpperCase(charray[i])) {
                    charray[i] = (char) (65 + ((charray[i] + rot - 65) % 26));
                }
        }
        return String.valueOf(charray);
    }


    public static String rotate(String s, Character c) {
        String result = s;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                result = s.substring(i);
                result += s.substring(0, i);
                break;
            }
        }
        return result;
    }

}
