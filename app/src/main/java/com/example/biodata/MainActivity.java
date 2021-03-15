package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.internal.ViewUtils;

public class MainActivity extends AppCompatActivity {
    TextView txtTampil;
    EditText edtnama,edtalamat,edtkota,edtdate,edtemail,edtjenis,edthobi;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtAlert);

        edtnama = (EditText) findViewById(R.id.edttextnama);
        edtalamat = (EditText) findViewById(R.id.edttextalamat);
        edtkota = (EditText) findViewById(R.id.edttextkota);
        edtdate = (EditText) findViewById(R.id.editttextdate);
        edtemail = (EditText) findViewById(R.id.edttextemail);
        edtjenis = (EditText) findViewById(R.id.edttextjenis);
        edthobi = (EditText) findViewById(R.id.edttexthobi);
        btnsubmit = (Button) findViewById(R.id.button);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnama = edtnama.getText().toString();
                String stralamat = edtalamat.getText().toString();
                String strkota = edtkota.getText().toString();
                String strdate = edtdate.getText().toString();
                String stremail = edtemail.getText().toString();
                String strjenis = edtjenis.getText().toString();
                String strhobi = edthobi.getText().toString();

                txtTampil.setText(strnama + "\n" + stralamat + "\n" + strkota + "\n" + strdate + "\n" + stremail + "\n" + strjenis + "\n" + strhobi);
            }
    });
    }
}
