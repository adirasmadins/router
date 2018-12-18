package asliborneo.router;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;


public class Custom_Info_Window implements GoogleMap.InfoWindowAdapter {
    View v;
    public Custom_Info_Window (Context container){
        v= LayoutInflater.from(container).inflate(R.layout.custom_rider_info_window,null);
    }
    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtpickuptitle=(TextView) v.findViewById(R.id.txtpickupinfo);
        txtpickuptitle.setText(marker.getTitle());
        TextView txtpickupsnippet=(TextView) v.findViewById(R.id.txtpickupsnippet);
        txtpickupsnippet.setText(marker.getSnippet());
        ImageView imageView= (ImageView)v.findViewById(R.id.imageView);
        return v;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}