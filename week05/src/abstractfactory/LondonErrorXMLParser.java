package abstractfactory;

public class LondonErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing error message...\nLondon Error Message";
    }
}
