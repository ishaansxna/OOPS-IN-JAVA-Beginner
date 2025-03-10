public class AREA_PERIMETER {
    private double length;
    private double width;

    public AREA_PERIMETER(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        AREA_PERIMETER rect = new AREA_PERIMETER(5, 10);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}