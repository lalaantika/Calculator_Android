ackage com.demoapp.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button_add, button_sub, button_multiply, button_divide, button_ac, button_eql, button_period;

    EditText calEditText;
    float mValueOne, mValueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_add = (Button) findViewById(R.id.buttonadd);
        button_sub = (Button) findViewById(R.id.buttonsub);
        button_multiply = (Button) findViewById(R.id.buttonmul);
        button_divide = (Button) findViewById(R.id.buttondiv);
        button_ac = (Button) findViewById(R.id.buttonAC);
        button_period = (Button) findViewById(R.id.buttondot);
        button_eql = (Button) findViewById(R.id.buttoneql);
        calEditText = (EditText) findViewById(R.id.edit);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "0");
            }
        });

    }
}