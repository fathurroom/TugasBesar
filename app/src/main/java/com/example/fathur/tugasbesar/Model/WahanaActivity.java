package com.example.fathur.tugasbesar.Model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.example.fathur.tugasbesar.Adapter.WahanaAdapter;
import com.example.fathur.tugasbesar.R;

import java.util.ArrayList;
import java.util.List;

public class WahanaActivity extends AppCompatActivity {

    Button bthome, btfasilitas, btdeskripsi, btanggota, btwahana;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Wahana> mWahanas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana);

//        button();
        mRecyclerView = (RecyclerView) findViewById(R.id.rvWahana);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new WahanaAdapter(mWahanas,this);
        mRecyclerView.setAdapter(mAdapter);

    }

//    public void button(){
//        Button bthome = (Button) findViewById(R.id.bthome);
//        bthome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(WahanaActivity.this, HomeActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
//
//        Button btfasilitas = (Button) findViewById(R.id.btfasilitas);
//        btfasilitas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(WahanaActivity.this, FasilitasActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
//
//        Button btdeskripsi = (Button) findViewById(R.id.btdesc);
//        btdeskripsi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(WahanaActivity.this, DeskripsiActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
//
//        Button btanggota = (Button) findViewById(R.id.btanggota);
//        btanggota.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(WahanaActivity.this, AnggotaActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
//    }

    private void dummyData() {
        Wahana fasilitas= new Wahana(R.drawable.alif,getString(R.string.title_alif),getString(R.string.comment_1));
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.alfa,getString(R.string.title_alfa),getString(R.string.comment_2));
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.wayan,getString(R.string.title_wayan),getString(R.string.comment_3));
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.pringgo,getString(R.string.title_pringgo),getString(R.string.comment_4));
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.rufii,getString(R.string.title_rufii),getString(R.string.comment_5));
        mWahanas.add(fasilitas);
    }

}
