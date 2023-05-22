package uz.gita.a5.bookreader.presentation.ui.about.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/about/viewmodel/AboutViewModel;", "", "errorLiveData", "Landroidx/lifecycle/LiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "", "getLoadingLiveData", "successLiveData", "getSuccessLiveData", "downloadBookByUrl", "", "context", "Landroid/content/Context;", "bookData", "Luz/gita/a5/bookreader/data/model/BookData;", "app_debug"})
public abstract interface AboutViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getErrorLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getSuccessLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData();
    
    public abstract void downloadBookByUrl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.data.model.BookData bookData);
}