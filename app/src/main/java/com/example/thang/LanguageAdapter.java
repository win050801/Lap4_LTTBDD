package com.example.thang;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.thang.R;
import com.example.thang.CustomListViewExampleActivity;
import com.example.thang.Language;

import java.util.List;

public class LanguageAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Language> listLanguage;
    private int positionSelect = -1;

    public LanguageAdapter(CustomListViewExampleActivity context, int idLayout, List<Language> listLanguage) {
        this.context = context;
        this.idLayout = idLayout;
        this.listLanguage = listLanguage;
    }

    @Override
    public int getCount() {
        if (listLanguage.size() != 0 && !listLanguage.isEmpty()) {
            return listLanguage.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvLanguagefirstName = (TextView) convertView.findViewById(R.id.tvLanguagefirstName);
        TextView tvLanguagelastName = (TextView) convertView.findViewById(R.id.tvLanguagelastName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.logo);
        Button button = convertView.findViewById(R.id.button);
        final ConstraintLayout linearLayout =  convertView.findViewById(R.id.idLinearLayout);
        final Language language = listLanguage.get(position);

        if (listLanguage != null && !listLanguage.isEmpty()) {
            tvLanguagefirstName.setText(language.getName());
            tvLanguagelastName.setText(language.getTen());
            int idLanguage = language.getId();
            switch (idLanguage) {
                case 1:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, language.getName(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }

}
