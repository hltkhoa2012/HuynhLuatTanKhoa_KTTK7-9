package com.example.student.hltk_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTK, edtMK;
    Button btnDN;
    CheckBox checkBox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTK = (EditText)findViewById(R.id.edt_tk);
        edtMK = (EditText)findViewById(R.id.edt_mk);
        btnDN = (Button)findViewById(R.id.btn_dn);
        checkBox1 = (CheckBox)findViewById(R.id.checkbox1);

        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()){
                    Toast.makeText(MainActivity.this,"Chuc mung ban dang nhap he thong, Thong tin cua ban chua duoc luu",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Chuc mung ban dang nhap he thong, Thong tin cua ban chua duoc luu",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
