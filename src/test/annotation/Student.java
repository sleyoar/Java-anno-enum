package test.annotation;

public class Student {
    @Param(name = "Lucy")
    private String name;
    @Param(age = 38)
    private int age;
    @Param(sex = "女")
    private String sex;
    @Param(address = {"Beijing"})
    private String address;

    public Student() {
    }
    @Param(name = "King",age = 29,address = {"Shangrao"})
    public Student(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Param(age = 198)
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
