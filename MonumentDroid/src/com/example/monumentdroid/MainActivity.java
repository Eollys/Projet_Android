package com.example.monumentdroid;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class MainActivity extends MapActivity {

	private MapView mapView;
	private MapController mc;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mapView = (MapView) this.findViewById(R.id.mapView);
        mapView.setBuiltInZoomControls(true);
        
        mc = mapView.getController();
        mc.setZoom(17);
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}
