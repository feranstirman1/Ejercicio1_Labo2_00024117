package com.feranstirman.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botonMain;
    private TextView textviewDinamico;

    public EditText campoUsername;
    public EditText campoPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewDinamico = findViewById(R.id.textview_dinamico);

        campoUsername = findViewById(R.id.campo_username);
        campoPassword = findViewById(R.id.campo_password);




        botonMain = findViewById(R.id.boton_main);
        botonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textviewDinamico.setText(campoUsername.getText());
            }
        });

        botonMain.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textviewDinamico.setText(campoPassword.getText());
                return false;
            }
        });

    }
}
