package adv.dantoniopeluso.weighttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import static adv.dantoniopeluso.weighttracker.R.id.listviewpesos;
import static adv.dantoniopeluso.weighttracker.R.layout.activity_main;

public class VerPesos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Button btn_voltar = findViewById(R.id.btn_voltar);
        Button btn_voltar = (Button) findViewById(R.id.btn_voltar);
        Button btnsave = (Button) findViewById(R.id.btnsave);

        setContentView(R.layout.activity_ver_pesos);
        String[] food = {"Hello World!", "Bacon", "Tuna", "Ham"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, food);
        ListView listviewpesos = findViewById(R.id.listviewpesos);
        listviewpesos.setAdapter(adapter);
    }

    public void onClick(View view) {
    }
}
