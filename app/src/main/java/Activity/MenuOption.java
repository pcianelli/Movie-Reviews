package Activity;

public enum MenuOption {
    QUIT(0),
    ADD_MOVIE(1),
    ADD_MOVIE_REVIEW(2),
    LOOK_UP_MOVIE_BY_TITLE(3);

    /**
     * Get the minimum optionNum value for the entire menu
     * @return The minimum optionNum
     */
    public static int min() {
        int result = Integer.MAX_VALUE;
        for (MenuOption option : values()) {
            if (option.optionNum < result) {
                result = option.optionNum;
            }
        }
        return result;
    }

    /**
     * Get the maximum optionNum value for the entire menu
     * @return The maximum optionNum
     */
    public static int max() {
        int result = Integer.MIN_VALUE;
        for (MenuOption option : values()) {
            if (option.optionNum > result) {
                result = option.optionNum;
            }
        }
        return result;
    }

    /**
     * Create a string representation of the menu
     * that's suitable for displaying to the user
     * @return A friendly representation of the menu
     */
    public static String renderMenu() {
        StringBuilder sb = new StringBuilder("Available Options\n-----------------\n");
        for (MenuOption option : values()) {
            sb.append(String.format("%d) %s%n", option.optionNum, option.toFriendlyString()));
        }
        return sb.toString();
    }

    /**
     * Convert an option number into a MenuOption
     * @param optionNum
     * @return The MenuOption that corresponds to the given option number
     * @throws IllegalArgumentException if the given optionNum is not valid
     */
    public static MenuOption fromOptionNum(int optionNum) {
        if (optionNum < min() || optionNum > max()) {
            throw new IllegalArgumentException(
                    String.format("optionNum out of range. Must be between %d and %d", min(), max()));
        }

        for (MenuOption option : values()) {
            if (option.optionNum == optionNum) {
                return option;
            }
        }

        throw new RuntimeException("Unable to find MenuOption for given optionNum");
    }

    private final int optionNum;

    private MenuOption(int optionNum) {
        this.optionNum = optionNum;
    }

    private String toFriendlyString() {
        return name()
                .replaceAll("_", " ")
                .toLowerCase();
    }

}
