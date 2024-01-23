package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
implements AdapterView.OnItemSelectedListener {

    EditText editName, editSDT;
    RadioButton rdbNam, rdbNu;
    RadioGroup rdgGender;
    Spinner spin;
    ListView lstSV;
    CheckBox ckMusic, ckArt, ckGame;
    Button btnAdd;
    ImageView img;

    String sex;
    List<Student> lstStudent1;
    private Student student;
    AdapterStudent svAdapter;
    int hinhanh1; String que;
    String[] quequan = {"Hà Nội", "Ninh Bình", "Nam Định", "Phú Thọ", "Hải Phòng", "Hải Dương", "Bắc Kạn",
    "TP Hồ Chí Minh", "Tuyên Quang"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editSDT = findViewById(R.id.editPhoneNum);
        rdgGender = findViewById(R.id.Gender);
        rdbNam = findViewById(R.id.rdbNam);
        rdbNu = findViewById(R.id.rdbNu);
        ckArt = findViewById(R.id.ckArt);
        ckMusic= findViewById(R.id.ckMusic);
        ckGame = findViewById(R.id.ckGame);
        spin = findViewById(R.id.spinner);
        lstSV = findViewById(R.id.lstSV);
        btnAdd = findViewById(R.id.btnAdd);
        //taọ adapter
        //tham số 1: context lớp cha của lớp Activity
        //tham số 2: layout của phần tả
        //tham ố 3: arrlist chữ dữ liệu danh sách
        ArrayAdapter ad = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,quequan);
        //gpoi ham nay de hien thi danh sach cho spinner
        ad.setDropDownViewResource((android.R.layout.select_dialog_singlechoice));
       //thiet lap adapter cho spinner
        spin.setAdapter(ad);
        //thiet lap su kien chon phan tu cho spinner



        lstStudent1 = new ArrayList<Student>();
        svAdapter = new AdapterStudent(this,lstStudent1,R.layout.custom);
        lstStudent1.add(new Student("Nguyen Quynh Chi","012348562","Nữ","Phú Thọ", R.drawable.meo5));
        lstSV.setAdapter(svAdapter);
        svAdapter.notifyDataSetChanged();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = editName.getText().toString().trim();
                final String SDT = editSDT.getText().toString().trim();

                if(rdbNam.isChecked()==true){
                    sex = "Nam";
                    hinhanh1 = R.drawable.meo4;
                } else{
                    sex = "Nữ";
                    hinhanh1 = R.drawable.meo5;
                }
                final String quequan = spin.getSelectedItem().toString().trim();

                student = new Student(name,SDT, sex, quequan,hinhanh1);

                lstStudent1.add(student);
                lstSV.setAdapter(svAdapter);
                svAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),quequan[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}


