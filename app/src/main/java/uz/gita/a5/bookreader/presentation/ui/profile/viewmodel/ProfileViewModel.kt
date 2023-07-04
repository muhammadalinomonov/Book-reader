package uz.gita.a5.bookreader.presentation.ui.profile.viewmodel

import androidx.lifecycle.LiveData

interface ProfileViewModel {
    val nameLiveData: LiveData<String>

    val imageLiveData: LiveData<String>

    /*val changeNameLiveData: LiveData<Unit>

    val changeImageLiveData: LiveData<Unit>

    val aboutUsLiveData: LiveData<Unit>

    val contactLiveData: LiveData<Unit>

    val supportLiveData: LiveData<Unit>*/

//    fun changeName()

    /*fun changeImage()

    fun aboutClicked()

    fun helpClicked()

    fun supportClicked()*/

    fun setName(name:String)

    fun setImage(str:String)
}