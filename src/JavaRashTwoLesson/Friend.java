package JavaRashTwoLesson;

public class Friend {
    String name=" ";
    int age= 0;
    boolean gender=true;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void initialize(String name){
      this.name=name;
  }
  public void initialize(String name, int age){
      this.name=name;
      this.age=age;

  }
  public void initialize(String name, int age, boolean gender){
      this.name=name;
      this.age=age;
      this.gender=true;

  }


}
