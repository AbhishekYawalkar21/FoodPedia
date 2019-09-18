package com.example.foodpedia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetPassword extends Activity {
    private EditText etemail;
    private Button btnresetpass,btnback;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        auth=FirebaseAuth.getInstance();

        etemail=(EditText)findViewById(R.id.etemailResetPass);
        btnresetpass=(Button)findViewById(R.id.rpResetPass);
        btnback=(Button)findViewById(R.id.backResetPass);

        btnresetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=etemail.getText().toString().trim();

                if (TextUtils.isEmpty(email))
                {
                    //Toast.makeText(getApplicationContext(),"Please enter email address!",Toast.LENGTH_SHORT).show();
                    etemail.setError("Mandatory to be filled!");
                    return;
                }

                final ProgressDialog progressDialog=new ProgressDialog(ResetPassword.this);
                progressDialog.setMessage("Loading..");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setCancelable(false);
                progressDialog.show();
                auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(),"Check your email and reset password.",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Failed to send email.",Toast.LENGTH_SHORT).show();
                        }

                        progressDialog.dismiss();
                    }
                });
            }
        });


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
