package uz.gita.a5.bookreader.data.source.local.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c\u00a8\u0006%"}, d2 = {"Luz/gita/a5/bookreader/data/source/local/impl/MySharedPrefImpl;", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "()V", "BOOK_NAME", "", "SAVED_PAGE", "TOTAL_PAGE", "value", "bookName", "getBookName", "()Ljava/lang/String;", "setBookName", "(Ljava/lang/String;)V", "bookUrl", "getBookUrl", "setBookUrl", "", "isFirst", "()Z", "setFirst", "(Z)V", "pref", "Landroid/content/SharedPreferences;", "", "savedPage", "getSavedPage", "()I", "setSavedPage", "(I)V", "totalPage", "getTotalPage", "setTotalPage", "getSavedPageByBookName", "savedPageByBookName", "", "page", "Companion", "app_debug"})
public final class MySharedPrefImpl implements uz.gita.a5.bookreader.data.source.local.MySharedPref {
    private final android.content.SharedPreferences pref = null;
    private final java.lang.String BOOK_NAME = "BOOK_NAME";
    private final java.lang.String SAVED_PAGE = "SAVED_PAGE";
    private final java.lang.String TOTAL_PAGE = "TOTAL_PAGE";
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl.Companion Companion = null;
    private static uz.gita.a5.bookreader.data.source.local.MySharedPref instance;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static android.content.Context context;
    
    public MySharedPrefImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getBookName() {
        return null;
    }
    
    @java.lang.Override
    public void setBookName(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @java.lang.Override
    public int getSavedPage() {
        return 0;
    }
    
    @java.lang.Override
    public void setSavedPage(int value) {
    }
    
    @java.lang.Override
    public int getTotalPage() {
        return 0;
    }
    
    @java.lang.Override
    public void setTotalPage(int value) {
    }
    
    @java.lang.Override
    public boolean isFirst() {
        return false;
    }
    
    @java.lang.Override
    public void setFirst(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getBookUrl() {
        return null;
    }
    
    @java.lang.Override
    public void setBookUrl(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @java.lang.Override
    public void savedPageByBookName(@org.jetbrains.annotations.NotNull
    java.lang.String bookName, int page) {
    }
    
    @java.lang.Override
    public int getSavedPageByBookName(@org.jetbrains.annotations.NotNull
    java.lang.String bookName) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Luz/gita/a5/bookreader/data/source/local/impl/MySharedPrefImpl$Companion;", "", "()V", "context", "Landroid/content/Context;", "instance", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "getInstance", "init", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.a5.bookreader.data.source.local.MySharedPref getInstance() {
            return null;
        }
        
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}