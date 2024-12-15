package assignment8.problem3;

import java.util.List;
import java.util.Stack;

public class BrowserHistory {
    private String url;
    Stack<String> backWard = new Stack<>();
    Stack<String> forwardWard = new Stack<>();
    public BrowserHistory(String url) {
        this.url = url;
    }
    public void visit(String url){
        backWard.push(this.url);
        this.url = url;
        System.out.println("Visited " + this.url);
    }
    public void back(){
        if(backWard.empty()){
            return;
        }
        forwardWard.push(this.url);
        this.url = backWard.pop();
        System.out.println("Back to " + this.url);
    }
    public void forward(){
        if(forwardWard.empty()){
            return;
        }
        backWard.push(this.url);
        this.url = forwardWard.pop();
        System.out.println("Forward to " + this.url);
    }

}
