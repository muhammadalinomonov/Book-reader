package uz.gita.a5.bookreader.presentation.ui.home.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/home/viewmodel/HomeViewModel;", "", "categoriesLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/a5/bookreader/data/model/CategoryData;", "getCategoriesLiveData", "()Landroidx/lifecycle/LiveData;", "errorLiveData", "", "getErrorLiveData", "loadingLiveData", "", "getLoadingLiveData", "maxProgressLiveData", "", "getMaxProgressLiveData", "progressLiveData", "getProgressLiveData", "getBooksByCategoryData", "", "app_debug"})
public abstract interface HomeViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.a5.bookreader.data.model.CategoryData>> getCategoriesLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getErrorLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getMaxProgressLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getProgressLiveData();
    
    public abstract void getBooksByCategoryData();
}