package JavaRashTwoLesson;

public class Dog {
    String name;
    int age;
    int height;
    String color;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void initialize(String name){
        this.name=name;
        }
        public void initialize(String name,int height){
        this.name=name;
        this.height=height;
        }
    public void initialize(String name,int height,String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
