package com.example.RecordBreakers;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

public class RecordBreakers extends Activity {
    /**
     * Called when the activity is first created.
     */
    private GoogleMap map;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
        .getMap();
    }
}
