public class ShapeFactory {
    public Shape getShape(String type){
        Shape shape = null;
        switch (type){
            case "Circle":
               shape = new Circle();
                break;
            case  "Square":
                shape = new Square();
                break;
            case "Rectangle":
               shape = new Rectangle();
                break;
            default:
                System.out.println("No choice");
                break;

        }
        return  shape;
    }
}
