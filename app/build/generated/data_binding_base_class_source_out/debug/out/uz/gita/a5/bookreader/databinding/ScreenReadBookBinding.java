// Generated by view binder compiler. Do not edit!
package uz.gita.a5.bookreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.barteksc.pdfviewer.PDFView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.a5.bookreader.R;

public final class ScreenReadBookBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout appBar;

  @NonNull
  public final AppCompatImageView btnBack;

  @NonNull
  public final PDFView pdfView;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final TextView txtBookName;

  @NonNull
  public final TextView txtPages;

  private ScreenReadBookBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout appBar, @NonNull AppCompatImageView btnBack,
      @NonNull PDFView pdfView, @NonNull ProgressBar progressBar2, @NonNull TextView txtBookName,
      @NonNull TextView txtPages) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.btnBack = btnBack;
    this.pdfView = pdfView;
    this.progressBar2 = progressBar2;
    this.txtBookName = txtBookName;
    this.txtPages = txtPages;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenReadBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenReadBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_read_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenReadBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      ConstraintLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.btnBack;
      AppCompatImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.pdfView;
      PDFView pdfView = ViewBindings.findChildViewById(rootView, id);
      if (pdfView == null) {
        break missingId;
      }

      id = R.id.progressBar2;
      ProgressBar progressBar2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar2 == null) {
        break missingId;
      }

      id = R.id.txtBookName;
      TextView txtBookName = ViewBindings.findChildViewById(rootView, id);
      if (txtBookName == null) {
        break missingId;
      }

      id = R.id.txtPages;
      TextView txtPages = ViewBindings.findChildViewById(rootView, id);
      if (txtPages == null) {
        break missingId;
      }

      return new ScreenReadBookBinding((ConstraintLayout) rootView, appBar, btnBack, pdfView,
          progressBar2, txtBookName, txtPages);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
