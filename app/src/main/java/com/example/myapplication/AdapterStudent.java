package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterStudent extends BaseAdapter {
    private Context context;
    private List<Student> mSV;

    public AdapterStudent(Context context, List<Student> mSV, int layoutID) {
        this.context = context;
        this.mSV = mSV;
        this.layoutID = layoutID;
    }

    private int layoutID;

    @Override
    public int getCount() {
        return mSV.size();
    }

    @Override
    public Object getItem(int position) {
        return mSV.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layoutID, null);
        ImageView imgHinh1 = (ImageView) convertView.findViewById(R.id.imgHinh);
        TextView tvName = (TextView) convertView.findViewById(R.id.txtName);
        TextView tvSDT = (TextView) convertView.findViewById(R.id.txtSDT);
        TextView tvQue = (TextView) convertView.findViewById(R.id.txtQuequan);
        TextView tvSex = (TextView) convertView.findViewById(R.id.txtGioitinh);

        Student sv = mSV.get(position);
        tvName.setText(sv.getName());
        tvSDT.setText(sv.getPhoneNum());
        tvQue.setText(sv.getAddress());
        tvSex.setText(sv.getGender());
        imgHinh1.setImageResource(sv.getHinhanh());

        return convertView;
    }
}
