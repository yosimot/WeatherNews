package jp.techacademy.takahiro.yoshimoto.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Yoshimoto Takahiro on 2017/04/23.
 */
public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity(){
        return prefs.getString("city", "Tokyo, JP");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
