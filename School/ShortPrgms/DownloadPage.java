import java.io.*;
import java.net.URL;
import java.net.URLConnection;
public class DownloadPage {

    public static void main(String[] args) throws IOException {

        // Make a URL to the web page
        URL url = new URL("https://admissions.illinois.edu/Discover/Academics/majors_college");
        
        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        // read each line and write 
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}