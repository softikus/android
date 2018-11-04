package com.app.softikus.friday.co;

import com.app.softikus.friday.MainActivity;
import com.app.softikus.friday.mo.Mo;

import java.util.Calendar;

public class Co {
    private Mo mo;

    public Co(MainActivity.AppModus appModus) {
        mo = new Mo(appModus);
        calculateIfFridayIsDayOfTheWeek();
    }

    private void calculateIfFridayIsDayOfTheWeek() {
        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 6) {
            mo.setIsFriday(Boolean.TRUE);
        } else {
            mo.setIsFriday(Boolean.FALSE);
        }
    }

    public Mo getMo() {
        return mo;
    }
}
