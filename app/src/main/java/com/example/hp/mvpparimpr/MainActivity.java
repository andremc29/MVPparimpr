package com.example.hp.mvpparimpr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ParImparCallback{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText= (EditText) findViewById(R.id.valueEt);
        textView = (TextView) findViewById(R.id.responseTv);

        Button button = (Button) findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = editText.getText().toString();
                new ParImparCompara(MainActivity.this).Compara(value);

            }
        });
    }

    @Override
    public void blankinput() {
        Toast.makeText(this,"Ingrese un valor", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void sucess(String value) {
        textView.setText(value);
    }
}
