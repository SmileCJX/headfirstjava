package pers.caijx.designpattern.observer.weather;

/**
 * Created by Administrator on 2018/2/4/004.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeaterData weaterData = new WeaterData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weaterData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weaterData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weaterData);
        weaterData.setMeasurements(80,65,30.4f);
        weaterData.setMeasurements(82,70,29.2f);
        weaterData.setMeasurements(78,90,29.2f);
    }
}
