package entities;

public class Library implements UnifyEntityInterface {

    private String name;
    private String address;
    private String area;
    private String phone;

    public Library() {
        super();
    }

    public Library(String name, String address, String area, String phone) {
        this.name = name;
        this.address = address;
        this.area = area;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
