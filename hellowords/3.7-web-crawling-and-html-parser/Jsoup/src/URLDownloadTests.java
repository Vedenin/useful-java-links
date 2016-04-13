import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.nio.charset.Charset;


/**
 * JSoup Hello World
 *
 * Created by vedenin on 16.01.16.
 */
public class URLDownloadTests {
    private final static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";

    private static void initHTTPSDownload() throws Exception {
        // Create a new trust manager that trust all certificates
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        // Activate the new trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    private static String testJsoup(String url) throws Exception {
        return Jsoup.connect(url).userAgent(USER_AGENT).cookie("auth", "token")
                .timeout(30000).get().html();
    }

    private static String testJsoupHeadlines(String url) throws Exception {
        Document doc = Jsoup.connect(url).userAgent(USER_AGENT).cookie("auth", "token")
                .timeout(30000).get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
        return newsHeadlines.html();
    }

    private static void testHtmlParser(String url) throws Exception {
        Document doc = Jsoup.connect(url).userAgent(USER_AGENT).cookie("auth", "token")
                .timeout(30000).get();
        Charset charset = doc.charset();
        System.out.println("charset = " + charset);
        System.out.println("location = " + doc.location());
        System.out.println("nodeName = " + doc.nodeName());
        Document.OutputSettings outputSettings = doc.outputSettings();
        System.out.println("charset = " + outputSettings.charset());
        System.out.println("indentAmount = " + outputSettings.indentAmount());
        System.out.println("syntax = " + outputSettings.syntax());
        System.out.println("escapeMode = " + outputSettings.escapeMode());
        System.out.println("prettyPrint = " + outputSettings.prettyPrint());
        System.out.println("outline = " + outputSettings.outline());

        System.out.println("title = " + doc.title());
        System.out.println("baseUri = " + doc.baseUri());

        Element head = doc.head();
        Elements children = head.children();
        for(Element child: children) {
            System.out.print(child.tag().getName() + " : ");
            System.out.println(child);
        }
        printElements(doc.body().children());
    }

    private static void printElements(Elements children) {
        for(Element child: children) {
            if(!child.text().isEmpty()) {
                System.out.print(child.tag().getName() + " : ");
                System.out.println(child.text());
            }
            printElements(child.children());
        }
    }

    public static void main(String[] s) throws Exception {
        initHTTPSDownload();

        String wikipedia = testJsoup("http://en.wikipedia.org/");
        System.out.println(wikipedia.length()); // print something about 70694
        String headlines = testJsoupHeadlines("http://en.wikipedia.org/");
        System.out.println(headlines);
        String stackoverflow = testJsoup("http://stackoverflow.com/");
        System.out.println(stackoverflow.length()); // print something about 70694
        testHtmlParser("http://stackoverflow.com/");
    }
}
