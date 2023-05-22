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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.bookreader.R;

public final class ItemOneBookBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView imgIcon;

  @NonNull
  public final AppCompatTextView txtTitle;

  private ItemOneBookBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView imgIcon, @NonNull AppCompatTextView txtTitle) {
    this.rootView = rootView;
    this.imgIcon = imgIcon;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemOneBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemOneBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_one_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemOneBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgIcon;
      AppCompatImageView imgIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgIcon == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      AppCompatTextView txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      return new ItemOneBookBinding((ConstraintLayout) rootView, imgIcon, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
