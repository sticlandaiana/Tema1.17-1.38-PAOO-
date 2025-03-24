import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNewsTitle {

    public static void main(String[] args) throws MalformedURLException, IOException {


        URL pageUrl = new URL("https://www.ucv.ro");
        URLConnection getConn = pageUrl.openConnection();
        getConn.connect();


        BufferedReader dis = new BufferedReader(new InputStreamReader(getConn.getInputStream()));
        StringBuilder pageContent = new StringBuilder();
        String line;


        while ((line = dis.readLine()) != null) {
            pageContent.append(line);
        }

        String pageText = pageContent.toString();

//        <span class="tab">Știri</span>
//                <script type="text/javascript">tp1.addTabPage( document.getElementById( "tabPage1" ) );</script><div class="trei_stiri"><div class="o_stire">
//                <p><a href="/media/det.php?id=2980"><strong>RELANCE APPEL:DOCTORANTS. Appel à candida ...</strong></a></p>
//                <p>

        Pattern sectionPattern = Pattern.compile("<span class=\"tab\">Știri</span>.*?<div class=\"trei_stiri\">(.*?)</div>", Pattern.DOTALL);
        Matcher sectionMatcher = sectionPattern.matcher(pageText);

        boolean foundFirstNewsTitle = false;


        while (sectionMatcher.find()) {
            String newsSectionContent = sectionMatcher.group(1);


            Pattern titlePattern = Pattern.compile("<strong>(.*?)</strong>");
            Matcher titleMatcher = titlePattern.matcher(newsSectionContent);

            if (titleMatcher.find()) {
                String firstNewsTitle = titleMatcher.group(1).trim();
                System.out.println("Primul titlu din Știri: " + firstNewsTitle);
                foundFirstNewsTitle = true;
                break;
            }
        }

        if (!foundFirstNewsTitle) {
            System.out.println("Nu am găsit un titlu din secțiunea 'Știri'.");
        }
    }
}