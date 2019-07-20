package adv.dantoniopeluso.weighttracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static adv.dantoniopeluso.weighttracker.DataHelperContract.DataEntry.COLUMN_DATE;
import static adv.dantoniopeluso.weighttracker.DataHelperContract.DataEntry.COLUMN_ID;
import static adv.dantoniopeluso.weighttracker.DataHelperContract.DataEntry.COLUMN_PESO;
import static adv.dantoniopeluso.weighttracker.DataHelperContract.DataEntry.DATBASE_VERSION;
import static adv.dantoniopeluso.weighttracker.DataHelperContract.DataEntry.TABLE_NAME;

public class DataHelper extends SQLiteOpenHelper {

    public DataHelper(Context context) {
        super(context, TABLE_NAME, null, DATBASE_VERSION);

        final String SQL_CREATE_ENTRIES = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTENGER PRIMARY KEY, " +
                COLUMN_DATE + " TEXT, " +
                COLUMN_PESO + " DECIMAL)";
        final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TABLE_NAME;


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_ENTRIES = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTENGER PRIMARY KEY, " +
                COLUMN_DATE + " TEXT, " +
                COLUMN_PESO + " DECIMAL)";
        db.execSQL(SQL_CREATE_ENTRIES);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {


    }
}
