package racingcar.model;

public class CarName {

    private final String name;

    public CarName(String name) {
        checkEnglish(name, "이름은 영어여야 합니다.");

        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void checkEnglish(String name, String message) {
        for (int i = 0; i < name.length(); ++i) {
            validAlp(name.charAt(i), message);
        }
    }

    public static void validAlp(char alp, String message) {
        if (alp < 'a' || alp > 'z') {
            throw new IllegalArgumentException(message);
        }

    }

}
