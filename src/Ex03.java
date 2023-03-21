public class Ex03 {

    public static void main(String[] args) {
        String beautifulText = "Dies ist ein Test z y Z y";
        char[] charArray = beautifulText.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];

            switch (character) {
                case 'Z':
                    charArray[i] = 'Y';
                    break;
                case 'Y':
                    charArray[i] = 'Z';
                    break;
                case 'z':
                    charArray[i] = 'y';
                    break;
                case 'y':
                    charArray[i] = 'z';
                    break;
                default:
                    // do nothing
                    break;
            }
        }

        String output = new String(charArray);
        System.out.println("Correct text: " + output);
    }

}
