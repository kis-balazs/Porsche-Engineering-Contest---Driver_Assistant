package com.pec.balazs.pecphone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // on clicking the button of "Activate right before driving!"
    public void onVideoFromCameraClick(View view) {
        Intent intent = new Intent(this, VideoFaceDetectionActivity.class);
        startActivity(intent);
    }
}
