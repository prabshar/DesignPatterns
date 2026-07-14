public class FactoryBuilder {
    public static FactoryInterface getFactory(String type) {
        if (type.equals("Impl1")) {
            return new FactoryImpl1();
        } else if (type.equals("Impl2")) {
            return new FactoryImpl2();
        }
        return null;
    }
}