package Database;
public class SearchBean
{
    String state;
    String size;
private String firstname;
    private String lastname;
    private String email;
    private String address;
    
    private String zip;
    SearchBean()
    {
        
    }
SearchBean(String firstname,String lastname,String email,String address,String state,String size,String zip)
{
    this.state=state;
    this.size=size;
    this.address=address;
    this.firstname=firstname;
    this.email=email;
    this.zip=zip;
    this.lastname=lastname;
    
}
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }
   
    private String Specification;
    private String rent;
    private String tenure;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
