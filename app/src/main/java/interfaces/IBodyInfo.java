package interfaces;

import android.os.Parcelable;

/**
 * Created by AntiHacker on 27.07.2015 at 13:28.
 */
public interface IBodyInfo extends Parcelable {

    //GETTER
    float get_height();

    float get_weight();

    int get_age();

    float get_belly();

    float get_biceps();

    float get_chest();

    //SETTER
    void set_age(int _age);

    void set_height(float _height);

    void set_weight(float _weight);

    void set_belly(float _belly);

    void set_biceps(float _biceps);

    void set_chest(float _chest);

    //Methods
    public float CalculateBMI(float bodyHeight, float bodyWeight, float bodyAge);
}
