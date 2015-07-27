package abstracts;

import android.app.AlertDialog;

import com.example.antihacker.bodytransformation.R;

import java.security.InvalidParameterException;

import entities.BodyInfo;

/**
 * Created by AntiHacker on 27.07.2015.
 */
public abstract class BasicAvatar {


    //Fields
    private BodyInfo _bodyInfo;


    /* Properties */

    public void set_bodyInfo(BodyInfo _bodyInfo) {
        this._bodyInfo = _bodyInfo;
    }

    public BodyInfo get_bodyInfo() {
        return _bodyInfo;
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

    /*
    private void ShowAlert()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(R.string.messageValidHeight);
        alert.show();

    }
    */

}
