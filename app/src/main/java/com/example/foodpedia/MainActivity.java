package com.example.foodpedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends Activity {
    protected Button signUp,signIn;
    static MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;
        signUp=(Button)findViewById(R.id.signUpMain);
        signIn=(Button)findViewById(R.id.signInMain);
        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null)
        {
            startActivity(new Intent(MainActivity.this,ChooseType.class));
            finish();
        }
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SignUp.class));
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SignIn.class));
            }
        });
    }

    public static MainActivity getInstance()
    {
        return mainActivity;
    }
}
