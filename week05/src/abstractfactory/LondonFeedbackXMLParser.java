package abstractfactory;

public class LondonFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing feedback message...\nLondon Feedback Message";
    }
}
