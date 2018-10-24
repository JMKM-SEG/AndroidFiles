package engineering.jmkm.seg2505.projet_jmkm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        final EditText et=(EditText) findViewById(R.id.editText6);
        final EditText es=(EditText) findViewById(R.id.editText8);
        emailEditText = (EditText) findViewById(R.id.editText9);
        passEditText = (EditText) findViewById(R.id.editText10);

        findViewById(R.id.btn06).setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                final String email = emailEditText.getText().toString();
                if (!fieldValidation.isValidEmail(email)) {
                    emailEditText.setError("Invalid Email. ");
                }

                final String pass = passEditText.getText().toString();
                if (!fieldValidation.isValidPassword(pass)) {
                    passEditText.setError("Invalid Password. Must contain at least 6 alphanumerical characters ");
                }

                if (fieldValidation.isValidEmail(email) && fieldValidation.isValidPassword(pass)){
                    Intent intent=new Intent(MainActivity3.this,MainActivity5.class);
                    intent.putExtra("theText", et.getText().toString());
                    intent.putExtra("theTexts", es.getText().toString());
                    startActivity(intent);
                }

            }
        });


    }
    public void createAccount(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
        startActivityForResult(intent, 0);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setMessage("Are you sure you want to go back?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                MainActivity3.this.finish();
            }
        }).setNegativeButton("No", null).show();
    }
}
