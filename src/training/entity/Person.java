package training.entity;

public class Person {
    private String personId;

    String name;

//    public String name;

    protected Integer age;

//    public Integer age;

    public String address;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void demoPrivate(){
        System.out.println("private");
    }

    void demoDefault(){
        System.out.println("default");
    }

    public void demoPublic(){
        System.out.println("public");
    }

    protected void demoProtected(){
        System.out.println("protected");
    }
}
