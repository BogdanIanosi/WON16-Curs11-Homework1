import java.time.Year;

public class BirthYearCalculator {
    private int age;

    public BirthYearCalculator(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age is invalid");
        }
        this.age = age;
    }

    public int getBirthYear() {
        int currentYear = Year.now().getValue();
        return currentYear - age;
    }
}
