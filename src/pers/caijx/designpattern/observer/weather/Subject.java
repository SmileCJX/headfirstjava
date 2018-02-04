package pers.caijx.designpattern.observer.weather;

/**
 * Created by Administrator on 2018/2/4/004.
 */
public interface Subject {

    /**
     * 注册
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 主题状态改变时，通知所有的观察者
     */
    void notifyObservers();
}
