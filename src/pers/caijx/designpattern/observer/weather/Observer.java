package pers.caijx.designpattern.observer.weather;

/**
 * Created by Administrator on 2018/2/4/004.
 */
public interface Observer {

    /**
     * 当气象观测值改变时，主题会把这些状态值当做方法的参数，传送给观察者
     * @param temp  温度
     * @param humidity  湿度
     * @param pressure  气压
     */
    void update(float temp,float humidity,float pressure);
}
