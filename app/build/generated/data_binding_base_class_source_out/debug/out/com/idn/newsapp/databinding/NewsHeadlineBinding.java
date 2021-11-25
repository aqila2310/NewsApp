// Generated by view binder compiler. Do not edit!
package com.idn.newsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.idn.newsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewsHeadlineBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialCardView cardImage;

  @NonNull
  public final MaterialCardView cvHeadline;

  @NonNull
  public final ImageView imgHeadline;

  @NonNull
  public final TextView tvAuthorHeadline;

  @NonNull
  public final TextView tvDateHeadline;

  @NonNull
  public final TextView tvDescHeadline;

  @NonNull
  public final TextView tvSeperate;

  @NonNull
  public final TextView tvTitleHeadline;

  private NewsHeadlineBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialCardView cardImage, @NonNull MaterialCardView cvHeadline,
      @NonNull ImageView imgHeadline, @NonNull TextView tvAuthorHeadline,
      @NonNull TextView tvDateHeadline, @NonNull TextView tvDescHeadline,
      @NonNull TextView tvSeperate, @NonNull TextView tvTitleHeadline) {
    this.rootView = rootView;
    this.cardImage = cardImage;
    this.cvHeadline = cvHeadline;
    this.imgHeadline = imgHeadline;
    this.tvAuthorHeadline = tvAuthorHeadline;
    this.tvDateHeadline = tvDateHeadline;
    this.tvDescHeadline = tvDescHeadline;
    this.tvSeperate = tvSeperate;
    this.tvTitleHeadline = tvTitleHeadline;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static NewsHeadlineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewsHeadlineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.news_headline, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewsHeadlineBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_image;
      MaterialCardView cardImage = ViewBindings.findChildViewById(rootView, id);
      if (cardImage == null) {
        break missingId;
      }

      MaterialCardView cvHeadline = (MaterialCardView) rootView;

      id = R.id.img_headline;
      ImageView imgHeadline = ViewBindings.findChildViewById(rootView, id);
      if (imgHeadline == null) {
        break missingId;
      }

      id = R.id.tv_author_headline;
      TextView tvAuthorHeadline = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthorHeadline == null) {
        break missingId;
      }

      id = R.id.tv_date_headline;
      TextView tvDateHeadline = ViewBindings.findChildViewById(rootView, id);
      if (tvDateHeadline == null) {
        break missingId;
      }

      id = R.id.tv_desc_headline;
      TextView tvDescHeadline = ViewBindings.findChildViewById(rootView, id);
      if (tvDescHeadline == null) {
        break missingId;
      }

      id = R.id.tv_seperate;
      TextView tvSeperate = ViewBindings.findChildViewById(rootView, id);
      if (tvSeperate == null) {
        break missingId;
      }

      id = R.id.tv_title_headline;
      TextView tvTitleHeadline = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleHeadline == null) {
        break missingId;
      }

      return new NewsHeadlineBinding((MaterialCardView) rootView, cardImage, cvHeadline,
          imgHeadline, tvAuthorHeadline, tvDateHeadline, tvDescHeadline, tvSeperate,
          tvTitleHeadline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}