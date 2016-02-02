package abstractfactory;

public class NYCOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Parsing order message...\nNYC Order Message";
    }
}
