public class Address {
    private String PostalCode;
    private String StreetName;
    private String DoorNo;


    public Address(String PostalCode, String StreetName, String DoorNo) {
        this.PostalCode = PostalCode;
        this.StreetName = StreetName;
        this.DoorNo = DoorNo;
    }


    public String getStreetName() {return StreetName;}
    public void setStreetName(String streetName) {
        this.StreetName = streetName;
    }

    public String getDoorNo() {return DoorNo;}
    public void setDoorNo(String doorNo) {
        this.DoorNo = doorNo;
    }

    public String getPostalCode() {return PostalCode;}
    public void setPostalCode(String postalCode) {
        this.PostalCode = postalCode;
    }




}
