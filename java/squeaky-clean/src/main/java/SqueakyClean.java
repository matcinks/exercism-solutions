
class SqueakyClean {
    static String clean(String identifier) {
        return omitNonLetters(
                leetSpeakToNormalText(
                        kebabCaseToCamelCase(
                                spacesToUnderscores(identifier)
                        )
                )
        );
    }

    private static String spacesToUnderscores(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                result.append("_");
            } else {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }

    private static String kebabCaseToCamelCase(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '-') {
                result.append(Character.toUpperCase(text.charAt(i + 1)));
                i++;
            } else {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }

    private static String leetSpeakToNormalText(String text) {
        String[][] replacements = new String[][]{
                {"1", "l"},
                {"3", "e"},
                {"4", "a"},
                {"7", "t"},
                {"0", "o"}
        };
        StringBuilder result = new StringBuilder(text.length());

        for (int i = 0; i < text.length(); i++) {
            char nextChar = text.charAt(i);
            if (Character.isLetter(nextChar) || nextChar == '_') {
                result.append(nextChar);
            } else {
                for (String[] replacement : replacements) {
                    if (nextChar == replacement[0].charAt(0)) {
                        result.append(replacement[1]);
                        break;
                    }
                }
            }
        }
        return result.toString();
    }

    private static String omitNonLetters(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) || text.charAt(i) == '_') {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }
}
