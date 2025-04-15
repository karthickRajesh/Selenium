import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommandsPractice1 {

    /*

    Launch a new Chrome browser.
    Open Shop.DemoQA.com
    Get Page Title name and Title length
    Print Page Title and Title length on the Eclipse Console.
    Get Page URL and verify if it is a correct page opened
    Get Page Source (HTML Source code) and Page Source length
    Print Page Length on Eclipse Console.
    Close the Browser.

     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");

        String title = driver.getTitle();
        int titleLength = title.length();
        System.out.println("title " + title);
        System.out.println("titleLength " + titleLength);

        if (title.equals(driver.getCurrentUrl())){
            System.out.println(" Url Matched");
        }else {
            System.out.println(" Url Not Matched");
        }

        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("pageSource " + pageSource);
        System.out.println("pageSourceLength " + pageSourceLength);

        driver.quit();

    }
}
