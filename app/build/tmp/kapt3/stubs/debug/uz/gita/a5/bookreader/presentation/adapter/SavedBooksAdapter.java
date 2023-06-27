package uz.gita.a5.bookreader.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\u00072\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/SavedBooksAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/a5/bookreader/data/model/BookData;", "Luz/gita/a5/bookreader/presentation/adapter/SavedBooksAdapter$SavedViewHolder;", "()V", "clickListener", "Lkotlin/Function1;", "", "deleteClickListener", "sharedPref", "Luz/gita/a5/bookreader/data/source/local/MySharedPref;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "l", "setDeleteClickListener", "SavedViewHolder", "diffUtil", "app_debug"})
public final class SavedBooksAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.a5.bookreader.data.model.BookData, uz.gita.a5.bookreader.presentation.adapter.SavedBooksAdapter.SavedViewHolder> {
    private kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> clickListener;
    private kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> deleteClickListener;
    private final uz.gita.a5.bookreader.data.source.local.MySharedPref sharedPref = null;
    
    public SavedBooksAdapter() {
        super(null);
    }
    
    public final void setClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> l) {
    }
    
    public final void setDeleteClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.a5.bookreader.data.model.BookData, kotlin.Unit> l) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public uz.gita.a5.bookreader.presentation.adapter.SavedBooksAdapter.SavedViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.gita.a5.bookreader.presentation.adapter.SavedBooksAdapter.SavedViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/SavedBooksAdapter$diffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/a5/bookreader/data/model/BookData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class diffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.a5.bookreader.data.model.BookData> {
        @org.jetbrains.annotations.NotNull
        public static final uz.gita.a5.bookreader.presentation.adapter.SavedBooksAdapter.diffUtil INSTANCE = null;
        
        private diffUtil() {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/gita/a5/bookreader/presentation/adapter/SavedBooksAdapter$SavedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/a5/bookreader/databinding/ItemSavedBookBinding;", "(Luz/gita/a5/bookreader/presentation/adapter/SavedBooksAdapter;Luz/gita/a5/bookreader/databinding/ItemSavedBookBinding;)V", "bind", "", "bookData", "Luz/gita/a5/bookreader/data/model/BookData;", "app_debug"})
    public final class SavedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.gita.a5.bookreader.databinding.ItemSavedBookBinding binding = null;
        
        public SavedViewHolder(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.databinding.ItemSavedBookBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull
        uz.gita.a5.bookreader.data.model.BookData bookData) {
        }
    }
}