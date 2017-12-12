package com.yiful.bbvamapchallenge.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.yiful.bbvamapchallenge.R;
import com.yiful.bbvamapchallenge.model.JsonResponse;

public class DetailActivity extends AppCompatActivity {
    private TextView tvName, tvAddress, tvGps;
    private JsonResponse.ResultsBean resultsBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        resultsBean = getIntent().getParcelableExtra("resultBean");
        tvName = findViewById(R.id.tvName);
        tvAddress = findViewById(R.id.tvAddress);
        tvGps = findViewById(R.id.tvGps);
        tvName.setText(resultsBean.getName());
        tvAddress.setText(resultsBean.getFormatted_address());
   //     Log.i("detail", "lat is "+resultsBean.getGeometry().getLocation().getLng());
    //    tvGps.setText(resultsBean.getGeometry().getLocation().getLat()+", "+resultsBean.getGeometry().getLocation().getLng());
    }
}
