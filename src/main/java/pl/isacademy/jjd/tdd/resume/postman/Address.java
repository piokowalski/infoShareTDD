package pl.isacademy.jjd.tdd.resume.postman;

public class Address {

    private String city;

    private String street;

    private String houseNumber;

    private String flatNumber;


    public Address(String city, String street, String houseNumber, String flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public String getFlatNumber() {
        return this.flatNumber;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Address)) return false;
        final Address other = (Address) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$street = this.getStreet();
        final Object other$street = other.getStreet();
        if (this$street == null ? other$street != null : !this$street.equals(other$street)) return false;
        final Object this$houseNumber = this.getHouseNumber();
        final Object other$houseNumber = other.getHouseNumber();
        if (this$houseNumber == null ? other$houseNumber != null : !this$houseNumber.equals(other$houseNumber))
            return false;
        final Object this$flatNumber = this.getFlatNumber();
        final Object other$flatNumber = other.getFlatNumber();
        if (this$flatNumber == null ? other$flatNumber != null : !this$flatNumber.equals(other$flatNumber))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $street = this.getStreet();
        result = result * PRIME + ($street == null ? 43 : $street.hashCode());
        final Object $houseNumber = this.getHouseNumber();
        result = result * PRIME + ($houseNumber == null ? 43 : $houseNumber.hashCode());
        final Object $flatNumber = this.getFlatNumber();
        result = result * PRIME + ($flatNumber == null ? 43 : $flatNumber.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Address;
    }
}
