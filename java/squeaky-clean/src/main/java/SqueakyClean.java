
class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder(identifier.length());
        for (int i = 0; i < identifier.length(); i++) {
            char nextCharacter = identifier.charAt(i);
            if (Character.isWhitespace(nextCharacter)) {
                result.append('_');
            } else if (nextCharacter == '-') {
                result.append(convertToCamelCase(identifier.charAt(++i)));
            } else if (Character.isDigit(nextCharacter)) {
                result.append(convertLeetSpeakToNormalText(nextCharacter));
            } else if (Character.isLetter(nextCharacter)) {
                result.append(nextCharacter);
            }
        }
        return result.toString();
    }

    private static char convertLeetSpeakToNormalText(char nextCharacter) {
        return switch (nextCharacter) {
            case '0' -> 'o';
            case '1' -> 'l';
            case '3' -> 'e';
            case '4' -> 'a';
            case '7' -> 't';
            default -> nextCharacter;
        };
    }

    private static char convertToCamelCase(char nextCharacter) {
        return Character.toUpperCase(nextCharacter);
    }
}