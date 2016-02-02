package abstractfactory;

public class LondonParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        XMLParser returnParser = null;
        if(parserType.equals("LondonORDER")) {
            returnParser = new LondonOrderXMLParser();
        }
        else if(parserType.equals("LondonERROR")) {
            returnParser = new LondonErrorXMLParser();
        }
        else if(parserType.equals("LondonRESPONSE")) {
            returnParser = new LondonResponseXMLParser();
        }
        else if(parserType.equals("LondonFEEDBACK")) {
            returnParser = new LondonFeedbackXMLParser();
        }
        return returnParser;
    }
}
