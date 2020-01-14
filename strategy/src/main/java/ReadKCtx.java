import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadKCtx implements ReadFileStrategy{

    public String read(String path) {

        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path + ".KCtx"));
            String line;
            while ((line = br.readLine()) != null)
                builder.append(line + "\n");

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();

    }

}
