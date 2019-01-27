import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConsumingWithDomApi {

    private static final File BANK_LOAN_FILE = new File("c:/Users/malgorzata.majchrowi/MOJE/EDU/TECH/JAVA/LoanApp/resources/bank_loan.json");

    public static void main(String[] args) throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(BANK_LOAN_FILE);
    }

}
