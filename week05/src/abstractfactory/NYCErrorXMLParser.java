package abstractfactory;

public class NYCErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Parsing error message...\nNYC Error Message";
    }
}
