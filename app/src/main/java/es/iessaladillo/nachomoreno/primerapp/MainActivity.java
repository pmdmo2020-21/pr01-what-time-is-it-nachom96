package es.iessaladillo.nachomoreno.primerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView;
        textView = findViewById(R.id.fecha);

        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateTime= simpleDateFormat.format(calendario.getTime());
        textView.setText(dateTime);

        TextView textView2;
        textView2 = findViewById(R.id.hora);
        simpleDateFormat = new SimpleDateFormat("hh:mm");
        String dateTime2= simpleDateFormat.format(calendario.getTime());
        textView2.setText(dateTime2);
    }
}