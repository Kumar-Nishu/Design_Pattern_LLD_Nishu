package Proxy_Pattern.Virtual_Pattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Movies mv1=new Movies("Ramayan.mp4");
        // mv1.play();
        // Movies mv2=new Movies("Dhurendhar.mp4");
        // mv2.play();
        // Movies mv3=new Movies("Drishyam.mp4");
        // mv3.play();

        // Movies mv1=new Movies("Ramayan.mp4");
        // Movies mv2=new Movies("Dhurendhar.mp4");
        // Movies mv3=new Movies("Drishyam.mp4");

        MoviesProxy mv1=new MoviesProxy("Ramayan.mp4");
        MoviesProxy mv2=new MoviesProxy("Dhurendhar.mp4");
        MoviesProxy mv3=new MoviesProxy("Drishyam.mp4");

        mv1.play();
        mv2.play();
        mv3.play();
    
    }
}
