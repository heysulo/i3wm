package com.whileloop.walkmode_p1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Overkill2 extends Service {
    public Overkill2() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}