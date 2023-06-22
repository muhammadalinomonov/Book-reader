package uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/explore/viewmodel/impl/ExploreViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/a5/bookreader/presentation/ui/explore/viewmodel/ExploreViewModel;", "()V", "booksLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Luz/gita/a5/bookreader/data/model/BookData;", "getBooksLiveData", "()Landroidx/lifecycle/MutableLiveData;", "errorLiveData", "", "getErrorLiveData", "loadingLiveData", "", "getLoadingLiveData", "placeHolderLiveData", "getPlaceHolderLiveData", "repository", "Luz/gita/a5/bookreader/domain/repository/AppRepository;", "getAll", "", "getBySearch", "name", "app_debug"})
public final class ExploreViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.ExploreViewModel {
    private final uz.gita.a5.bookreader.domain.repository.AppRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.a5.bookreader.data.model.BookData>> booksLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> placeHolderLiveData = null;
    
    public ExploreViewModelImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.a5.bookreader.data.model.BookData>> getBooksLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPlaceHolderLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void getAll() {
    }
    
    @java.lang.Override
    public void getBySearch(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
}