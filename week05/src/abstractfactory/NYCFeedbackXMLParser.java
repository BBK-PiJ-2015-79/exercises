package abstractfactory;

public class NYCFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Parsing feedback message...\nNYC Feedback Message";
    }
}
