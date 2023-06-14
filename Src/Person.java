public class Person {
    String name;
    String surname;
    String city;
    String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "call a citizen " + name + " " + surname + " from the city " + city + " can by number " + phone + ".";
    }
}