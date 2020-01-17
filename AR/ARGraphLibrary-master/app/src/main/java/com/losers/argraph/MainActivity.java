package com.losers.argraph;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.losers.argraphlibrary.Modal.GraphConfig;
import com.losers.argraphlibrary.Modal.PlotGraph;
import com.losers.argraphlibrary.SupportingClasses.Utils;
import com.losers.argraphlibrary.SupportingClasses.VideoRecorder.VIDEO_QUALITY;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private Button mPlotAGraphBtn;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mPlotAGraphBtn = findViewById(R.id.add_a_graph);

    //check if device support arcore or not
    if (!Utils.checkIsDeviceSuppotARcore(this)) {
      mPlotAGraphBtn.setVisibility(View.GONE);
    }

    mPlotAGraphBtn.setOnClickListener(
        view -> PlotGraph.get(getApplicationContext()).loadGraph(getGraphConfig()));


  }


  //configure the graph
  private GraphConfig getGraphConfig() {
    return GraphConfig.newBuilder()
        .setGraphList(getSpeedList()) // list you want to add in real world
        .setEnableClassicPlatform(true) // if you want to add platform or not
        .setEnableLogging(true) // enable logging
       // .setEnableVideo(true) //enable video recording of ar graph
        //.setVideoQuality(VIDEO_QUALITY.QUALITY_720P) // video quality
        .build();
  }


  private List<Double> getOneSpeedList() {
    List<Double> mFloatsList = new ArrayList<>();

    mFloatsList.add(50d);
    mFloatsList.add(10d);
    mFloatsList.add(80d);
//    mFloatsList.add(50d);
//    mFloatsList.add(10d);
//    mFloatsList.add(80d);
//    mFloatsList.add(50d);
//    mFloatsList.add(10d);
//    mFloatsList.add(80d);

    return mFloatsList;
  }

  private List<Double> getSpeedList() {
    List<Double> mFloatsList = new ArrayList<>();
    mFloatsList.add(1.0);

    mFloatsList.add(3.0);

    mFloatsList.add(4.0);

    mFloatsList.add(2.0);
    mFloatsList.add(8.0);

    return mFloatsList;
  }

}
