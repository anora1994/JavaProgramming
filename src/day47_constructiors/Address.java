package day47_constructiors;

public class Address {
   private String adress = "Kuku street";
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    public Address(){
        System.out.println("Address constructor");
        adress = "unknown";
        city = "Unknown";
        state = "Unknown";
        zipCode = "Unknown";
    }
    public Address(String adress, String city, String state, String zipCode){
        setAdress(adress);//reuse the code in the setter method
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if (adress.isEmpty() || adress.length() > 50) {
            System.out.println("ERROR");
            //system exit
        } else {
            this.adress = adress;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


}
