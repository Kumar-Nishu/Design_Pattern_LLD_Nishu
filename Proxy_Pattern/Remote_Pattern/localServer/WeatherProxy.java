package Proxy_Pattern.Remote_Pattern.localServer;

import Proxy_Pattern.Remote_Pattern.remoteServer.Weather;
import Proxy_Pattern.Remote_Pattern.remoteServer.WeatherService;

public class WeatherProxy implements Weather {
    
    private Weather weather;
    public WeatherProxy(){
        this.weather=new WeatherService();
    }
    @Override
    public String getWeather() {
        // TODO Auto-generated method stub
        authenticate();
        openConnection();
        serializeRequest();
        return sendHttpRequest();
    }
    public void authenticate(){
        System.out.println("Authentication....."); // Authentication api's are being called
    }
    
    public void openConnection(){
        System.out.println("OpenConnection....."); // OpenConnection api's are being called
    }
    public void serializeRequest(){
        System.out.println("SerializeRequest....."); // SerializeRequest api's are being called
    }
    public String sendHttpRequest(){
        System.out.println("Sending Http Request..");
        return weather.getWeather();
    }
}
