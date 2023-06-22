package uz.gita.a5.bookreader.presentation.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0017R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b!\u0010\"\u00a8\u0006+"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/home/HomeScreen;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Luz/gita/a5/bookreader/presentation/adapter/HomeAdapter;", "getAdapter", "()Luz/gita/a5/bookreader/presentation/adapter/HomeAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Luz/gita/a5/bookreader/databinding/ScreenHomeBinding;", "getBinding", "()Luz/gita/a5/bookreader/databinding/ScreenHomeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "categoriesData", "Landroidx/lifecycle/Observer;", "", "Luz/gita/a5/bookreader/data/model/CategoryData;", "errorData", "", "factory", "Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/impl/HomeViewModelImpl$Factory;", "loadingProgressBarObserver", "", "repository", "Luz/gita/a5/bookreader/domain/repository/AppRepository;", "sharedPref", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "useCase", "Luz/gita/a5/bookreader/domain/usecase/explore/HomeUseCase;", "viewModel", "Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/impl/HomeViewModelImpl;", "getViewModel", "()Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/impl/HomeViewModelImpl;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
public final class HomeScreen extends androidx.fragment.app.Fragment {
    private final uz.gita.a5.bookreader.domain.repository.AppRepository repository = null;
    private final uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase useCase = null;
    private final uz.gita.a5.bookreader.presentation.ui.home.viewmodel.impl.HomeViewModelImpl.Factory factory = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharedPref = null;
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.a5.bookreader.data.model.CategoryData>> categoriesData = null;
    private final androidx.lifecycle.Observer<java.lang.String> errorData = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> loadingProgressBarObserver = null;
    
    public HomeScreen() {
        super();
    }
    
    private final uz.gita.a5.bookreader.databinding.ScreenHomeBinding getBinding() {
        return null;
    }
    
    private final uz.gita.a5.bookreader.presentation.ui.home.viewmodel.impl.HomeViewModelImpl getViewModel() {
        return null;
    }
    
    private final uz.gita.a5.bookreader.presentation.adapter.HomeAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "FragmentLiveDataObserve"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}