package ru.startandroid.develop.onclickbuttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.startandroid.develop.onclickbuttons.R;

public class MainActivity extends Activity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        btnOk.setOnClickListener(oclBtnOk);


        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}