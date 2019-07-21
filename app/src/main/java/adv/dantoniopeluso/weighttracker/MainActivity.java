package adv.dantoniopeluso.weighttracker;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        DataHelper = new DataHelper(this);
    }

    public void onClick(View view){
        Button btn1 = findViewById(R.id.btnsave);
        Calendar cal = Calendar.getInstance();
        TextView textdate = findViewById(R.id.txtdate);
        textdate.setText(cal.get(Calendar.DAY_OF_MONTH) + " - " + (cal.get(Calendar.MONTH)+1) + " - " + cal.get(Calendar.YEAR));
        String dataDehoje = findViewById(R.id.txtdate).toString();
        SQLiteDatabase db = DataHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        EditText mEdit = findViewById(R.id.txtweight);
        String pesoDeHoje = mEdit.getText().toString();
        double pesoDeHojeFinal = Float.parseFloat(pesoDeHoje);
        System.out.println(pesoDeHoje);
        System.out.println(pesoDeHojeFinal);
        contentValues.put(DataHelperContract.DataEntry.COLUMN_DATE, dataDehoje);
        contentValues.put(DataHelperContract.DataEntry.COLUMN_PESO, pesoDeHoje);
        mEdit.setText("");
        //TODO implementar troca de tela, list view e grafico

    }


}
