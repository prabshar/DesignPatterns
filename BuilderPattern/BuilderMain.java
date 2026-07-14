public class BuilderMain {
    public static void main(String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("Usage: BuilderMain <color> <type>");
            return;
        }

        Pen pen = new Pen()
                .setColor(args[0])
                .setType(args[1]);
        pen.getPen();
    }

}
