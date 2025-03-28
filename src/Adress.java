public class Adress {
    String streetname;
    String streetnumber;
    String city;
    String zipCode;

    public Adress(String streetname, String streetnumber, String city, String zipCode) {
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Adress() {

        this.city = "no city";
        this.streetname = "no streetname";
        this.streetnumber = "no streetnumber";
        this.zipCode = "no zipcode";
    }

    public String toString() {
        return "Adress{" +
                "streetname='" + streetname + '\'' +
                ", streetnumber='" + streetnumber + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
