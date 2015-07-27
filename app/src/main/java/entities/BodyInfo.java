package entities;

import abstracts.Body;
import interfaces.IBodyInfo;

/**
 * Created by AntiHacker on 27.07.2015 at 13:14.
 */
public class BodyInfo implements IBodyInfo{


    //Fields
    private int _age = 0;
    private double _weight = 0.0;
    private double _height = 0.0;


    //Properties
    public double get_height() {
        return _height;
    }

    public double get_weight() {
        return _weight;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_height(double _height) {
        this._height = _height;
    }

    public void set_weight(double _weight) {
        this._weight = _weight;
    }

    //Methods
}
