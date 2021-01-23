package com.example.inventorylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private ArrayList<String> data3 = new ArrayList<String>();
    private TableLayout table;

    EditText ed1, ed2, ed3;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            add();
            }
        });

    }

    public void add(){

        String prodname = ed1.getText().toString();
        int Expdate = Integer.parseInt(ed2.getText().toString());
        int qty = Integer.parseInt(ed3.getText().toString());
        data.add(prodname);
        data2.add(String.valueOf(Expdate));
        data3.add(String.valueOf(qty));

        TableLayout table= (TableLayout) findViewById(R.id.table);
        TableRow row= new TableRow( this);
        TextView t1= new TextView(this);
        TextView t2= new TextView(this);
        TextView t3= new TextView(this);

        for(int i=0; i < data.size(); i ++ ){
            String proname = data.get(i);
            String Exp = data2.get(i);
            String Qt = data3.get(i);

            t1.setText(proname);
            t2.setText(Exp);
            t3.setText(Qt);
        }
        row.addView(t1);
        row.addView(t2);
        row.addView(t3);
        table.addView(row);
ed1.setText("");
ed2.setText("");
ed3.setText("");
ed1.requestFocus();

    }

}