import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        SelenuimUtil selenuimUtil = new SelenuimUtil();

//        selenuimUtil.inputKeys();
//        selenuimUtil.clearInput();

//         selenuimUtil.clickNews();

        selenuimUtil.getColumn();
        selenuimUtil.close();

    }

}
