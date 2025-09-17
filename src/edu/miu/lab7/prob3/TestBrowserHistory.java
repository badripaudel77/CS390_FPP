package edu.miu.lab7.prob3;

public class TestBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory browser = new
                BrowserHistory("home.html");// Start with home.html
        browser.visit("page1.html");
        browser.visit("page2.html");
        browser.back();
        browser.back();
        browser.back();
        browser.forward();
        browser.forward();
        browser.forward();
        browser.visit("page3.html");
    }
}
