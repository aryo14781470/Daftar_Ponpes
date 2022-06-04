package com.aryo.daftar_ponpes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView TV_Header, TV_Title, TV_Desc, TV_Nama1, TV_Desc1, TV_Nama2, TV_Desc2, TV_Nama3, TV_Desc3, TV_Nama4, TV_Desc4,
            TV_Sub1, TV_Sub2, TV_Sub3;
    ImageView IV_Logo, IV_Nama1, IV_Nama2, IV_Nama3, IV_Nama4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Inisial();
        Set_Object();
    }
    private void Inisial() {
        //Card View 1
        IV_Logo = findViewById(R.id.circleImageView_Detail_Logo);
        TV_Header = findViewById(R.id.textView_Detail_NProv);
        TV_Title = findViewById(R.id.textView_Detail_NPonS);
        TV_Nama1 = findViewById(R.id.textView_Detail_Nama1);
        TV_Desc1 = findViewById(R.id.textView_Detail_Desc1);
        TV_Nama2 = findViewById(R.id.textView_Detail_Nama2);
        TV_Desc2 = findViewById(R.id.textView_Detail_Desc2);
        TV_Nama3 = findViewById(R.id.textView_Detail_Nama3);
        TV_Desc3 = findViewById(R.id.textView_Detail_Desc3);
        //Card View 2
        IV_Nama1 = findViewById(R.id.ImageView_Detail_Gambar1);
        TV_Sub1 = findViewById(R.id.textView_Detail_Nama11);
        IV_Nama2 = findViewById(R.id.ImageView_Detail_Gambar2);
        TV_Sub2 = findViewById(R.id.textView_Detail_Nama22);
        IV_Nama3 = findViewById(R.id.ImageView_Detail_Gambar3);
        TV_Sub3 = findViewById(R.id.textView_Detail_Nama33);
        //Card View 3
        TV_Desc = findViewById(R.id.textView_Detail_Desc_Prov);
        //Card View 4
        IV_Nama4 = findViewById(R.id.ImageView_Detail_Gambar4);
        TV_Nama4 = findViewById(R.id.textView_Detail_Nama4);
        TV_Desc4 = findViewById(R.id.textView_Detail_Desc4);
    }

    private void Set_Object() {
        //ambil put Extra
        Bundle bundle = getIntent().getExtras();

        //Set Header
        String Header = bundle.getString(GlobalVar.EXTRA_Header);
        TV_Header.setText(Header);
        //Set Desc Header
        if (Header.equals("Jawa Timur")){ TV_Desc.setText(getString(R.string.jatim)); }
        if (Header.equals("Jawa Tengah")){ TV_Desc.setText(getString(R.string.jateng)); }
        if (Header.equals("DIY Jogja")){ TV_Desc.setText(getString(R.string.diy)); }
        if (Header.equals("Jawa Barat")){ TV_Desc.setText(getString(R.string.jabar)); }
        if (Header.equals("DKI Jakarta")){ TV_Desc.setText(getString(R.string.dki)); }
        if (Header.equals("Banten")){ TV_Desc.setText(getString(R.string.banten)); }
        if (Header.equals("Lampung")){ TV_Desc.setText(getString(R.string.lampung)); }
        if (Header.equals("Sumatra Selatan")){ TV_Desc.setText(getString(R.string.sumsel)); }
        if (Header.equals("Bali")){ TV_Desc.setText(getString(R.string.bali)); }
        if (Header.equals("Madura")){ TV_Desc.setText(getString(R.string.madura)); }

        //Set Nama 1
        String Name1 = bundle.getString(GlobalVar.EXTRA_NAMA1);
        TV_Nama1.setText(Name1);
        TV_Sub1.setText(Name1);
        //Set Desc 1 dan Gambar 1
        if (Name1.equals("Al Amien")){ TV_Desc1.setText(getString(R.string.jatimnama1)); IV_Nama1.setImageResource(R.drawable.alamien);}
        if (Name1.equals("Al Asror")){ TV_Desc1.setText(getString(R.string.jatengnama1)); IV_Nama1.setImageResource(R.drawable.alasror);}
        if (Name1.equals("Al Munawwir")){ TV_Desc1.setText(getString(R.string.diynama1)); IV_Nama1.setImageResource(R.drawable.almunawwir);}
        if (Name1.equals("Al Maksoem")){ TV_Desc1.setText(getString(R.string.jabarnama1)); IV_Nama1.setImageResource(R.drawable.almaksoem);}
        if (Name1.equals("Al Isyraq")){ TV_Desc1.setText(getString(R.string.dkinama1)); IV_Nama1.setImageResource(R.drawable.alisraq);}
        if (Name1.equals("Al Mubarok")){ TV_Desc1.setText(getString(R.string.bantennama1)); IV_Nama1.setImageResource(R.drawable.almubarok);}
        if (Name1.equals("Al Hikmah")){ TV_Desc1.setText(getString(R.string.lampungnama1)); IV_Nama1.setImageResource(R.drawable.alhikmah);}
        if (Name1.equals("Miftahul Jannah")){ TV_Desc1.setText(getString(R.string.sumselnama1)); IV_Nama1.setImageResource(R.drawable.miftahuljannah);}
        if (Name1.equals("Hidayatullah")){ TV_Desc1.setText(getString(R.string.balinama1)); IV_Nama1.setImageResource(R.drawable.hidayatullah);}
        if (Name1.equals("Darul Ulum")){ TV_Desc1.setText(getString(R.string.maduranama1)); IV_Nama1.setImageResource(R.drawable.darululum);}

        //Set Nama 2
        String Name2 =  bundle.getString(GlobalVar.EXTRA_NAMA2);
        TV_Nama2.setText(Name2);
        TV_Sub2.setText(Name2);
        //Set Desc 2 dan Gambar 2
        if (Name2.equals("Al Falah")){ TV_Desc2.setText(getString(R.string.jatimnama2)); IV_Nama2.setImageResource(R.drawable.alfalah);}
        if (Name2.equals("Al Itiqon")){ TV_Desc2.setText(getString(R.string.jatengnama2)); IV_Nama2.setImageResource(R.drawable.alitqon);}
        if (Name2.equals("Diponegoro")){ TV_Desc2.setText(getString(R.string.diynama2)); IV_Nama2.setImageResource(R.drawable.diponegoro);}
        if (Name2.equals("Al Ikhlas")){ TV_Desc2.setText(getString(R.string.jabarnama2)); IV_Nama2.setImageResource(R.drawable.alikhlas);}
        if (Name2.equals("Asshidiqiyah")){ TV_Desc2.setText(getString(R.string.dkinama2)); IV_Nama2.setImageResource(R.drawable.asshiddiqiyah);}
        if (Name2.equals("Daar el Qolam")){ TV_Desc2.setText(getString(R.string.bantennama2)); IV_Nama2.setImageResource(R.drawable.elqolam);}
        if (Name2.equals("Darussaadah")){ TV_Desc2.setText(getString(R.string.lampungnama2)); IV_Nama2.setImageResource(R.drawable.darussaadah);}
        if (Name2.equals("Al Falah Putak")){ TV_Desc2.setText(getString(R.string.sumselnama2)); IV_Nama2.setImageResource(R.drawable.falahputak);}
        if (Name2.equals("Al Ma`ruf")){ TV_Desc2.setText(getString(R.string.balinama2)); IV_Nama2.setImageResource(R.drawable.almaaruf);}
        if (Name2.equals("As somadiyah")){ TV_Desc2.setText(getString(R.string.maduranama2)); IV_Nama2.setImageResource(R.drawable.assomadyah);}

        //Set Nama 3
        String Name3 = bundle.getString(GlobalVar.EXTRA_NAMA3);
        TV_Nama3.setText(Name3);
        TV_Sub3.setText(Name3);
        //Set Desc 3 dan Gambar 3
        if (Name3.equals("Gontor")){ TV_Desc3.setText(getString(R.string.jatimnama3)); IV_Nama3.setImageResource(R.drawable.gontor);}
        if (Name3.equals("Al Munawir")){ TV_Desc3.setText(getString(R.string.jatengnama3)); IV_Nama3.setImageResource(R.drawable.almunawir);}
        if (Name3.equals("Al Barokah")){ TV_Desc3.setText(getString(R.string.diynama3)); IV_Nama3.setImageResource(R.drawable.albarokah);}
        if (Name3.equals("Al Umanaa")){ TV_Desc3.setText(getString(R.string.jabarnama3)); IV_Nama3.setImageResource(R.drawable.alumana);}
        if (Name3.equals("Darul Rahman")){ TV_Desc3.setText(getString(R.string.dkinama3)); IV_Nama3.setImageResource(R.drawable.darulrahman);}
        if (Name3.equals("Riyadhussolihin")){ TV_Desc3.setText(getString(R.string.bantennama3)); IV_Nama3.setImageResource(R.drawable.riyadhussolihin);}
        if (Name3.equals("Darul Hikmah")){ TV_Desc3.setText(getString(R.string.lampungnama3)); IV_Nama3.setImageResource(R.drawable.darulhikmah);}
        if (Name3.equals("Tahfidz Nurul Huda")){ TV_Desc3.setText(getString(R.string.sumselnama3)); IV_Nama3.setImageResource(R.drawable.nurulhuda);}
        if (Name3.equals("KH Mas Manshur")){ TV_Desc3.setText(getString(R.string.balinama3)); IV_Nama3.setImageResource(R.drawable.khmasmansur);}
        if (Name3.equals("Miftahul Ulum")){ TV_Desc3.setText(getString(R.string.maduranama3)); IV_Nama3.setImageResource(R.drawable.miftahululum);}

        //Set Nama 4
        String Name4 =  bundle.getString(GlobalVar.EXTRA_NAMA4);
        TV_Nama4.setText(Name4);
        if (Name4.equals("Lirboyo")){ TV_Desc4.setText(getString(R.string.jatimnama4)); IV_Nama4.setImageResource(R.drawable.lirboyo);}
        if (Name4.equals("Askhabul Kahfi")){ TV_Desc4.setText(getString(R.string.jatengnama4)); IV_Nama4.setImageResource(R.drawable.askhabulkahfi);}
        if (Name4.equals("Al Khairaat")){ TV_Desc4.setText(getString(R.string.diynama4)); IV_Nama4.setImageResource(R.drawable.alkhairaat);}
        if (Name4.equals("Darul Muttaqien")){ TV_Desc4.setText(getString(R.string.jabarnama4)); IV_Nama4.setImageResource(R.drawable.darulmuttaquen);}
        if (Name4.equals("Luhur Al Tsaqafah")){ TV_Desc4.setText(getString(R.string.dkinama4)); IV_Nama4.setImageResource(R.drawable.assaqafah);}
        if (Name4.equals("La Tansa")){ TV_Desc4.setText(getString(R.string.bantennama4)); IV_Nama4.setImageResource(R.drawable.latansa);}
        if (Name4.equals("Darul Fatah")){ TV_Desc4.setText(getString(R.string.lampungnama4)); IV_Nama4.setImageResource(R.drawable.darulfatah);}
        if (Name4.equals("Al Islah")){ TV_Desc4.setText(getString(R.string.sumselnama4)); IV_Nama4.setImageResource(R.drawable.alishlah);}
        if (Name4.equals("Darunnajah")){ TV_Desc4.setText(getString(R.string.balinama4)); IV_Nama4.setImageResource(R.drawable.darunnajah);}
        if (Name4.equals("Mambaul Ulum")){ TV_Desc4.setText(getString(R.string.maduranama4)); IV_Nama4.setImageResource(R.drawable.mambaululum);}


        //Set Gambar dan Logo
        int Gambar = bundle.getInt(GlobalVar.EXTRA_GAMBAR,0);
        IV_Logo.setImageResource(Gambar);

        //Set Title
        TV_Title.setText(Name1 + " - " + Name2 + " - " + Name3 + " - " + Name4);
    }

}