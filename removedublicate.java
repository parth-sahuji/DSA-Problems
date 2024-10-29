public class removedublicate {

    public static void removedubch(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar - 'a']) {
            // duplicate
            removedubch(str, idx + 1, newstr, map);
        } else {
            // not duplicate
            map[currchar - 'a'] = true;
            removedubch(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\nJAI BHOLENATH\n\n");

        String str = "appnnacollege";
        removedubch(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
