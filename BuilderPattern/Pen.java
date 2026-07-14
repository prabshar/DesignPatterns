public class Pen {
    public String color;
    public String type;

    public Pen setColor(String color) {
        this.color = color;
        return this;
    }

    public Pen setType(String type) {
        this.type = type;
        return this;
    }

    public void getPen() {
        System.out.println("Writing with a " + color + " " + type + " pen.");
    }
}
