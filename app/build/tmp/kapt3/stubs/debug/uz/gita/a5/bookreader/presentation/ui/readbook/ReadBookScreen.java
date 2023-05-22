package uz.gita.a5.bookreader.presentation.ui.readbook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0016J\u001a\u0010&\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00152\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\u001a\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Luz/gita/a5/bookreader/presentation/ui/readbook/ReadBookScreen;", "Landroidx/fragment/app/Fragment;", "Lcom/github/barteksc/pdfviewer/listener/OnPageChangeListener;", "Lcom/github/barteksc/pdfviewer/listener/OnPageErrorListener;", "()V", "args", "Luz/gita/a5/bookreader/presentation/ui/readbook/ReadBookScreenArgs;", "getArgs", "()Luz/gita/a5/bookreader/presentation/ui/readbook/ReadBookScreenArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Luz/gita/a5/bookreader/databinding/ScreenReadBookBinding;", "getBinding", "()Luz/gita/a5/bookreader/databinding/ScreenReadBookBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "bookName", "", "imageUrl", "pageNumber", "", "sharedPref", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "totalPage", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onPageChanged", "page", "pageCount", "onPageError", "t", "", "onPause", "onViewCreated", "view", "app_debug"})
public final class ReadBookScreen extends androidx.fragment.app.Fragment implements com.github.barteksc.pdfviewer.listener.OnPageChangeListener, com.github.barteksc.pdfviewer.listener.OnPageErrorListener {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private java.lang.String bookName = "";
    private int pageNumber = 0;
    private int totalPage = 0;
    private java.lang.String imageUrl;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharedPref = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    
    public ReadBookScreen() {
        super();
    }
    
    private final uz.gita.a5.bookreader.presentation.ui.readbook.ReadBookScreenArgs getArgs() {
        return null;
    }
    
    private final uz.gita.a5.bookreader.databinding.ScreenReadBookBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onPageChanged(int page, int pageCount) {
    }
    
    @java.lang.Override
    public void onPageError(int page, @org.jetbrains.annotations.Nullable
    java.lang.Throwable t) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
}