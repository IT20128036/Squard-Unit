// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrgExerShowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton floatingActionButton;

  @NonNull
  public final RecyclerView recycleview;

  private ActivityOrgExerShowBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton floatingActionButton, @NonNull RecyclerView recycleview) {
    this.rootView = rootView;
    this.floatingActionButton = floatingActionButton;
    this.recycleview = recycleview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrgExerShowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrgExerShowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_org_exer_show, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrgExerShowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.floatingActionButton;
      FloatingActionButton floatingActionButton = rootView.findViewById(id);
      if (floatingActionButton == null) {
        break missingId;
      }

      id = R.id.recycleview;
      RecyclerView recycleview = rootView.findViewById(id);
      if (recycleview == null) {
        break missingId;
      }

      return new ActivityOrgExerShowBinding((ConstraintLayout) rootView, floatingActionButton,
          recycleview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}