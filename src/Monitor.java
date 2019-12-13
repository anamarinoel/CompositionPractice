public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResoultions;

    public Monitor( String model, String manufacturer, int size, Resolution nativeResoultions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResoultions = nativeResoultions;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Draw pixel at " + x + ", " + y + "in colour " + color);
    }
}
