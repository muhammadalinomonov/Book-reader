package uz.gita.a5.bookreader.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000J\u001d\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\t0\bH\u0016\u00f8\u0001\u0000J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\tH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00f8\u0001\u0000J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\t2\u0006\u0010\u0016\u001a\u00020\nH\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001a"}, d2 = {"Luz/gita/a5/bookreader/domain/repository/impl/AppRepositoryImpl;", "Luz/gita/a5/bookreader/domain/repository/AppRepository;", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "downloadBookByUrl", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "context", "Landroid/content/Context;", "bookData", "Luz/gita/a5/bookreader/data/model/BookData;", "getAllBook", "", "getBooksByCategory", "getBooksByCategory-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedBooks", "getSearchBook", "name", "getSearchBook-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class AppRepositoryImpl implements uz.gita.a5.bookreader.domain.repository.AppRepository {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private final com.google.firebase.storage.FirebaseStorage storage = null;
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.a5.bookreader.domain.repository.impl.AppRepositoryImpl.Companion Companion = null;
    private static uz.gita.a5.bookreader.domain.repository.AppRepository instance;
    
    private AppRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.a5.bookreader.data.model.BookData>>> getAllBook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> downloadBookByUrl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.data.model.BookData bookData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.a5.bookreader.data.model.BookData>>> getSavedBooks(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Luz/gita/a5/bookreader/domain/repository/impl/AppRepositoryImpl$Companion;", "", "()V", "instance", "Luz/gita/a5/bookreader/domain/repository/AppRepository;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.a5.bookreader.domain.repository.AppRepository getInstance() {
            return null;
        }
    }
}