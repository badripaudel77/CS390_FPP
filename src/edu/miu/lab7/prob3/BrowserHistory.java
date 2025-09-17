package edu.miu.lab7.prob3;

import java.util.Stack;

public class BrowserHistory {
    private final Stack<String> backStack;
    private final Stack<String> forwardStack;
    private String current;

    public BrowserHistory(String s) {
        current = s;
        backStack = new Stack<>();
        forwardStack = new Stack<>();
    }

    public void visit(String s) {
        backStack.push(current);
        current = s;
        forwardStack.clear();
        System.out.println("Visited: " + s);
    }

    public void back() {
        if (backStack.empty()) {
            System.out.println("No history to go back to.");
            return;
        }
        forwardStack.push(current);
        current = backStack.pop();
        System.out.println("Back to: " + current);
    }

    public void forward() {
        if (forwardStack.empty()) {
            System.out.println("No forward history.");
            return;
        }
        backStack.push(current);
        current = forwardStack.pop();
        System.out.println("Forward to: " + current);
    }
}
