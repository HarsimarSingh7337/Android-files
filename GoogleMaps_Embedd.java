import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class GUI_Embedd_Maps {

    public static void main(String[] args) {

       Browser browser=new Browser();
       BrowserView view = new BrowserView(browser);
  
    JFrame frame = new JFrame("Google Maps");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.add(view,BorderLayout.CENTER);
    frame.setSize(700, 600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    browser.loadURL("https://maps.google.com");
        
    } 
}
