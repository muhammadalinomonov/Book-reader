// Generated by view binder compiler. Do not edit!
package uz.gita.a5.bookreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.bookreader.R;

public final class ItemBookForExploreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView bookImg;

  @NonNull
  public final CardView imgCard;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textAuthor;

  @NonNull
  public final TextView textBookName;

  @NonNull
  public final TextView txtOfProgress;

  @NonNull
  public final TextView txtStarted;

  private ItemBookForExploreBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bookImg,
      @NonNull CardView imgCard, @NonNull ProgressBar progressBar, @NonNull TextView textAuthor,
      @NonNull TextView textBookName, @NonNull TextView txtOfProgress,
      @NonNull TextView txtStarted) {
    this.rootView = rootView;
    this.bookImg = bookImg;
    this.imgCard = imgCard;
    this.progressBar = progressBar;
    this.textAuthor = textAuthor;
    this.textBookName = textBookName;
    this.txtOfProgress = txtOfProgress;
    this.txtStarted = txtStarted;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBookForExploreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBookForExploreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_book_for_explore, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBookForExploreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.book_img;
      ImageView bookImg = ViewBindings.findChildViewById(rootView, id);
      if (bookImg == null) {
        break missingId;
      }

      id = R.id.img_card;
      CardView imgCard = ViewBindings.findChildViewById(rootView, id);
      if (imgCard == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.text_author;
      TextView textAuthor = ViewBindings.findChildViewById(rootView, id);
      if (textAuthor == null) {
        break missingId;
      }

      id = R.id.text_book_name;
      TextView textBookName = ViewBindings.findChildViewById(rootView, id);
      if (textBookName == null) {
        break missingId;
      }

      id = R.id.txt_of_progress;
      TextView txtOfProgress = ViewBindings.findChildViewById(rootView, id);
      if (txtOfProgress == null) {
        break missingId;
      }

      id = R.id.txt_started;
      TextView txtStarted = ViewBindings.findChildViewById(rootView, id);
      if (txtStarted == null) {
        break missingId;
      }

      return new ItemBookForExploreBinding((ConstraintLayout) rootView, bookImg, imgCard,
          progressBar, textAuthor, textBookName, txtOfProgress, txtStarted);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
