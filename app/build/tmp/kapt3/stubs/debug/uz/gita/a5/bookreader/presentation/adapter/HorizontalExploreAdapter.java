package uz.gita.a5.bookreader.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00072\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u001a\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u0014\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\tR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/HorizontalExploreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Luz/gita/a5/bookreader/presentation/adapter/HorizontalExploreAdapter$ItemViewHolder;", "()V", "clickListener", "Lkotlin/Function1;", "Luz/gita/a5/bookreader/data/model/BookData;", "", "list", "", "sharedPref", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "sharesPref", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "l", "setData", "ItemViewHolder", "app_debug"})
public final class HorizontalExploreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<uz.gita.a5.bookreader.presentation.adapter.HorizontalExploreAdapter.ItemViewHolder> {
    private java.util.List<uz.gita.a5.bookreader.data.model.BookData> list;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharesPref = null;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharedPref = null;
    private kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> clickListener;
    
    public HorizontalExploreAdapter() {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<uz.gita.a5.bookreader.data.model.BookData> l) {
    }
    
    public final void setClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> l) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public uz.gita.a5.bookreader.presentation.adapter.HorizontalExploreAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.presentation.adapter.HorizontalExploreAdapter.ItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/HorizontalExploreAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/a5/bookreader/databinding/ItemBookBinding;", "(Luz/gita/a5/bookreader/presentation/adapter/HorizontalExploreAdapter;Luz/gita/a5/bookreader/databinding/ItemBookBinding;)V", "bind", "", "book", "Luz/gita/a5/bookreader/data/model/BookData;", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.gita.a5.bookreader.databinding.ItemBookBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.databinding.ItemBookBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData book) {
        }
    }
}