package gangdrive.gang.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
            btnClear,btnClearOne,btnPrecent,
            btnDivision,btnMultiplication,btnMinus,btnPlus,btnEqually,
            btnBrackets,btnDot;
    TextView tvInput,tvOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}