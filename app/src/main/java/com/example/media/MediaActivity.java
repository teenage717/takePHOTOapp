package com.example.media;

import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;
import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

public class MediaActivity extends AppCompatActivity {

    VideoView videoView;
    Button playAudioButton;
    boolean isAudioPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_activity);

        videoView = findViewById(R.id.videoView);
        playAudioButton = findViewById(R.id.playAudioButton);

        // Воспроизведение видео без звука
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);  // Пример видео
        videoView.setOnPreparedListener(mp -> mp.setVolume(0f, 0f)); // Установка уровня громкости на 0

        videoView.start();

        // Воспроизведение аудио и управление паузой
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ariana);
        playAudioButton.setOnClickListener(v -> {
            if (isAudioPlaying) {
                mediaPlayer.pause();
                isAudioPlaying = false;
            } else {
                mediaPlayer.start();
                isAudioPlaying = true;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoView.stopPlayback();
    }
}