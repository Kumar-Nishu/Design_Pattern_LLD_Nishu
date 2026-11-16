package Proxy_Pattern.Remote_Pattern.localServer;

import Proxy_Pattern.Remote_Pattern.remoteServer.Weather;

public class Main {
    public static void main(String[] args) {
        Weather wt=new WeatherProxy();
        System.out.println(wt.getWeather());
    }
}
