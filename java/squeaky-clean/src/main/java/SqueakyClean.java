
class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder(identifier.length());
        for (int i = 0; i < identifier.length(); i++) {
            char nextCar = identifier.charAt(i);
            if (Character.isWhitespace(nextCar)) {
                result.append('_');
            } else if (nextCar == '-') {
                result.append(Character.toUpperCase(identifier.charAt(i + 1)));
                i++;
            } else if (Character.isDigit(nextCar)) {
                result.append(
                        switch (nextCar) {
                            case '0' -> 'o';
                            case '1' -> 'l';
                            case '3' -> 'e';
                            case '4' -> 'a';
                            case '7' -> 't';
                            default -> nextCar;
                        }
                );
            } else if (Character.isLetter(nextCar)) {
                result.append(nextCar);
            }
        }
        return result.toString();
    }
}