package com.example.upessgpacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{


    private EditText c1, c2, c3, c4, c5, c6, c7, c8;
    private Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8;
    String[] grade = {"NULL","O(85-100)", "A+(75-84)", "A(65-74)", "B+(55-64)", "B(45-54)", "C+(40-44)", "C(35-39)"};
    private Button b;
    private int g1,g2,g3,g4,g5,g6,g7,g8;
    private TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCLick();
    }

    public void onCLick() {

        c1 = (EditText) findViewById(R.id.c1);
        c2 = (EditText) findViewById(R.id.c2);
        c3 = (EditText) findViewById(R.id.c3);
        c4 = (EditText) findViewById(R.id.c4);
        c5 = (EditText) findViewById(R.id.c5);
        c6 = (EditText) findViewById(R.id.c6);
        c7 = (EditText) findViewById(R.id.c7);
        c8 = (EditText) findViewById(R.id.c8);
        b=(Button) findViewById(R.id.button);
        final TextView out=(TextView) findViewById(R.id.output);

        Spinner spin1= (Spinner) findViewById(R.id.spinner1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                if (position == 0) {
                                                          g1=0;
                                                }
                                                if (position == 1) {
                                                    g1=10;
                                                }
                                                if (position == 2) {
                                                    g1=9;
                                                }
                                                if (position == 3) {
                                                    g1=8;
                                                }
                                                if (position == 4) {
                                                    g1=7;
                                                }
                                                if (position == 5) {
                                                    g1=6;
                                                }
                                                if (position == 6) {
                                                    g1=5;
                                                }
                                                if (position == 7) {
                                                    g1=4;
                                                }

                                            }

                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                ArrayAdapter s1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(s1);

        Spinner spin2= (Spinner) findViewById(R.id.spinner2);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    g2=0;
                }
                if (position == 1) {
                    g2=10;
                }
                if (position == 2) {
                    g2=9;
                }
                if (position == 3) {
                    g2=8;
                }
                if (position == 4) {
                    g2=7;
                }
                if (position == 5) {
                    g2=6;
                }
                if (position == 6) {
                    g2=5;
                }
                if (position == 7) {
                    g2=4;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(s2);

        Spinner spin3= (Spinner) findViewById(R.id.spinner3);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    g3=0;
                }
                if (position == 1) {
                    g3=10;
                }
                if (position == 2) {
                    g3=9;
                }
                if (position == 3) {
                    g3=8;
                }
                if (position == 4) {
                    g3=7;
                }
                if (position == 5) {
                    g3=6;
                }
                if (position == 6) {
                    g3=5;
                }
                if (position == 7) {
                    g3=4;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin3.setAdapter(s3);

        Spinner spin4= (Spinner) findViewById(R.id.spinner4);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    g4=0;
                }
                if (position == 1) {
                    g4=10;
                }
                if (position == 2) {
                    g4=9;
                }
                if (position == 3) {
                    g4=8;
                }
                if (position == 4) {
                    g4=7;
                }
                if (position == 5) {
                    g4=6;
                }
                if (position == 6) {
                    g4=5;
                }
                if (position == 7) {
                    g4=4;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin4.setAdapter(s4);

        Spinner spin5= (Spinner) findViewById(R.id.spinner5);
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    g5=0;
                }
                if (position == 1) {
                    g5=10;
                }
                if (position == 2) {
                    g5=9;
                }
                if (position == 3) {
                    g5=8;
                }
                if (position == 4) {
                    g5=7;
                }
                if (position == 5) {
                    g5=6;
                }
                if (position == 6) {
                    g5=5;
                }
                if (position == 7) {
                    g5=4;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s5 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin5.setAdapter(s5);

        Spinner spin6= (Spinner) findViewById(R.id.spinner6);
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    g6=0;
                }
                if (position == 1) {
                    g6=10;
                }
                if (position == 2) {
                    g6=9;
                }
                if (position == 3) {
                    g6=8;
                }
                if (position == 4) {
                    g6=7;
                }
                if (position == 5) {
                    g6=6;
                }
                if (position == 6) {
                    g6=5;
                }
                if (position == 7) {
                    g6=4;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s6 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin6.setAdapter(s6);

        Spinner spin7= (Spinner) findViewById(R.id.spinner7);
        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    g7=0;
                }
                if (position == 1) {
                    g7=10;
                }
                if (position == 2) {
                    g7=9;
                }
                if (position == 3) {
                    g7=8;
                }
                if (position == 4) {
                    g7=7;
                }
                if (position == 5) {
                    g7=6;
                }
                if (position == 6) {
                    g7=5;
                }
                if (position == 7) {
                    g7=4;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s7 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin7.setAdapter(s7);

        Spinner spin8= (Spinner) findViewById(R.id.spinner8);
        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    g8=0;
                }
                if (position == 1) {
                    g8=10;
                }
                if (position == 2) {
                    g8=9;
                }
                if (position == 3) {
                    g8=8;
                }
                if (position == 4) {
                    g8=7;
                }
                if (position == 5) {
                    g8=6;
                }
                if (position == 6) {
                    g8=5;
                }
                if (position == 7) {
                    g8=4;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter s8 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, grade);
        s8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin8.setAdapter(s8);





        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String w1=c1.getText().toString();
                if(w1.isEmpty())
                {
                    w1="0";
                }
                float x1=Float.parseFloat(w1);

                String w2=c2.getText().toString();
                if(w2.isEmpty())
                {
                    w2="0";
                }
                float x2=Float.parseFloat(w2);

                String w3=c3.getText().toString();
                if(w3.isEmpty())
                {
                    w3="0";
                }
                float x3=Float.parseFloat(w3);

                String w4=c4.getText().toString();
                if(w4.isEmpty())
                {
                    w4="0";
                }
                float x4=Float.parseFloat(w4);

                String w5=c5.getText().toString();
                if(w5.isEmpty())
                {
                    w5="0";
                }
                float x5=Float.parseFloat(w5);

                String w6=c6.getText().toString();
                if(w6.isEmpty())
                {
                    w6="0";
                }
                float x6=Float.parseFloat(w6);

                String w7=c7.getText().toString();
                if(w7.isEmpty())
                {
                    w7="0";
                }
                float x7=Float.parseFloat(w7);

                String w8=c8.getText().toString();
                if(w8.isEmpty())
                {
                    w8="0";
                }
                float x8=Float.parseFloat(w8);
                float sum_credit=x1+x2+x3+x4+x5+x6+x7+x8;

                float total_sum=(float)((x1*g1)+(x2*g2)+(x3*g3)+(x4*g4)+(x5*g5)+(x6*g6)+(x7*g7)+(x8*g8))/sum_credit;

                String answer=Float.toString(total_sum);

                out.setText(answer);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.upes_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.about_app:
                Intent i = new Intent(getApplicationContext(), AboutApp.class);
                startActivity(i);

                return true;
            case R.id.about_us:
                Intent j = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}





