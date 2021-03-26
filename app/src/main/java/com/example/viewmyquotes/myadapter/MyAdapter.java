package com.example.viewmyquotes.myadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.viewmyquotes.model.Model;
import com.example.viewmyquotes.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Model> {

    Activity activity;
    List<Model> list;

    public MyAdapter(@NonNull  Activity activity, List<Model> list) {
        super(activity, R.layout.viewquotes,list);
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater= activity.getLayoutInflater();
        convertView=layoutInflater.inflate(R.layout.viewquotes,null,true);

        TextView id=convertView.findViewById(R.id.qid);
        TextView qt=convertView.findViewById(R.id.qts);
        TextView qauth=convertView.findViewById(R.id.qauth);

        Model model=list.get(position);

        id.setText(model.getId());
        qt.setText(model.getQuotes());
        qauth.setText(model.getAuthor());

        return convertView;
    }
}
