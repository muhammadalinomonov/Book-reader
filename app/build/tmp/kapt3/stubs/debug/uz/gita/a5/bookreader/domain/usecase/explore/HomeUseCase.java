package uz.gita.a5.bookreader.domain.usecase.explore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Luz/gita/a5/bookreader/domain/usecase/explore/HomeUseCase;", "", "getBooksByCategoryData", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Luz/gita/a5/bookreader/data/model/CategoryData;", "app_debug"})
public abstract interface HomeUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.a5.bookreader.data.model.CategoryData>>> getBooksByCategoryData();
}