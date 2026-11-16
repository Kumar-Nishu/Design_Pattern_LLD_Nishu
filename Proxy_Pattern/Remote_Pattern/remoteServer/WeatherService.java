package Proxy_Pattern.Remote_Pattern.remoteServer;

public class WeatherService implements Weather{

    @Override
    public String getWeather() {
        // TODO Auto-generated method stub
       System.out.println("Fetching Weather Data ...");
       return "35 Degree Celsius"; // this come with api
    }
    
}
