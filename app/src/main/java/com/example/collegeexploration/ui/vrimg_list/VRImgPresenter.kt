package com.example.collegeexploration.ui.vrimg_list

import com.example.collegeexploration.data.DataManager
import com.example.collegeexploration.data.MediaItem
import com.example.collegeexploration.ui.base.BasePresenter
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class VRImgPresenter<V: VRImgMvpView>(mDataManager: DataManager) : BasePresenter<V>(mDataManager),
    VRImgMvpPresenter<V> {

    override fun setAdapterToRV() {
        val imgList: List<MediaItem> = mDataManager.getVRImgList()
        getMvpView().settingUpRecyclerView(imgList)
    }
}