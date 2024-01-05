package com.example.lab042;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMonHoc;
    private MonHocAdapter monHocAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMonHoc = findViewById(R.id.recyclerViewMonHoc);

        // Tạo danh sách các môn học
        List<MonHoc> monHocList = new ArrayList<>();
        monHocList.add(new MonHoc(R.mipmap.ic_launcher, "CMP354", "Lập trình di động", "Nguyễn Huy Cường"));
        monHocList.add(new MonHoc(R.mipmap.ic_launcher, "CMP324", "Lập trình Java", "Nguyễn Văn A"));

        // Khởi tạo và đặt Adapter cho RecyclerView
        monHocAdapter = new MonHocAdapter(this, monHocList);
        recyclerViewMonHoc.setAdapter(monHocAdapter);

        // Thiết lập layout cho RecyclerView (Linear Layout)
        recyclerViewMonHoc.setLayoutManager(new LinearLayoutManager(this));
    }
}
