import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;

public class ConsumingWithStreamingApi {

    private static final File BANK_LOAN_FILE = new File("c:/Users/malgorzata.majchrowi/MOJE/EDU/TECH/JAVA/LoanApp/resources/bank_loan.json");

    public static void main(String[] args) throws IOException {

        JsonFactory jsonFactory = new JsonFactory();
        JsonParser jsonParser = jsonFactory.createParser(BANK_LOAN_FILE);

        JsonToken jsonToken;
        while ((jsonToken = jsonParser.nextToken())!=null){
            System.out.println(jsonToken);
            System.out.println(jsonParser.getText());

        }

    }

}
