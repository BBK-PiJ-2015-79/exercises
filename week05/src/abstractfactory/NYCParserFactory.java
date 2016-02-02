package abstractfactory;

public class NYCParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        XMLParser returnParser = null;
        if(parserType.equals("NYCORDER")) {
            returnParser = new NYCOrderXMLParser();
        }
        else if(parserType.equals("NYCERROR")) {
            returnParser = new NYCErrorXMLParser();
        }
        else if(parserType.equals("LondonRESPONSE")) {
            returnParser = new NYCResponseXMLParser();
        }
        else if(parserType.equals("LondonFEEDBACK")) {
            returnParser = new NYCFeedbackXMLParser();
        }
        return returnParser;
    }
}
