package com.app.softikus.friday;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.app.softikus.friday.co.Co;

public class MainActivity extends AppCompatActivity {

    public enum AppModus {
        LITE {
            @NonNull
            public String toString() {
                return "Lite";
            }
        },
        PREMIUM {
            @NonNull
            public String toString() {
                return "Premium";
            }
        },
        DELUXE {
            @NonNull
            public String toString() {
                return "Deluxe";
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Co co = new Co(AppModus.PREMIUM);

        //findViewById(R.id.);
        TextView text = null;
        text.setText(co.getMo().getResultString(this));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
    }
}