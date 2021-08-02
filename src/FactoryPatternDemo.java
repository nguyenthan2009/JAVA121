public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory demo = new ShapeFactory();
         demo.getShape("Circle").draw();
         demo.getShape("Rectangle").draw();
         demo.getShape("Square").draw();
    }
}
