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
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends Activity {

    private EditText etemail,etpass;
    private Button btnreg,btnsignin,btnresetpass;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        auth=FirebaseAuth.getInstance();

        etemail=(EditText)findViewById(R.id.etemailSignUp);
        etpass=(EditText)findViewById(R.id.etpassSignUp);
        btnreg=(Button)findViewById(R.id.registerSignUp);
        btnsignin=(Button)findViewById(R.id.stsignInSignUp);
        btnresetpass=(Button)findViewById(R.id.fpassSignUp);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String email=etemail.getText().toString().trim();
                String pass=etpass.getText().toString().trim();

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
                if (pass.length()<6)
                {
                    //Toast.makeText(getApplicationContext(), "Too short! Enter minimum 6 characters.", Toast.LENGTH_SHORT).show();
                    etpass.setError("Too short! Enter minimum 6 characters.");
                    return;
                }

                final ProgressDialog progressDialog=new ProgressDialog(SignUp.this);
                progressDialog.setMessage("Loading..");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setCancelable(false);
                progressDialog.show();
                auth.createUserWithEmailAndPassword(email,pass)
                        .addOnCompleteListener(SignUp.this,new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    User user=new User(email);
                                    FirebaseDatabase.getInstance().getReference("Users")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            progressDialog.dismiss();
                                            if (task.isSuccessful())
                                            {
                                                Toast.makeText(getApplicationContext(),"Registration succeeded!",Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(SignUp.this,SignIn.class));
                                            }
                                            else
                                            {
                                                Toast.makeText(SignUp.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                                progressDialog.dismiss();
                                            }
                                        }
                                    });
                                }

                                else
                                {
                                    Toast.makeText(SignUp.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                    progressDialog.dismiss();
                                }
                            }
                        });
            }
        });

        btnresetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,ResetPassword.class));
                finish();
            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,SignIn.class));
                finish();
            }
        });
    }

    protected void onStart()
    {
        super.onStart();

        if (auth.getCurrentUser()!=null)
        {
            startActivity(new Intent(SignUp.this,ChooseType.class));
        }
    }
}
