package com.tap.tapfontskit_android;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import android.view.ViewGroup;
import android.widget.TextView;

import com.tap.tapfontskit.FontChanger;
import com.tap.tapfontskit.enums.TapFont;


public class MainActivity extends AppCompatActivity {
    FontChanger fontChanger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final TextView fontTextView = this.findViewById(R.id.font);
       // final String font = sharedPreferences.getString(this.getString(R.string.preference_font_face_key), this.getString(R.string.font_face_default_value));
        // fontTextView.setTypeface(Typeface.createFromAsset(this.getAssets(), font));
        fontChanger = new FontChanger(this.getAssets(),TapFont.Companion.tapFontType(TapFont.helveticaNeueLight));
        fontChanger.replaceFonts((ViewGroup)this.findViewById(android.R.id.content));

    }

    @Override
    protected void onResume() {
        super.onResume();
        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final TextView fontTextView =  this.findViewById(R.id.font);
        final String font = sharedPreferences.getString(this.getString(R.string.preference_font_face_key), this.getString(R.string.font_face_default_value));
        System.out.println("getAssets = " + getAssets().toString()+"fonts"+font);

       // fontTextView.setTypeface(Typeface.createFromAsset(this.getAssets(), font));

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        final int id = item.getItemId();

        if (id == R.id.action_settings) {
            this.startActivity(SettingsActivity.start(this));
        } else {
            return super.onOptionsItemSelected(item);
        }

        return true;
    }
}
