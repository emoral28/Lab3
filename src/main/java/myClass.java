
    import java.io.IOException;
    import java.net.URL;
    import java.util.Scanner;
public class myClass
{
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    public static void main(String[] args)
    {
        System.out.println( urlToString( "http://erdani.com/tdpl/hamlet.txt") );
        System.out.println(numberOfWords( "http://erdani.com/tdpl/hamlet.txt") );
    }

    public static int numberOfWords(final String url)
    {
        String text = urlToString(url);
        int wordCount = 0;
        for (int i = 0; i <text.length(); i++)
        {
            if (text.charAt(i)==' ')
            {
                wordCount++;
            }
        }
        wordCount++;
        return wordCount;
    }
    
    public static int amountOfWord( String finder, String url)
    {
        String text = urlToString(url);
        int wordCount = 0;
        boolean done = false;
        int currentInd = 0;
       //Missing the whole thing but yeah you get the point
        return wordCount; 
        
    }
}
