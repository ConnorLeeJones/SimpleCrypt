public class ConnorCipher extends ROT13 {

    ConnorCipher() {
        this.rotation = 3;
    }


    public String encrypt(String text) {
        char[] charray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int ascii = (int) charray[i];
            if (i % 3 == 0) {
                charray[i] = (char) ((ascii - rotation));
            } else if (i % 3 == 1){
                charray[i] = (char) ((ascii + rotation));
            } else {
                charray[i] = (char) ((ascii - rotation*2));
            }
        }
        return String.valueOf(charray);
    }

    public String decrypt(String text) {
        char[] charray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int ascii = (int) charray[i];
            if (i % 3 == 0) {
                charray[i] = (char) ((ascii + rotation));
            } else if (i % 3 == 1){
                charray[i] = (char) ((ascii - rotation));
            } else {
                charray[i] = (char) ((ascii + rotation*2));
            }
        }
        return String.valueOf(charray);
    }

}
