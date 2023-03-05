import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimUtil {

    /**
     * 初始打开网页
     */

    ChromeDriver driver = new ChromeDriver();

    public SelenuimUtil() {
        driver.get("https://www.sogou.com/");
    }

    /**
     *  sendKeys 在输入框输入 内容
     */
    public void inputKeys() throws InterruptedException {
        driver.findElement(By.cssSelector("#kw")).sendKeys("yyds是什么意思？");
        Thread.sleep(3000);
    }

    /**
     *  clear() 清空输入框的内容
     */
     public void clearInput() throws InterruptedException {
         driver.findElement(By.cssSelector("#kw")).clear();
         Thread.sleep(3000);
     }

    /**
     * click() 点击效果，选中进行点击
     */
    public void clickNews() throws InterruptedException {
        driver.findElement(By.cssSelector("#QRcode-footer > div.ft-info > a:nth-child(1)")).click();
        Thread.sleep(3000);
    }

    /**
     * 获取元素中的属性value或者其他属性
     */
    public void getColumn() throws InterruptedException {
        String s = driver.findElement(By.cssSelector("#stb")).getAttribute("value");
        System.out.println(s);
        Thread.sleep(3000);
    }


    public void close(){
        driver.close();
    }
}
