// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalculateFitnessBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btncheckrr;

  @NonNull
  public final EditText txtagefit;

  @NonNull
  public final EditText txtgoalfitt;

  @NonNull
  public final EditText txthfitt;

  @NonNull
  public final EditText txtwfitt;

  private ActivityCalculateFitnessBinding(@NonNull LinearLayout rootView,
      @NonNull Button btncheckrr, @NonNull EditText txtagefit, @NonNull EditText txtgoalfitt,
      @NonNull EditText txthfitt, @NonNull EditText txtwfitt) {
    this.rootView = rootView;
    this.btncheckrr = btncheckrr;
    this.txtagefit = txtagefit;
    this.txtgoalfitt = txtgoalfitt;
    this.txthfitt = txthfitt;
    this.txtwfitt = txtwfitt;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalculateFitnessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalculateFitnessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calculate_fitness, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalculateFitnessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btncheckrr;
      Button btncheckrr = rootView.findViewById(id);
      if (btncheckrr == null) {
        break missingId;
      }

      id = R.id.txtagefit;
      EditText txtagefit = rootView.findViewById(id);
      if (txtagefit == null) {
        break missingId;
      }

      id = R.id.txtgoalfitt;
      EditText txtgoalfitt = rootView.findViewById(id);
      if (txtgoalfitt == null) {
        break missingId;
      }

      id = R.id.txthfitt;
      EditText txthfitt = rootView.findViewById(id);
      if (txthfitt == null) {
        break missingId;
      }

      id = R.id.txtwfitt;
      EditText txtwfitt = rootView.findViewById(id);
      if (txtwfitt == null) {
        break missingId;
      }

      return new ActivityCalculateFitnessBinding((LinearLayout) rootView, btncheckrr, txtagefit,
          txtgoalfitt, txthfitt, txtwfitt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
