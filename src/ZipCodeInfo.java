public class ZipCodeInfo {
    private int zipCode;
    private String city;

    public ZipCodeInfo(int zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return city;
    }
}
