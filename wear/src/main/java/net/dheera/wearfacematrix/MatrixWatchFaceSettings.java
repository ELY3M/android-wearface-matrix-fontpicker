package net.dheera.wearfacematrix;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.app.Activity;


public class MatrixWatchFaceSettings extends Activity {

/*

digital.ttf
ds_digib.ttf
led_counter.ttf
matrix.ttf
miltown2.ttf
mouseledumod.ttf
orbitron_medium.otf
pixellcd_7.ttf
subwayticker.ttf

*/

    public static final String DIGITAL = "digital";
    public static final String DS_DIGIB = "ds_digib";
    public static final String LED_COUNTER = "led_counter";
    public static final String MATRIX = "matrix";
    public static final String MILTOWN2 = "miltown2";
    public static final String MOUSELEDUMOD = "mouseledumod";
    public static final String ORBITRON_MEDIUM = "orbitron_medium";
    public static final String PIXELLCD_7 = "pixellcd_7";
	public static final String SUBWAYTICKER = "subwayticker";
    public static final String PATH_CONFIG = "/MatrixWatchFace/Config/";

/*

digital.ttf
ds_digib.ttf
led_counter.ttf
matrix.ttf
miltown2.ttf
mouseledumod.ttf
orbitron_medium.otf
pixellcd_7.ttf
subwayticker.ttf

 */

    private CheckBox digital;
    private CheckBox ds_digib;
    private CheckBox led_counter;
    private CheckBox matrix;
    private CheckBox miltown2;
    private CheckBox mouseledumod;
    private CheckBox orbitron_medium;
    private CheckBox pixellcd_7;
    private CheckBox subwayticker;
    ///private GoogleApiClient googleApiClient = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///initializeWearable();
        setContentView(R.layout.fontpicker);
        digital = (CheckBox) findViewById(R.id.digital);
        ds_digib = (CheckBox) findViewById(R.id.ds_digib);
        matrix = (CheckBox) findViewById(R.id.matrix);
        miltown2 = (CheckBox) findViewById(R.id.miltown2);
        mouseledumod = (CheckBox) findViewById(R.id.mouseledumod);
        orbitron_medium = (CheckBox) findViewById(R.id.orbitron_medium);
        pixellcd_7 = (CheckBox) findViewById(R.id.pixellcd_7);
        subwayticker = (CheckBox) findViewById(R.id.subwayticker);
        Button apply = (Button) findViewById(R.id.applybutton);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

                //saveValues();
                //pushValuesToWearable();
            }
        });

        //loadValues();

    }




    public static String getString(final Context context, final String key, final String defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(key, defaultValue);
    }

    public static int getInt(final Context context, final String key, final int defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(key, defaultValue);
    }

    public static boolean getBoolean(final Context context, final String key,
                                     final boolean defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, defaultValue);
    }

    public static void setString(final Context context, final String key, final String value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void setInt(final Context context, final String key, final int value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void setBoolean(final Context context, final String key, final boolean value) {
        final SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }




}
