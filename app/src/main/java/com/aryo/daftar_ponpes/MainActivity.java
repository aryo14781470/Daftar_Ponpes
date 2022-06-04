package com.aryo.daftar_ponpes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Adapter_Array> listData;
    ListView LV_Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Set_Object();
        Listen_LV();
    }
    private void Inisial() {
        listData = new ArrayList<>();
        //set title 1
        String Nama1Jatim = "Al Amien";
        String Nama1Jateng = "Al Asror";
        String Nama1DIY = "Al Munawwir";
        String Nama1Jabar = "Al Maksoem";
        String Nama1DKI = "Al Isyraq";
        String Nama1Banten = "Al Mubarok";
        String Nama1Lampung = "Al Hikmah";
        String Nama1Sumsel = "Miftahul Jannah";
        String Nama1Bali = "Hidayatullah";
        String Nama1Madura = "Darul Ulum";

        //set title 2
        String Nama2Jatim = "Al Falah";
        String Nama2Jateng = "Al Itiqon";
        String Nama2DIY = "Diponegoro";
        String Nama2Jabar = "Al Ikhlas";
        String Nama2DKI = "Asshidiqiyah";
        String Nama2Banten = "Daar el Qolam";
        String Nama2Lampung = "Darussaadah";
        String Nama2Sumsel = "Al Falah Putak";
        String Nama2Bali = "Al Ma`ruf";
        String Nama2Madura = "As somadiyah";

        //set title 3
        String Nama3Jatim = "Gontor";
        String Nama3Jateng = "Al Munawir";
        String Nama3DIY = "Al Barokah";
        String Nama3Jabar = "Al Umanaa";
        String Nama3DKI = "Darul Rahman";
        String Nama3Banten = "Riyadhussolihin";
        String Nama3Lampung = "Darul Hikmah";
        String Nama3Sumsel = "Tahfidz Nurul Huda";
        String Nama3Bali = "KH Mas Manshur";
        String Nama3Madura = "Miftahul Ulum";

        //set title 4
        String Nama4Jatim = "Lirboyo";
        String Nama4Jateng = "Askhabul Kahfi";
        String Nama4DIY = "Al Khairaat";
        String Nama4Jabar = "Darul Muttaqien";
        String Nama4DKI = "Luhur Al Tsaqafah";
        String Nama4Banten = "La Tansa";
        String Nama4Lampung = "Darul Fatah";
        String Nama4Sumsel = "Al Islah";
        String Nama4Bali = "Darunnajah";
        String Nama4Madura = "Mambaul Ulum";

        //Set Data
        listData.add(new Adapter_Array("Jawa Timur", Nama1Jatim, Nama2Jatim, Nama3Jatim, Nama4Jatim, R.drawable.jatim));
        listData.add(new Adapter_Array("Jawa Tengah", Nama1Jateng, Nama2Jateng, Nama3Jateng, Nama4Jateng, R.drawable.jateng));
        listData.add(new Adapter_Array("DIY Jogja", Nama1DIY, Nama2DIY, Nama3DIY, Nama4DIY, R.drawable.diy));
        listData.add(new Adapter_Array("Jawa Barat", Nama1Jabar, Nama2Jabar, Nama3Jabar, Nama4Jabar, R.drawable.jabar));
        listData.add(new Adapter_Array("DKI Jakarta", Nama1DKI, Nama2DKI, Nama3DKI, Nama4DKI, R.drawable.dki));
        listData.add(new Adapter_Array("Banten", Nama1Banten, Nama2Banten, Nama3Banten, Nama4Banten, R.drawable.banten));
        listData.add(new Adapter_Array("Lampung", Nama1Lampung, Nama2Lampung, Nama3Lampung, Nama4Lampung, R.drawable.lampung));
        listData.add(new Adapter_Array("Sumatra Selatan", Nama1Sumsel, Nama2Sumsel, Nama3Sumsel, Nama4Sumsel, R.drawable.sumsel));
        listData.add(new Adapter_Array("Bali", Nama1Bali, Nama2Bali, Nama3Bali, Nama4Bali, R.drawable.bali));
        listData.add(new Adapter_Array("Madura", Nama1Madura, Nama2Madura, Nama3Madura, Nama4Madura, R.drawable.madura));
        LV_Data = findViewById(R.id.ListView_Main);
    }

    private void Set_Object() {
        //Set Adapter Dengan Template ke Main Act
        AdapterList adapterList = new AdapterList(MainActivity.this, R.layout.temp_listview, listData);
        LV_Data.setAdapter(adapterList);
    }

    private void Listen_LV() {
        //Kirim Data GlobarVar yg Telah Dimasikan Dalam Array Ke DetalAct
        LV_Data.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(GlobalVar.EXTRA_Header, listData.get(position).Header);
            intent.putExtra(GlobalVar.EXTRA_NAMA1, listData.get(position).NamaSatu);
            intent.putExtra(GlobalVar.EXTRA_NAMA2, listData.get(position).NamaDua);
            intent.putExtra(GlobalVar.EXTRA_NAMA3, listData.get(position).NamaTiga);
            intent.putExtra(GlobalVar.EXTRA_NAMA4, listData.get(position).NamaEmpat);
            intent.putExtra(GlobalVar.EXTRA_GAMBAR, listData.get(position).Gambar);
            startActivity(intent);
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //Menu Keluar APP
        if (id == R.id.action_exit){
            AlertDialog.Builder A_Builder = new AlertDialog.Builder(MainActivity.this);
            A_Builder.setMessage(getString(R.string.confirm))
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            AlertDialog Alert = A_Builder.create();
            Alert.setTitle(getString(R.string.confirm));
            Alert.show();
        }
        //Menu Ganti Bahasa
        if (id == R.id.action_language){
            Intent mintent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mintent);
        }
        //Menu Panggil Profile Aryo
        if (id == R.id.action_profile){
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}