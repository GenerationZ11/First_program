package l.generationz.first_program;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker  and move the camera
        LatLng Soft = new LatLng(49.8225978,23.9814484);
       LatLng Opera = new LatLng(49.8440167,24.0240236);
        LatLng Gid = new LatLng(49.841133,24.034515);
        LatLng Hight = new LatLng(49.848224699999996,24.039509503704835);
        LatLng quest = new LatLng( 49.842013, 24.031656);


        mMap.addMarker(new MarkerOptions().position(quest).title("Ратуша"));
        mMap.addMarker(new MarkerOptions().position(Hight).title("Найвища точка міста"));
        mMap.addMarker(new MarkerOptions().position(Gid).title("Жидівська кнайпа"));
      //  mMap.addMarker(new MarkerOptions().position(Opera).title("Сидяча статуя С"));
        mMap.addMarker(new MarkerOptions().position(Soft).title("SoftServe"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Opera,13));


    }
}