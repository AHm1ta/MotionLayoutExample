// Generated by view binder compiler. Do not edit!
package com.example.uitestapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uitestapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSecondBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView pepper;

  @NonNull
  public final TextView salt;

  @NonNull
  public final ImageView snpIcon;

  @NonNull
  public final MotionLayout snpMotionLayout;

  @NonNull
  public final AppCompatButton startButton;

  @NonNull
  public final AppCompatButton thirdPage;

  @NonNull
  public final ConstraintLayout toolbar;

  private FragmentSecondBinding(@NonNull ConstraintLayout rootView, @NonNull TextView pepper,
      @NonNull TextView salt, @NonNull ImageView snpIcon, @NonNull MotionLayout snpMotionLayout,
      @NonNull AppCompatButton startButton, @NonNull AppCompatButton thirdPage,
      @NonNull ConstraintLayout toolbar) {
    this.rootView = rootView;
    this.pepper = pepper;
    this.salt = salt;
    this.snpIcon = snpIcon;
    this.snpMotionLayout = snpMotionLayout;
    this.startButton = startButton;
    this.thirdPage = thirdPage;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pepper;
      TextView pepper = ViewBindings.findChildViewById(rootView, id);
      if (pepper == null) {
        break missingId;
      }

      id = R.id.salt;
      TextView salt = ViewBindings.findChildViewById(rootView, id);
      if (salt == null) {
        break missingId;
      }

      id = R.id.snp_icon;
      ImageView snpIcon = ViewBindings.findChildViewById(rootView, id);
      if (snpIcon == null) {
        break missingId;
      }

      id = R.id.snpMotionLayout;
      MotionLayout snpMotionLayout = ViewBindings.findChildViewById(rootView, id);
      if (snpMotionLayout == null) {
        break missingId;
      }

      id = R.id.startButton;
      AppCompatButton startButton = ViewBindings.findChildViewById(rootView, id);
      if (startButton == null) {
        break missingId;
      }

      id = R.id.third_page;
      AppCompatButton thirdPage = ViewBindings.findChildViewById(rootView, id);
      if (thirdPage == null) {
        break missingId;
      }

      id = R.id.toolbar;
      ConstraintLayout toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentSecondBinding((ConstraintLayout) rootView, pepper, salt, snpIcon,
          snpMotionLayout, startButton, thirdPage, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
