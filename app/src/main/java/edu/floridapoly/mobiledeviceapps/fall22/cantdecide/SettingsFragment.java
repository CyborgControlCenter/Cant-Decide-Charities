package edu.floridapoly.mobiledeviceapps.fall22.cantdecide;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceFragmentCompat;

import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class SettingsFragment extends PreferenceFragmentCompat {

    Switch enableDuplicates;
    Switch saveRolledCharities;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private Spinner regionsSpinner;




    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootkey) {
        setPreferencesFromResource(R.xml.preferences, rootkey);
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_settings, container, false);
//
//        enableDuplicates = rootView.findViewById(R.id.EnableDuplicatesSettings);
//        saveRolledCharities = rootView.findViewById(R.id.SaveRolledCharities);
//        regionsSpinner = rootView.findViewById(R.id.RegionSpinner);
//        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
//        editor = sharedPreferences.edit();
//
//
//        enableDuplicates.setOnCheckedChangeListener(null);
//        enableDuplicates.setChecked(sharedPreferences.getBoolean("Enable Duplicates", true));
//        enableDuplicates.setOnCheckedChangeListener((compoundButton, b) -> {
//            editor.putBoolean("Enable Duplicates", b);
//            Toast.makeText(getActivity(), "Enable Duplicates is " + (b ? "on" : "off") + ". State added to Shared Preference", Toast.LENGTH_SHORT).show();
//        });
//
//        Log.i("Enable Duplicates ", String.valueOf(sharedPreferences.getBoolean("Enable Duplicates", true)));
//
//        saveRolledCharities.setOnCheckedChangeListener(null);
//        saveRolledCharities.setChecked(sharedPreferences.getBoolean("Save Rolled Charities", true));
//        saveRolledCharities.setOnCheckedChangeListener((compoundButton, b) -> {
//            editor.putBoolean("Save Rolled Charities", b);
//            Toast.makeText(getActivity(), "Saved Rolled Charities State is " + (b ? "on" : "off") + ". State added to Shared Preference", Toast.LENGTH_SHORT).show();
//        });
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.regions, android.R.layout.simple_spinner_item);
//        regionsSpinner.setAdapter(adapter);
//
//        return rootView;
//    }
}