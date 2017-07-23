public class LongWord {
    public static void main(String[] args) {
        args = new String[]{"asd", "asdf", "zxcvb", "wertwqs", "sd"};
        String LongString = args[0];
        int idxLongSring = 0;
        for (String arg : args) {
            if (arg.length() > LongString.length()) {
                LongString = arg;
                idxLongSring = arg.length();
            }
        }
        System.out.println("Long word: " + LongString);
        System.out.println("Length of long word: " + idxLongSring);
    }
}
