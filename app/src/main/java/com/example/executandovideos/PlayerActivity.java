package com.example.executandovideos;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        VideoView videoView = findViewById(R.id.videoView);

        //Esconder a ActionBar
        Objects.requireNonNull(getSupportActionBar()).hide();

        //Executar Videos
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resourse://" + getPackageName() + "/" + R.raw.video);
        videoView.start();

    }
}