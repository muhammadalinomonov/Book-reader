// Generated by view binder compiler. Do not edit!
package uz.gita.a5.bookreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.bookreader.R;

public final class ScreenSavedBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout appBar;

  @NonNull
  public final AppCompatImageView imgNoBooks;

  @NonNull
  public final ContentLoadingProgressBar progress;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final AppCompatTextView txtNoBookTitle;

  private ScreenSavedBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout appBar,
      @NonNull AppCompatImageView imgNoBooks, @NonNull ContentLoadingProgressBar progress,
      @NonNull RecyclerView recycler, @NonNull AppCompatTextView txtNoBookTitle) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.imgNoBooks = imgNoBooks;
    this.progress = progress;
    this.recycler = recycler;
    this.txtNoBookTitle = txtNoBookTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenSavedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenSavedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_saved, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenSavedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      ConstraintLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.imgNoBooks;
      AppCompatImageView imgNoBooks = ViewBindings.findChildViewById(rootView, id);
      if (imgNoBooks == null) {
        break missingId;
      }

      id = R.id.progress;
      ContentLoadingProgressBar progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.recycler;
      RecyclerView recycler = ViewBindings.findChildViewById(rootView, id);
      if (recycler == null) {
        break missingId;
      }

      id = R.id.txtNoBookTitle;
      AppCompatTextView txtNoBookTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtNoBookTitle == null) {
        break missingId;
      }

      return new ScreenSavedBinding((ConstraintLayout) rootView, appBar, imgNoBooks, progress,
          recycler, txtNoBookTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
