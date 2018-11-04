package com.app.softikus.friday.mo;

import com.app.softikus.friday.MainActivity;
import com.app.softikus.friday.R;

public class Mo {
    private Boolean isFriday;

    private MainActivity.AppModus appModus;

    public Mo(MainActivity.AppModus appModus) {
        this.appModus = appModus;
    }

    public String getResultString(MainActivity mainActivity) {
        if (isFriday || MainActivity.AppModus.DELUXE == appModus) {
            return mainActivity.getString(R.string.app_answer_yes_en);
        } else {
            return mainActivity.getString(R.string.app_answer_no_en);
        }
    }

    public void setIsFriday(Boolean isFriday) {
        this.isFriday = isFriday;
    }
}