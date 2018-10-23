package engineering.jmkm.seg2505.projet_jmkm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.btn02:
                if (checked) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivityForResult(intent, 0);
                }
            case R.id.btn03:
                if (checked)
                    break;
            case R.id.btn04:
                if (checked) {
                    //MainActivity.this.finish();
                    //System.exit(0);
                    break;
                }
        }
    }

    /*public void openAdministrator(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivityForResult(intent,0);
    }*/
}
 //Toast toast = Toast.makeText(context, "", Toast.LENGTH_LONG);
//toast.show();