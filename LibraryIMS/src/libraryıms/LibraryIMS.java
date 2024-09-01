package libraryıms;

import books.LogPage;
import books.Home;
import javax.swing.JFrame;

public class LibraryIMS extends JFrame {

    public static void main(String[] args) {
        LogPage logPage = new LogPage();
        logPage.setVisible(true);
        
        Home home = new Home();
        home.setVisible(true);
    }

}
