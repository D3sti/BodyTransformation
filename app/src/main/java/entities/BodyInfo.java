package entities;

import interfaces.IBodyInfo;

/**
 * Created by AntiHacker on 27.07.2015 at 13:14.
 */
public class BodyInfo implements IBodyInfo{


    //Fields
    private int _age = 0;
    private float _height = 0.0f;
    private float _bmi = 0.0f;
    private float _weight = 0.0f;
    private float _chest = 0.0f;
    private float _belly = 0.0f;
    private float _biceps = 0.0f;


    //Properties


    public float get_belly() {
        return _belly;
    }

    public float get_biceps() {
        return _biceps;
    }

    public float get_chest() {
        return _chest;
    }

    public void set_belly(float _belly) {
        this._belly = _belly;
    }

    public void set_biceps(float _biceps) {
        this._biceps = _biceps;
    }

    public void set_chest(float _chest) {
        this._chest = _chest;
    }

    public float get_height() {
        return _height;
    }

    public float get_weight() {
        return _weight;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_height(float _height) {
        this._height = _height;
    }

    public void set_weight(float _weight) {
        this._weight = _weight;
    }

    //Methods

    public float CalculateBMI(float bodyHeight, float bodyWeight, float bodyAge)
    {
        if ( bodyHeight > 0 && bodyWeight > 150 && bodyWeight < 250) {
            if (bodyHeight > 100) {
                bodyHeight /= 100.0;
            }

            float bmi = bodyWeight / bodyHeight / bodyHeight;
            return bmi;
        }
        return  0;
    }
}
