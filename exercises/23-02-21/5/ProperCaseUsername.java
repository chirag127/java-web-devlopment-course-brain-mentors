public class ProperCaseUsername {
    public static void main(String[] args) {
        String username = args[0];
        String[] nameParts = username.split(" ");
        StringBuilder properCaseUsername = new StringBuilder();
        for (String namePart : nameParts) {
            if (namePart.length() > 0) {
                String firstChar = namePart.substring(0, 1);
                String restChars = namePart.substring(1);
                properCaseUsername.append(firstChar.toUpperCase() + restChars.toLowerCase() + " ");
            }
        }
        System.out.println(properCaseUsername.toString().trim());
    }
}
