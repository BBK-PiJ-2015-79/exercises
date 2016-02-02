package abstractfactory;

public abstract class ParserFactoryProducer {
    //This is going to be static as the script calls it in a static context...
    public static AbstractParserFactory getFactory(String factoryType) {
        AbstractParserFactory factory = null;
        if(factoryType.equals("NYCFactory")) {
            //return null;
            factory = new NYCParserFactory();
        }
        else if(factoryType.equals("LondonFactory")) {
            //return null;
            factory = new LondonParserFactory();
        }
        return factory;
    }
}
