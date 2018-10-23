package engineering.jmkm.seg2505.projet_jmkm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView tv=(TextView) findViewById(R.id.textView2);
        tv.setText(getIntent().getExtras().getString("theText"));

        TextView ts=(TextView) findViewById(R.id.textView3);
        ts.setText(getIntent().getExtras().getString("theTexts"));

    }

}
