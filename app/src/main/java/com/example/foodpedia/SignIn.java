package com.example.foodpedia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends Activity {
    private EditText etemail,etpass;
    private Button btnsignin,btnreg,btnresetpass;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        auth=FirebaseAuth.getInstance();

        etemail=(EditText)findViewById(R.id.etemailSignIn);
        etpass=(EditText)findViewById(R.id.etpassSignIn);
        btnsignin=(Button)findViewById(R.id.loginSignIn);
        btnreg=(Button)findViewById(R.id.getregisteredSignIn);
        btnresetpass=(Button)findViewById(R.id.fpassSignIn);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=etemail.getText().toString().trim();
                final String pass=etpass.getText().toString().trim();

                if (TextUtils.isEmpty(email) && TextUtils.isEmpty(pass))
                {
                    //Toast.makeText(getApplicationContext(),"Please fill both the fields!",Toast.LENGTH_SHORT).show();
                    etemail.setError("Mandatory to be filled!");
                    etpass.setError("Mandatory to be filled!");
                    return;
                }

                if (TextUtils.isEmpty(email))
                {
                    //Toast.makeText(getApplicationContext(),"Please enter email address!",Toast.LENGTH_SHORT).show();
                    etemail.setError("Mandatory to be filled!");
                    return;
                }
                if (TextUtils.isEmpty(pass))
                {
                    //Toast.makeText(getApplicationContext(),"Please enter password!",Toast.LENGTH_SHORT).show();
                    etpass.setError("Mandatory to be filled!");
                    return;
                }

                final ProgressDialog progressDialog=new ProgressDialog(SignIn.this);
                progressDialog.setMessage("Loading..");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setCancelable(false);
                progressDialog.show();
                auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(SignIn.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (!task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(),"Could not process. Check your email and password.",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            startActivity(new Intent(SignIn.this,ChooseType.class));
                            finish();
                        }
                    }
                });
            }
        });

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this,SignUp.class));
                finish();
            }
        });

        btnresetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this,ResetPassword.class));
                finish();
            }
        });
    }
}
