// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultFitnessBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Barrier barrier4;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView txtbfp;

  @NonNull
  public final TextView txtbimm;

  @NonNull
  public final TextView txtbrmm;

  @NonNull
  public final TextView txtidealww;

  @NonNull
  public final TextView txtmaxhr;

  @NonNull
  public final TextView txtstatus;

  @NonNull
  public final TextView txttargethr;

  private ActivityResultFitnessBinding(@NonNull ConstraintLayout rootView,
      @NonNull Barrier barrier4, @NonNull TextView textView3, @NonNull TextView textView4,
      @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull TextView txtbfp, @NonNull TextView txtbimm,
      @NonNull TextView txtbrmm, @NonNull TextView txtidealww, @NonNull TextView txtmaxhr,
      @NonNull TextView txtstatus, @NonNull TextView txttargethr) {
    this.rootView = rootView;
    this.barrier4 = barrier4;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.txtbfp = txtbfp;
    this.txtbimm = txtbimm;
    this.txtbrmm = txtbrmm;
    this.txtidealww = txtidealww;
    this.txtmaxhr = txtmaxhr;
    this.txtstatus = txtstatus;
    this.txttargethr = txttargethr;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultFitnessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultFitnessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result_fitness, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultFitnessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier4;
      Barrier barrier4 = rootView.findViewById(id);
      if (barrier4 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
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

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.txtbfp;
      TextView txtbfp = rootView.findViewById(id);
      if (txtbfp == null) {
        break missingId;
      }

      id = R.id.txtbimm;
      TextView txtbimm = rootView.findViewById(id);
      if (txtbimm == null) {
        break missingId;
      }

      id = R.id.txtbrmm;
      TextView txtbrmm = rootView.findViewById(id);
      if (txtbrmm == null) {
        break missingId;
      }

      id = R.id.txtidealww;
      TextView txtidealww = rootView.findViewById(id);
      if (txtidealww == null) {
        break missingId;
      }

      id = R.id.txtmaxhr;
      TextView txtmaxhr = rootView.findViewById(id);
      if (txtmaxhr == null) {
        break missingId;
      }

      id = R.id.txtstatus;
      TextView txtstatus = rootView.findViewById(id);
      if (txtstatus == null) {
        break missingId;
      }

      id = R.id.txttargethr;
      TextView txttargethr = rootView.findViewById(id);
      if (txttargethr == null) {
        break missingId;
      }

      return new ActivityResultFitnessBinding((ConstraintLayout) rootView, barrier4, textView3,
          textView4, textView5, textView6, textView7, textView8, txtbfp, txtbimm, txtbrmm,
          txtidealww, txtmaxhr, txtstatus, txttargethr);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
