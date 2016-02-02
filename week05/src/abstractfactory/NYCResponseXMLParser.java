package abstractfactory;

public class NYCResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Response order message...\nNYC Response Message";
    }
}
