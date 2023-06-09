package uz.gita.a5.bookreader.presentation.ui.home.viewmodel.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000b\u00a8\u0006!"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/impl/HomeViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/HomeViewModel;", "useCase", "Luz/gita/a5/bookreader/domain/usecase/explore/HomeUseCase;", "(Luz/gita/a5/bookreader/domain/usecase/explore/HomeUseCase;)V", "categoriesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Luz/gita/a5/bookreader/data/model/CategoryData;", "getCategoriesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "errorLiveData", "", "getErrorLiveData", "loadingLiveData", "", "getLoadingLiveData", "maxProgressLiveData", "", "kotlin.jvm.PlatformType", "getMaxProgressLiveData", "progressLiveData", "getProgressLiveData", "sharedPref", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "userAvatarLiveData", "getUserAvatarLiveData", "userNameLiveData", "getUserNameLiveData", "getBooksByCategoryData", "", "Factory", "app_debug"})
public final class HomeViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.a5.bookreader.presentation.ui.home.viewmodel.HomeViewModel {
    private final uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase useCase = null;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharedPref = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.a5.bookreader.data.model.CategoryData>> categoriesLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> maxProgressLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> progressLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userAvatarLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userNameLiveData = null;
    
    public HomeViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.a5.bookreader.data.model.CategoryData>> getCategoriesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getMaxProgressLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getProgressLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.String> getUserAvatarLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.String> getUserNameLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void getBooksByCategoryData() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/impl/HomeViewModelImpl$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "useCase", "Luz/gita/a5/bookreader/domain/usecase/explore/HomeUseCase;", "(Luz/gita/a5/bookreader/domain/usecase/explore/HomeUseCase;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase useCase = null;
        
        public Factory(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase useCase) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}