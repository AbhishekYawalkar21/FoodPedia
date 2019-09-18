package com.example.foodpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class Recipes extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
        textView=(TextView)findViewById(R.id.tvr);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent=getIntent();
        final String name=intent.getStringExtra("name");
        final String video=intent.getStringExtra("video");
        final String recipe=intent.getStringExtra("recipe");
        youTubePlayerView.initialize(PlayerConfig.API_KEY,new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cueVideo(video);
                /*youTubePlayer.setPlaybackEventListener(new YouTubePlayer.PlaybackEventListener() {
                    @Override
                    public void onPlaying() { }
                    @Override
                    public void onPaused() { }
                    @Override
                    public void onStopped() { }
                    @Override
                    public void onBuffering(boolean b) { }
                    @Override
                    public void onSeekTo(int i) { }
                });*/
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });

        textView.setText(recipe);
    }

}
