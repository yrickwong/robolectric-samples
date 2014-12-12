package com.example.activity;

import android.app.Activity;
import android.widget.GridLayout;

import com.example.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml")
public class MainActivityTest {

  @Test
  public void titleIsCorrect() throws Exception {
    Activity activity = Robolectric.setupActivity(MainActivity.class);

    GridLayout layout = (GridLayout) activity.findViewById(R.id.grid_layout);
    assertThat(layout.getChildCount()).isEqualTo(4);
  }
}
