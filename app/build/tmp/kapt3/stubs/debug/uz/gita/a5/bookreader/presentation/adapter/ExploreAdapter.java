package uz.gita.a5.bookreader.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\n\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/a5/bookreader/data/model/BookData;", "Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter$ViewHolder;", "()V", "clickBookListener", "Lkotlin/Function1;", "", "sharedPref", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickBookListener", "block", "ViewHolder", "diffdUtil", "app_debug"})
public final class ExploreAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.a5.bookreader.data.model.BookData, uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter.ViewHolder> {
    private kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> clickBookListener;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharedPref = null;
    
    public ExploreAdapter() {
        super(null);
    }
    
    public final void setClickBookListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter$diffdUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/a5/bookreader/data/model/BookData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class diffdUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.a5.bookreader.data.model.BookData> {
        @org.jetbrains.annotations.NotNull
        public static final uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter.diffdUtil INSTANCE = null;
        
        private diffdUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/a5/bookreader/databinding/ItemBookForExploreBinding;", "(Luz/gita/a5/bookreader/presentation/adapter/ExploreAdapter;Luz/gita/a5/bookreader/databinding/ItemBookForExploreBinding;)V", "bind", "", "book", "Luz/gita/a5/bookreader/data/model/BookData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.gita.a5.bookreader.databinding.ItemBookForExploreBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.databinding.ItemBookForExploreBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData book) {
        }
    }
}