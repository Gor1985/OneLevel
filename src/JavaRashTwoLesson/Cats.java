package JavaRashTwoLesson;

public class Cats {
    public String name;
    public int age;
    public int weight;
    public int strenght;
    public String adress;
    public String color;

    public Cats(String name) {
        this.name = name;
    }

    public Cats(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight=20;
    }

    public Cats(int weight,String color) {
        this.weight = weight;
        this.color=color;
        this.name=null;
        this.age=10;
        this.adress=null;
    }

    public Cats(int weight,String color,String adress) {
        this.weight = weight;
        this.color=color;
        this.adress=adress;
    }
}
