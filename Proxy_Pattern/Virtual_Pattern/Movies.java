package Proxy_Pattern.Virtual_Pattern;

public class Movies implements Video {
    
    private String fileName;
    public Movies(String fileName) throws InterruptedException{
        this.fileName=fileName;
        loadVideo();
    }
    private void loadVideo() throws InterruptedException{
        System.out.println("Loading Video.... "+fileName);
        Thread.sleep(4000);
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Playing Video...."+fileName);
    }
    
}

// Here when we make the object of Movies the loadVideo method get called and it takes lots of time
// But this time we want to just add fileName not to load video 
