package JavaRashTwoLesson;

public class Restangles {
    int top;
    int left;
    int width;
    int height;

    public Restangles(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }


    public Restangles(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height=width;
    }

    public Restangles(Restangles restangles) {
        this.left = restangles.left;
        this.top = restangles.top;
        this.width = restangles.width;
        this.height = restangles.height;
    }



    public Restangles(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
}
