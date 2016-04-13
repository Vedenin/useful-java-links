package com.github.vedenin.url_parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.util.ArrayList;
import java.util.List;

/**
 * JSoup Hello World
 *
 * Created by vedenin on 07.04.16.
 */
public class GithubDownLoadTests {
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

    private static void testHtmlParser(String url) throws Exception {
        Document doc = Jsoup.connect(url).userAgent(USER_AGENT).cookie("auth", "token")
                .timeout(30000).get();
        Elements div = doc.select("#readme");

        //printElements(div);
        work(div);
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
        testHtmlParser("https://github.com/Vedenin/useful-java-links/blob/master/readme.md");
    }


    private static final Tag H1 = Tag.valueOf("h1");
    private static final Tag H2 = Tag.valueOf("h2");
    private static final Tag H3 = Tag.valueOf("h3");
    private static final Tag H4 = Tag.valueOf("h4");
    private static final Tag H5 = Tag.valueOf("h5");
    private static final Tag H6 = Tag.valueOf("h6");


    private static boolean isHeader(Tag tag) {
        return H1.equals(tag) || H2.equals(tag) || H3.equals(tag) || H4.equals(tag) || H5.equals(tag) || H6.equals(tag);
    }
    private static List<LinkContainer> work(Elements elements) {
        List<LinkContainer> result = new ArrayList<>(elements.size());
        String currentCategory = null;
        for(Element element: elements) {
            Tag tag = element.tag();
            if(isHeader(tag)) {
                currentCategory = element.text();
                System.out.println(currentCategory);
            }
            work(element.children());
        }
        return result;
    }

    private static class LinkContainer {
        private String category;
        private String name;
        private String url;
        private String description;
        private String star;
        private String stackOverflow;
        private String license;
        private String licenseUrl;
        private String site;

        @Override
        public String toString() {
            return "{" +
                    "category='" + category + '\'' +
                    ", name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    ", description='" + description + '\'' +
                    ", star='" + star + '\'' +
                    ", stackOverflow='" + stackOverflow + '\'' +
                    ", license='" + license + '\'' +
                    ", licenseUrl='" + licenseUrl + '\'' +
                    ", site='" + site + '\'' +
                    '}';
        }
    }
}
