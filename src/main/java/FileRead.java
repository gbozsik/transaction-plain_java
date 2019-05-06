import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    private StringBuilder builder = new StringBuilder();
    private int count = 0;
    private String line = "";
    private String cvsSplitBy = ",";

    //File what you read
    private String csvFile = "/home/gbozsik/Downloads/CUST_RISK_SEGMENT_RATING.csv";

    public void readFile() {
          BufferedReader br = null;
        StringBuilder builder = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] importedSplittedLine = line.split(cvsSplitBy);

            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
