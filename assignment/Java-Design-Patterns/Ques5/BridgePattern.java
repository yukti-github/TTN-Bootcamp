//QUES5- Implement Bridge Design Pattern for Color and Shape such that Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.

package Ques5;

interface ColorName{
    String getColorName();
}

class RedColor implements ColorName{
    @Override
    public String getColorName() {
        return "Red";
    }
}
class BlueColor implements ColorName{
    @Override
    public String getColorName() {
        return "Blue";
    }
}

abstract class Shapes{
    String shapeSize;
    ColorName colorName;

    public Shapes(String shapeSize, ColorName colorName) {
        this.shapeSize = shapeSize;
        this.colorName = colorName;
    }
}

class Rectangle extends Shapes{
    String specification;
    public Rectangle(String specification, ColorName colorName) {
        super("Mid-sized rectangle", colorName);
        this.specification=specification;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shapeSize='" + shapeSize + '\'' +
                ", colorName=" + colorName.getColorName() +
                ", specification='" + specification + '\'' +
                '}';
    }
}
class Circle extends Shapes{
    Integer radius;

    public Circle(Integer radius,ColorName colorName) {
        super("small-circle", colorName);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeSize='" + shapeSize + '\'' +
                ", colorName=" + colorName.getColorName() +
                ", radius=" + radius + " cm "+
                '}';
    }
}
public class BridgePattern {
    public static void main(String[] args) {
        Rectangle blueRectangle= new Rectangle("Rectangle with blue color",new BlueColor());
        Rectangle redRectangle= new Rectangle("Rectangle with red color",new RedColor());
        System.out.println(blueRectangle);
        System.out.println(redRectangle);

        Circle redCircle= new Circle(5,new RedColor());
        System.out.println(redCircle);
    }
}
