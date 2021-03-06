package com.olsttech.myalarm.helpers;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.olsttech.myalarm.models.SoundModel;

import java.util.List;

/** interface for LabelContract 
*/

public interface SoundsContract{

    interface View{
        void loadView(@NonNull List<SoundModel> soundNames);
    }
    
    interface Presenter{
        void getSounds(@NonNull SoundModel setSound);
    }
    
    interface SoundsCallBack{
        void callBack(@NonNull SoundModel soundName);
    }
    
    interface ClickListener{
        void onSoundSelect(@Nullable SoundModel soundModel);
    }
}