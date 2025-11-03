package entities;

public class Rectangle {
    public double width;
    public double height;

    public double areaRetangule(){
        return width * height;
    }

    public double parimeter(){
        return 2*(height + width);
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }

}
