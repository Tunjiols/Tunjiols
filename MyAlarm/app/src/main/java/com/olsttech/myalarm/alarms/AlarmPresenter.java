package com.olsttech.myalarm.alarms;

import android.content.Context;
import android.support.annotation.NonNull;

import com.olsttech.myalarm.data.AlarmDataManager;
import com.olsttech.myalarm.data.AlarmDataManagerApi;
import com.olsttech.myalarm.models.Alarm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adetunji on 01/09/2018.class AlarmPresenter
 */

public class AlarmPresenter implements AlarmContract.Presenter{

    private AlarmContract.View mView;
    private AlarmDataManagerApi.LoadAlarmFromPreference mAlarmDataManager;

    public AlarmPresenter(AlarmContract.View view, Context context){
        this.mView = view;
        mAlarmDataManager = new AlarmDataManager(context);
    }

    @Override
    public void getAllAlarms() {

        mAlarmDataManager.getAllAlarms(new AlarmDataManagerApi.DataManagerLoadAlarmCallBack() {
            @Override
            public void onAlarmLoaded(List<Alarm> alarms) {
                mView.showAlarms(alarms);
            }
        });

    }

    @Override
    public void getAlarm(String alarmId) {

    }
    
    @Override
    public void addAlarm(){
        mView.showAddAlarm();
    }

    @Override
    public void openEditAlarmScreen(@NonNull Alarm clickedAlarm){
        mView.showEditAlarmScreen(clickedAlarm);
    }
    
    @Override
    public void editAlarm(@NonNull List<Alarm>  alarmList){
        mView.showAlarmEditScreen("", alarmList);
    }

    @Override
    public void getAlarmRadioBtnStatus() {

    }
}
