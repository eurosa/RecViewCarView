package com.example.w3e_52.recviewcarview;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.GridView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
private CheckBox chkSelected;
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private CardView cardView;

    private ArrayList<Persons> image;

    private RecyclerView.Adapter mAdapter;
    private Button clickButton;
    File file;
    // Declare variables
    private String[] FilePathStrings;
    private String[] FileNameStrings;
    private File[] listFile;
    GridView grid;
    // private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkSelected = (CheckBox) findViewById(R.id.chkSelected);
        clickButton=(Button)findViewById(R.id.convert);
        initContrls();
//        addListenerOnClickBtn();

    }

//
//    public  void addListenerOnClickBtn(){
//
//        clickButton.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//
//Intent intent =new Intent(this,SecondPage.class);
//
//                Toast.makeText(getApplicationContext(),"clicked on button",Toast.LENGTH_LONG).show();
//
//
//
//            }
//        });
//
//    }

    public void onClickButton(View view){
        Toast.makeText(getApplicationContext(),"clicked on button",Toast.LENGTH_LONG).show();
        Intent intent =new Intent(this,SecondPage.class);
        startActivity(intent);
    }

//    public void addListenerOnChkIos() {
//
//
//
//        chkSelected.setOnClickListener(Znew View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                //is chkIos checked?
//                if (((CheckBox) v).isChecked()) {
//                    Toast.makeText(getApplicationContext(),
//                            "Bro, try Android :)", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        });
//
//    }

//    public void convertLayout(View view){
//
//        //do something here
//
//
//    }

    private void initContrls() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  cardView = (CardView) findViewById(R.id.cardList);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("");

        }
//       final String[] id = {"1", "2","3","4","4","5","6","7","8"};
//        final String[] versions = {"Search Icon", "Skull Icon","Dead","Galaxy","Skull head","Iphone","Jack","Skull","Twitter"};
//        final int[] icons = {R.drawable.search, R.drawable.skull, R.drawable.dead, R.drawable.galaxy, R.drawable.skull_bw, R.drawable.iphone, R.drawable.jack, R.drawable.index,  R.drawable.twitter};


        image = new ArrayList<Persons>();

//        // Check for SD Card
//        if (!Environment.getExternalStorageState().equals(
//                Environment.MEDIA_MOUNTED)) {
//            Toast.makeText(this, "Error! No SDCARD Found!", Toast.LENGTH_LONG)
//                    .show();
//        } else {
//            // Locate the image folder in your SD Card
//            file = new File(Environment.getExternalStorageDirectory()
//                    + File.separator + "SDImageTutorial");
//
//            // Create a new folder if no folder named SDImageTutorial exist
//            file.mkdirs();
//        }

//        if (file.isDirectory()) {
        String baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();
        String fileName = "DCIM";

// Not sure if the / is on the path or not
        File file = new File(baseDir + "/"+ fileName);
//        File file = new File(Environment.getExternalStorageDirectory(), "/storage/sdcard/DCIM");
            listFile = file.listFiles();
        Toast.makeText(MainActivity.this, "sabuj"+file, Toast.LENGTH_SHORT).show();
            // Create a String array for FilePathStrings
            FilePathStrings = new String[listFile.length];
            // Create a String array for FileNameStrings
            FileNameStrings = new String[listFile.length];

            for (int i = 0; i < listFile.length; i++) {
                // Get the path of the image file
                FilePathStrings[i] = listFile[i].getAbsolutePath();
                // Get the name image file
                FileNameStrings[i] = listFile[i].getName();
                Persons feed = new Persons();
                Toast.makeText(MainActivity.this, "sabuj", Toast.LENGTH_SHORT).show();
//                feed.setId(String.valueOf(versions[i]));
                feed.setName(FileNameStrings[i]);
                image.add(feed);
            }
//        }/**/

//        for (int i = 0; i < versions.length; i++) {
//            Persons feed = new Persons();
//
//            feed.setId(String.valueOf(versions[i]));
//            feed.setName(String.valueOf(icons[i]));
//            image.add(feed);
//        }

        recyclerView.setHasFixedSize(true);

        // ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Grid View
        // recyclerView.setLayoutManager(new GridLayoutManager(this,2,1,false));

        //StaggeredGridView
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));

        // create an Object for Adapter
        mAdapter = new CardViewAdapter(image);

        // set the adapter object to the Recyclerview
        recyclerView.setAdapter(mAdapter);


    }

    @Override
    public void onItemClick (AdapterView < ? > arg0, View arg1,int arg2, long arg3){
        // TODO Auto-generated method stub
        CheckedTextView ctv = (CheckedTextView) arg1;
        if (ctv.isChecked()) {
            Toast.makeText(MainActivity.this, "now it is unchecked", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "now it is checked", Toast.LENGTH_SHORT).show();
        }
    }


}