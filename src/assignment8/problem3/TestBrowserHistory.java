package assignment8.problem3;

public class TestBrowserHistory {
    public static void main(String[] args) {
// Start with home.html
        BrowserHistory browser = new
                BrowserHistory("home.html");
        browser.visit("page1.html"); // Current URL
        browser.visit("page2.html"); // Current URL
        browser.back(); // Goto page1.html
        browser.back(); // Goto home.html
        browser.forward(); // Goto page1.html
        browser.forward(); // Goto page1.html
        browser.visit("page3.html"); // Current URL
    }
}
