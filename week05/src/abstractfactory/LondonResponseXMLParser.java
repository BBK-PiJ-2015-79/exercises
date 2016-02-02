package abstractfactory;

public class LondonResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing response message...\nLondon Response Message";
    }
}
