package pers.caijx.designpattern.observer.weather;

/**
 * Created by Administrator on 2018/2/4/004.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    /**
     * 注册观察者
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
