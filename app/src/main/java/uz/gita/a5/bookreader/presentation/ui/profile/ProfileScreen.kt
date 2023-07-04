package uz.gita.a5.bookreader.presentation.ui.profile

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.drjacky.imagepicker.ImagePicker
import com.github.drjacky.imagepicker.constant.ImageProvider
import uz.gita.a5.bookreader.MainActivity
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.databinding.ScreenProfileBinding
import uz.gita.a5.bookreader.presentation.dialog.ChangeNameDialog
import uz.gita.a5.bookreader.presentation.ui.profile.viewmodel.ProfileViewModel
import uz.gita.a5.bookreader.presentation.ui.profile.viewmodel.ProfileViewModelImpl
import uz.gita.a5.bookreader.utils.setLocalImage

class ProfileScreen : Fragment(R.layout.screen_profile) {
    private val binding by viewBinding(ScreenProfileBinding::bind)

    private val viewModel: ProfileViewModel by viewModels<ProfileViewModelImpl>()
    private var mProfileUri: Uri? = null


    private val profileLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == Activity.RESULT_OK) {
                val uri = it.data?.data!!
                viewModel.setImage(uri.toString())
                mProfileUri = uri
                binding.imgUser.setLocalImage(uri, true)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*viewModel.changeNameLiveData.observe(this, changeNameObserver)
        viewModel.changeImageLiveData.observe(this, changeImageObserver)
        viewModel.aboutUsLiveData.observe(this, shareAppObserver)
        viewModel.contactLiveData.observe(this, contactObserver)
        viewModel.supportLiveData.observe(this, supportObserver)*/
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {

            tvChangeUserName.setOnClickListener {

                val dialog = ChangeNameDialog(requireContext(), viewModel.nameLiveData.value!!)
                dialog.show()
                dialog.setChangeListener {
                    viewModel.setName(it)
                }
//                viewModel.changeName()
            }
            tvChangeImageIcon.setOnClickListener {
                ImagePicker.with(requireActivity())
                    .crop()
                    .cropOval()
                    .maxResultSize(512, 512, true)
                    .provider(ImageProvider.BOTH)
                    .createIntentFromDialog {
                        profileLauncher.launch(it)
                    }
//                viewModel.changeImage()
            }
            tvAboutUs.setOnClickListener {

                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_SUBJECT, "E-book")
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "link: https://play.google.com/store/apps/details?id=uz.gita.a5.bookreader"
                )
                startActivity(Intent.createChooser(intent, "E-Book"))
//                goToPlayMarket(activity as MainActivity)
//                viewModel.aboutClicked()
            }
            tvHelp.setOnClickListener {

                val intent =
                    Intent(
                        Intent.ACTION_SENDTO,
                        Uri.fromParts("mailto", "muhammadalinomonov837@gmail.com", null)
                    )
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
                intent.putExtra(Intent.EXTRA_TEXT, "")
                startActivity(Intent.createChooser(intent, "Choose an Email client :"))
//                viewModel.helpClicked()
            }
            tvSupportUs.setOnClickListener {
                goToPlayMarket(activity as MainActivity)
//                viewModel.supportClicked()
            }

        }
        viewModel.nameLiveData.observe(viewLifecycleOwner, nameObserver)
        viewModel.imageLiveData.observe(viewLifecycleOwner,imageObserver)



    }


    private val changeNameObserver = Observer<Unit> {

    }

    private val nameObserver = Observer<String> {
        binding.tvUserName.text = it

    }

    private val imageObserver = Observer<String> {
        if (it.isEmpty()) {
            binding.imgUser.setImageResource(R.drawable.user)
        } else {
            binding.imgUser.setLocalImage(Uri.parse(it), true)
        }
    }

    private val changeImageObserver = Observer<Unit> {


    }

    private val contactObserver = Observer<Unit> {

    }

    private val shareAppObserver = Observer<Unit> {


    }


    private val supportObserver = Observer<Unit> {

    }

    private fun goToPlayMarket(activity: MainActivity) {
        try {
            activity.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=uz.gita.a5.bookreader")
                )
            )
        } catch (e: ActivityNotFoundException) {
            activity.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=uz.gita.a5.bookreader")
                )
            )
        }
    }
}
