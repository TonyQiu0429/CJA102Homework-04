package hw5;

public class MyRectangle {
    private double width;
    private double depth;
    
    // (1)無參數建構子（預設寬10，高20）
    public MyRectangle() {
        this.width = 10;
        this.depth = 20;
    }
    // (2)有參數建構子
    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    //(3)加上 getter/setter，如果要後續修改屬性
    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    //面積方法
    public double getArea() {
        return width * depth;
    }
}
