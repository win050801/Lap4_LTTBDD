package com.example.thang;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.thang.R;
import com.example.thang.LanguageAdapter;
import com.example.thang.Language;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Ca nấu lẩu, nấu mì mini...","Sho Devang"));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.items_custum_listview, listLanguage);
        listView.setAdapter(adapter);

    }
}
