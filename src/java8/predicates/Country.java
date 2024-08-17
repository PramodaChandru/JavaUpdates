package java8.predicates;

public class Country {

    private String countryName;
    private int countryCode;

    public Country(String countryName, int countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryCode=" + countryCode +
                '}';
    }
}
