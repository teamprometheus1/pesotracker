package adv.dantoniopeluso.weighttracker;

import android.provider.BaseColumns;

public final class DataHelperContract {

        private DataHelperContract(){}

        public static class DataEntry implements BaseColumns{

                public static final int DATBASE_VERSION = 1;
                public static final String TABLE_NAME = "pesagens";
                public static final String COLUMN_ID = "ID";
                public static final String COLUMN_DATE = "date";
                public static final String COLUMN_PESO = "peso";
        }


        }
