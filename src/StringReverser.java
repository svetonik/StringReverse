public class StringReverser {
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] output = str.toCharArray();
        int start = 0;
        int end = output.length - 1;

        for (; start < end; ) {
            if (!Character.isLetter(output[start])) {
                start++; // Пропускаем небуквенный символ слева
            } else if (!Character.isLetter(output[end])) {
                end--; // Пропускаем небуквенный символ справа
            } else {
                // Оба символа — буквы, меняем их местами
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;
            }
        }

        return new String(output);
    }
}