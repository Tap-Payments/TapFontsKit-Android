package com.tap.tapfontskit_android;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    public static Intent start(final Activity activity) {
        return new Intent(activity, SettingsActivity.class);
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.frame_layout);
        this.getFragmentManager().beginTransaction().replace(R.id.content_frame, new SettingsFragment()).commit();
    }

    public static class SettingsFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener, SharedPreferences.OnSharedPreferenceChangeListener {
          private Preference fontFacePref;
        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            this.addPreferencesFromResource(R.xml.preferences);

              fontFacePref =  this.findPreference("preference_font_face_key");
              fontFacePref.setOnPreferenceChangeListener(this);

            this.getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        }

        @Override
        public boolean onPreferenceChange(final Preference preference, final Object newValue) {

            if (preference.equals(fontFacePref)) {
               // final String value = (String) newValue;
                //Toast.makeText(getActivity(), "New value is " + value, Toast.LENGTH_SHORT).show();
                return true;
            }

            return false;
        }

        @Override
        public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String key) {
            if (fontFacePref != null && key.equals(fontFacePref.getKey())) {
                final String value = sharedPreferences.getString(key, "");
                fontFacePref.setSummary(value);
            }
        }
    }
}
