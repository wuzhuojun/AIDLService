package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2016/8/29.
 */
public class RemoteService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private final IMyAidlInterface.Stub binder = new IMyAidlInterface.Stub() {
        @Override
        public void print() throws RemoteException {
            Log.v("hehe", "remote service!!!!!!!!!!!!!!!!!!!!!!!");
        }
    };
}
