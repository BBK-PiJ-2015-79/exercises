package abstractfactory;

public class LondonOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing order message...\nLondon Order Message";
    }
}
