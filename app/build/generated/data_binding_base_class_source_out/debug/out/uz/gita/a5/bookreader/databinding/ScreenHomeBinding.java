// Generated by view binder compiler. Do not edit!
package uz.gita.a5.bookreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.bookreader.R;

public final class ScreenHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout dddd;

  @NonNull
  public final TextView hello;

  @NonNull
  public final ConstraintLayout homeSecondLayout;

  @NonNull
  public final ContentLoadingProgressBar progress;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final EditText se;

  @NonNull
  public final View search;

  @NonNull
  public final ShapeableImageView userAvatar;

  private ScreenHomeBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout dddd,
      @NonNull TextView hello, @NonNull ConstraintLayout homeSecondLayout,
      @NonNull ContentLoadingProgressBar progress, @NonNull RecyclerView recycler,
      @NonNull EditText se, @NonNull View search, @NonNull ShapeableImageView userAvatar) {
    this.rootView = rootView;
    this.dddd = dddd;
    this.hello = hello;
    this.homeSecondLayout = homeSecondLayout;
    this.progress = progress;
    this.recycler = recycler;
    this.se = se;
    this.search = search;
    this.userAvatar = userAvatar;
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
      LinearLayout dddd = ViewBindings.findChildViewById(rootView, id);
      if (dddd == null) {
        break missingId;
      }

      id = R.id.hello;
      TextView hello = ViewBindings.findChildViewById(rootView, id);
      if (hello == null) {
        break missingId;
      }

      id = R.id.home_second_layout;
      ConstraintLayout homeSecondLayout = ViewBindings.findChildViewById(rootView, id);
      if (homeSecondLayout == null) {
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

      id = R.id.se;
      EditText se = ViewBindings.findChildViewById(rootView, id);
      if (se == null) {
        break missingId;
      }

      id = R.id.search;
      View search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.user_avatar;
      ShapeableImageView userAvatar = ViewBindings.findChildViewById(rootView, id);
      if (userAvatar == null) {
        break missingId;
      }

      return new ScreenHomeBinding((ConstraintLayout) rootView, dddd, hello, homeSecondLayout,
          progress, recycler, se, search, userAvatar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
