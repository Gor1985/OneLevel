package JavaRashTwoLesson;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strenght;
    public String adress;
    public String color;

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void initialize(String name){
        this.name=name;
    }
    public void initialize(String name,int weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;

    }
    public void initialize(String name,int age){
        this.name=name;
        this.age=age;
        this.weight=20;
    }
    public void initialize(int weight,String color){
        this.weight=weight;
        this.color=color;
        this.name=null;
        this.adress=null;
        this.age=20;
    }
    public void initialize(int weight,String color,String adress){
        this.weight=weight;
        this.color=color;
        this.adress=adress;
    }


    boolean fight(Cat anotherCat) {
        int a = 0;
        int b = 0;
        boolean c=true;
        if (this.age > anotherCat.age) {
            a = 1;
        } else if (this.age < anotherCat.age) {
            b = 1;
        } else if (this.strenght > anotherCat.strenght) {
            a = 2;
        } else if (this.strenght < anotherCat.strenght) {
            b = 2;
        } else if (this.weight > anotherCat.weight) {
            a = 3;
        } else if (this.weight < anotherCat.weight) {
            b = 3;
        }
        if (a < b) {
            c = true;
            System.out.println("Первый");
        }else {
            c = false;
            System.out.println("Второй");
        }

            return c;
        }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
}
