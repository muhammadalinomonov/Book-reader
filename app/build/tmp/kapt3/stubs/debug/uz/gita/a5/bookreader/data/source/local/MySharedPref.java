package uz.gita.a5.bookreader.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0011H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "", "bookName", "", "getBookName", "()Ljava/lang/String;", "setBookName", "(Ljava/lang/String;)V", "bookUrl", "getBookUrl", "setBookUrl", "isFirst", "", "()Z", "setFirst", "(Z)V", "savedPage", "", "getSavedPage", "()I", "setSavedPage", "(I)V", "totalPage", "getTotalPage", "setTotalPage", "getSavedPageByBookName", "savedPageByBookName", "", "page", "app_debug"})
public abstract interface MySharedPref {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getBookName();
    
    public abstract void setBookName(@org.jetbrains.annotations.Nullable
    java.lang.String p0);
    
    public abstract int getSavedPage();
    
    public abstract void setSavedPage(int p0);
    
    public abstract int getTotalPage();
    
    public abstract void setTotalPage(int p0);
    
    public abstract boolean isFirst();
    
    public abstract void setFirst(boolean p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getBookUrl();
    
    public abstract void setBookUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    public abstract void savedPageByBookName(@org.jetbrains.annotations.NotNull
    java.lang.String bookName, int page);
    
    public abstract int getSavedPageByBookName(@org.jetbrains.annotations.NotNull
    java.lang.String bookName);
}