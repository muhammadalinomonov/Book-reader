package uz.gita.a5.bookreader.presentation.ui.explore.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\r"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/explore/viewmodel/ExploreViewModel;", "", "booksLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/a5/bookreader/data/model/BookData;", "getBooksLiveData", "()Landroidx/lifecycle/LiveData;", "errorLiveData", "", "getErrorLiveData", "getAll", "", "app_debug"})
public abstract interface ExploreViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getErrorLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.a5.bookreader.data.model.BookData>> getBooksLiveData();
    
    public abstract void getAll();
}