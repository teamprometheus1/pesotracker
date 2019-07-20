package adv.dantoniopeluso.weighttracker;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DataHelper DataHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btnsave);
        Calendar cal = Calendar.getInstance();
        TextView textdate = findViewById(R.id.txtdate);
        textdate.setText(cal.get(Calendar.DAY_OF_MONTH) + " - " + (cal.get(Calendar.MONTH)+1) + " - " + cal.get(Calendar.YEAR));
        String dataDehoje = findViewById(R.id.txtdate).toString();
        String pesoDeHoje = findViewById(R.id.txtweight).toString();
//        float pesoDeHojeFinal = Float.parseFloat(pesoDeHoje);
        DataHelper = new DataHelper(this);
//        DataHelper.addData(dataDehoje, 97);
    }

    public void onClick(View view){
        Button btn1 = findViewById(R.id.btnsave);
    }


}
