package Proxy_Pattern.Virtual_Pattern;

public class MoviesProxy implements Video{
    private String fileName;
    private Video video;

    public MoviesProxy(String fileName){
        System.out.println("Proxy Object created");
        this.fileName=fileName;
    }
    public  void play() throws InterruptedException{
        if(video==null) video=new Movies(fileName);
        video.play();
    }
}
