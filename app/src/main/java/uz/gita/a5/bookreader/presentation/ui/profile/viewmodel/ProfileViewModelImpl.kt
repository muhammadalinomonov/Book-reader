package uz.gita.a5.bookreader.presentation.ui.profile.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import javax.inject.Inject
import kotlin.String as String

class ProfileViewModelImpl :ViewModel(), ProfileViewModel {

    private var sharedPreferences = MySharedPrefImpl.getInstance()

    override val nameLiveData :MutableLiveData<String> = MutableLiveData<String>(sharedPreferences.name)
    override val imageLiveData :MutableLiveData<String> = MutableLiveData<String>(sharedPreferences.imageUri)
    /*override val changeNameLiveData = MutableLiveData<Unit>()
    override val changeImageLiveData = MutableLiveData<Unit>()
    override val aboutUsLiveData = MutableLiveData<Unit>()
    override val contactLiveData = MutableLiveData<Unit>()
    override val supportLiveData = MutableLiveData<Unit>()
*/
    /*override fun changeName() {
        changeNameLiveData.postValue(Unit)
    }*/

   /* override fun changeImage() {
        changeImageLiveData.postValue(Unit)
    }

    override fun aboutClicked() {
        aboutUsLiveData.postValue(Unit)
    }

    override fun helpClicked() {
        contactLiveData.postValue(Unit)
    }

    override fun supportClicked() {
        supportLiveData.postValue(Unit)
    }*/

    override fun setName(name: String) {
        sharedPreferences.name = name
        nameLiveData.postValue(name)
    }

    override fun setImage(str: String) {
        sharedPreferences.imageUri = str
    }
}