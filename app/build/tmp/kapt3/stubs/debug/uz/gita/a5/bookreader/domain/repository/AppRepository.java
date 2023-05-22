package uz.gita.a5.bookreader.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00f8\u0001\u0000J\u001d\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u00040\u0003H&\u00f8\u0001\u0000J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0004H\u00a6@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000J%\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0012"}, d2 = {"Luz/gita/a5/bookreader/domain/repository/AppRepository;", "", "downloadBookByUrl", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "context", "Landroid/content/Context;", "bookData", "Luz/gita/a5/bookreader/data/model/BookData;", "getAllBook", "", "getBooksByCategory", "getBooksByCategory-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedBooks", "getSearchBook", "name", "app_debug"})
public abstract interface AppRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.a5.bookreader.data.model.BookData>>> getAllBook();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> downloadBookByUrl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.data.model.BookData bookData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.a5.bookreader.data.model.BookData>>> getSavedBooks(@org.jetbrains.annotations.NotNull
    android.content.Context context);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.a5.bookreader.data.model.BookData>>> getSearchBook(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}