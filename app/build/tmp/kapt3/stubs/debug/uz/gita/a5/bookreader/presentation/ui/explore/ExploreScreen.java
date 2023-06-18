package uz.gita.a5.bookreader.presentation.ui.explore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/explore/ExploreScreen;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter;", "getAdapter", "()Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Luz/gita/a5/bookreader/databinding/ScreenExploreBinding;", "getBinding", "()Luz/gita/a5/bookreader/databinding/ScreenExploreBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "booksObserver", "Landroidx/lifecycle/Observer;", "", "Luz/gita/a5/bookreader/data/model/BookData;", "errorData", "", "loadingProgressBarObserver", "", "viewModel", "Luz/gita/a5/bookreader/presentation/ui/explore/viewmodel/impl/ExploreViewModelImpl;", "getViewModel", "()Luz/gita/a5/bookreader/presentation/ui/explore/viewmodel/impl/ExploreViewModelImpl;", "viewModel$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ExploreScreen extends androidx.fragment.app.Fragment {
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.a5.bookreader.data.model.BookData>> booksObserver = null;
    private final androidx.lifecycle.Observer<java.lang.String> errorData = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> loadingProgressBarObserver = null;
    
    public ExploreScreen() {
        super();
    }
    
    private final uz.gita.a5.bookreader.databinding.ScreenExploreBinding getBinding() {
        return null;
    }
    
    private final uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.impl.ExploreViewModelImpl getViewModel() {
        return null;
    }
    
    private final uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}