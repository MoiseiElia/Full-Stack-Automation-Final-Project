package Class_jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.List;

public class sample_soup
{
    Document doc;
    String logoWidth = "250";
    String logoHeight = "200";
    String category = "All Categories";
    @BeforeClass
    public void Start() throws IOException
    {
doc = Jsoup.connect("https://www.ebay.com/").get();
    }
    @Test
    public void test01_logoWidth()
    {
        assertEquals(doc.getElementById("gh-logo").attr("width"), logoWidth);
    }

    @Test
    public void test02_logoHeight()
    {
        assertEquals(doc.getElementById("gh-logo").attr("height"), logoHeight);

    }

    @Test
    public void test03_AllCategories()
    {
        assertEquals(doc.getElementsByAttributeValue("id", "gh-cat").get(0).text(), category);
    }
    @Test
    public void test04_title()
    {
        System.out.println(doc.baseUri());
    }
    @Test
    public void test05_list()
    {
        List<Element> value = doc.getElementsByAttributeValue("id","gh-cat");
        System.out.println(value.size());
       /*for(int i=value.size();i>0;i--)
        {
            System.out.println(value[i]);
        }*/

        {

        }
    }



}
