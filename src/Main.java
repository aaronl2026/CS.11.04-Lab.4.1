public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') count = count + 1;
            else if (str.charAt(i) == ')') count = count - 1;
        }
        if (count != 0) return false;
        return true;
    }

    // 2. reverseInteger
    public static String reverseInteger(int numbers) {
        String numstring = Integer.toString(numbers);
        String finalstring = "";
        for (int i = 0; i < numstring.length(); i++) {
            finalstring = numstring.charAt(i) + finalstring;
        }
        return finalstring;
    }

    // 3. encryptThis
    public static String encryptThis(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1) {
                result.append((int) word.charAt(0)).append(" ");
            } else if (word.length() == 2) {
                result.append((int) word.charAt(0)).append(word.charAt(1)).append(" ");
            } else {
                result.append((int) word.charAt(0)).append(word.charAt(word.length() - 1))
                        .append(word.substring(2, word.length() - 1)).append(word.charAt(1)).append(" ");
            }
        }

        return result.toString().trim();
    }

    // 4. decipherThis
    public static String decipherThis(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String numericPart = word.replaceAll("[^0-9]", "");

            if (!numericPart.isEmpty()) {
                int asciiCode = Integer.parseInt(numericPart);
                char firstChar = (char) asciiCode;

                String remainingChars = word.replaceAll("[0-9]", "");

                if (remainingChars.length() == 1) {
                    result.append(firstChar).append(remainingChars).append(" ");
                } else if (remainingChars.length() == 2) {
                    result.append(firstChar).append(remainingChars.charAt(1)).append(remainingChars.charAt(0)).append(" ");
                } else {
                    result.append(firstChar).append(remainingChars.charAt(remainingChars.length() - 1))
                            .append(remainingChars.substring(1, remainingChars.length() - 1)).append(remainingChars.charAt(0)).append(" ");
                }
            }
        }

        return result.toString().trim();
    }
}


