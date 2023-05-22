// Generated by view binder compiler. Do not edit!
package uz.gita.a5.bookreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.bookreader.R;

public final class ScreenHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dddd;

  @NonNull
  public final ConstraintLayout homeSecondLayout;

  @NonNull
  public final ImageView lastBookImage;

  @NonNull
  public final LinearLayout linear2;

  @NonNull
  public final ProgressBar progressBar3;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final TextView textBookName;

  @NonNull
  public final TextView txt;

  private ScreenHomeBinding(@NonNull ConstraintLayout rootView, @NonNull TextView dddd,
      @NonNull ConstraintLayout homeSecondLayout, @NonNull ImageView lastBookImage,
      @NonNull LinearLayout linear2, @NonNull ProgressBar progressBar3,
      @NonNull RecyclerView recycler, @NonNull TextView textBookName, @NonNull TextView txt) {
    this.rootView = rootView;
    this.dddd = dddd;
    this.homeSecondLayout = homeSecondLayout;
    this.lastBookImage = lastBookImage;
    this.linear2 = linear2;
    this.progressBar3 = progressBar3;
    this.recycler = recycler;
    this.textBookName = textBookName;
    this.txt = txt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dddd;
      TextView dddd = ViewBindings.findChildViewById(rootView, id);
      if (dddd == null) {
        break missingId;
      }

      id = R.id.home_second_layout;
      ConstraintLayout homeSecondLayout = ViewBindings.findChildViewById(rootView, id);
      if (homeSecondLayout == null) {
        break missingId;
      }

      id = R.id.lastBookImage;
      ImageView lastBookImage = ViewBindings.findChildViewById(rootView, id);
      if (lastBookImage == null) {
        break missingId;
      }

      id = R.id.linear2;
      LinearLayout linear2 = ViewBindings.findChildViewById(rootView, id);
      if (linear2 == null) {
        break missingId;
      }

      id = R.id.progressBar3;
      ProgressBar progressBar3 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar3 == null) {
        break missingId;
      }

      id = R.id.recycler;
      RecyclerView recycler = ViewBindings.findChildViewById(rootView, id);
      if (recycler == null) {
        break missingId;
      }

      id = R.id.text_book_name;
      TextView textBookName = ViewBindings.findChildViewById(rootView, id);
      if (textBookName == null) {
        break missingId;
      }

      id = R.id.txt;
      TextView txt = ViewBindings.findChildViewById(rootView, id);
      if (txt == null) {
        break missingId;
      }

      return new ScreenHomeBinding((ConstraintLayout) rootView, dddd, homeSecondLayout,
          lastBookImage, linear2, progressBar3, recycler, textBookName, txt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
