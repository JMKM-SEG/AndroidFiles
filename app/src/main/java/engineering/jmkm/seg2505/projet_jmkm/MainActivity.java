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

    Intent intent;
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
                    intent = new Intent(getApplicationContext(), MainActivity2.class);
                }
                break;
            case R.id.btn03:
                if (checked) {
                    intent = new Intent(getApplicationContext(), MainActivity3.class);

                }
                break;
            case R.id.btn04:
                if (checked) {
                    intent = new Intent(getApplicationContext(), MainActivity4.class);
                }
                break;
        }
    }
    public void toRegistration(View view){
        if (intent == null){
            Toast toast = Toast.makeText(getApplicationContext(), "Please select an option", Toast.LENGTH_LONG);
            toast.show();
        }else {
            startActivityForResult(intent, 0);
        }
    }



}
