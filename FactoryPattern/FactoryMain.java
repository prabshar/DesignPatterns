public class FactoryMain {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Usage: FactoryMain <Impl1|Impl2>");
            return;
        }

        FactoryInterface factory = FactoryBuilder.getFactory(args[0]);
        if (factory == null) {
            System.out.println("Unknown factory type: " + args[0]);
            System.out.println("Supported types: Impl1, Impl2");
            return;
        }

        factory.produce();
    }
}