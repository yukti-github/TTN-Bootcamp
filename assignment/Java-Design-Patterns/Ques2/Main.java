// QUES 2-  Implement Factory Pattern to get the Polygon of different type.

package Ques2;


interface Polygon{

    void drawPolygon();
}

class Square implements Polygon{

    @Override
    public void drawPolygon() {
        System.out.println("This polygon is Square\t Each side is 5cm");
    }
}

class Pentagon implements Polygon{

    @Override
    public void drawPolygon() {
        System.out.println("This polygon is pentagon\t Each side is 8cm");
    }
}

class Design{

    Polygon polygon;

    public Polygon getPolygon() {
        return polygon;
    }

    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }
}

class PolygonFactory{

    static Design getDesignObject(String name){
        Design design= new Design();
        switch (name){
            case "polygon-Square":
                design.setPolygon(new Square());
                break;
            case "polygon-Pentagon" :
                design.setPolygon(new Pentagon());
                break;
        }
        return design;
    }
}


public class Main {

          public static void main(String[] args) {

            Design polygonAsSquare = PolygonFactory.getDesignObject("polygon-Square");
            polygonAsSquare.getPolygon().drawPolygon();
            Design polygonAsPentagon = PolygonFactory.getDesignObject("polygon-Pentagon");
            polygonAsPentagon.getPolygon().drawPolygon();
        }
}
