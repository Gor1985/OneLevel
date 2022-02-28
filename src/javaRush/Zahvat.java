package javaRush;



public class Zahvat {
    private String name;
    private int age;
    private int number;
    private int many;
    private String name2;
    private String name3;


    public Zahvat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Zahvat(String name,String name2,String name3) {
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
    }

    public String getName3() {
        return name3;

    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName2() {
        return name2;
    }

    public Zahvat(String name, String name2) {
        this.name = name;
        this.name2=name2;
    }

    public void setMany(int many) {
        this.many = many;
    }

    public int getMany() {
        return many;
    }

    public Zahvat(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public Zahvat() {
        this.name = name;
        this.many=many;
    }




    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
