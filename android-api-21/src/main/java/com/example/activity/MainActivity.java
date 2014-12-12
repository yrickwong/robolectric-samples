package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridLayout;

import com.example.R;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    GridLayout layout = (GridLayout) findViewById(R.id.grid_layout);
    layout.requestLayout();
  }
}
