// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnBookDoctor;

  @NonNull
  public final Button btnBookDoctor2;

  @NonNull
  public final Button btnBookDoctor3;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvFirstName;

  @NonNull
  public final TextView tvLastName;

  private ActivityDoctorListBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnBookDoctor, @NonNull Button btnBookDoctor2, @NonNull Button btnBookDoctor3,
      @NonNull Guideline guideline2, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextView tvAge, @NonNull TextView tvFirstName, @NonNull TextView tvLastName) {
    this.rootView = rootView;
    this.btnBookDoctor = btnBookDoctor;
    this.btnBookDoctor2 = btnBookDoctor2;
    this.btnBookDoctor3 = btnBookDoctor3;
    this.guideline2 = guideline2;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.tvAge = tvAge;
    this.tvFirstName = tvFirstName;
    this.tvLastName = tvLastName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBookDoctor;
      Button btnBookDoctor = rootView.findViewById(id);
      if (btnBookDoctor == null) {
        break missingId;
      }

      id = R.id.btnBookDoctor2;
      Button btnBookDoctor2 = rootView.findViewById(id);
      if (btnBookDoctor2 == null) {
        break missingId;
      }

      id = R.id.btnBookDoctor3;
      Button btnBookDoctor3 = rootView.findViewById(id);
      if (btnBookDoctor3 == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.tvAge;
      TextView tvAge = rootView.findViewById(id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tvFirstName;
      TextView tvFirstName = rootView.findViewById(id);
      if (tvFirstName == null) {
        break missingId;
      }

      id = R.id.tvLastName;
      TextView tvLastName = rootView.findViewById(id);
      if (tvLastName == null) {
        break missingId;
      }

      return new ActivityDoctorListBinding((ConstraintLayout) rootView, btnBookDoctor,
          btnBookDoctor2, btnBookDoctor3, guideline2, textView5, textView6, tvAge, tvFirstName,
          tvLastName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
