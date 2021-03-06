// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGetLabReportBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnaddap;

  @NonNull
  public final RadioButton radb1;

  @NonNull
  public final RadioButton radb2;

  @NonNull
  public final RadioGroup radid;

  @NonNull
  public final EditText txtagel;

  @NonNull
  public final EditText txtblood;

  @NonNull
  public final EditText txtcon;

  @NonNull
  public final EditText txtdatell;

  @NonNull
  public final EditText txtname;

  @NonNull
  public final EditText txtnic;

  @NonNull
  public final EditText txtsuf;

  @NonNull
  public final EditText txttimel;

  private ActivityGetLabReportBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnaddap,
      @NonNull RadioButton radb1, @NonNull RadioButton radb2, @NonNull RadioGroup radid,
      @NonNull EditText txtagel, @NonNull EditText txtblood, @NonNull EditText txtcon,
      @NonNull EditText txtdatell, @NonNull EditText txtname, @NonNull EditText txtnic,
      @NonNull EditText txtsuf, @NonNull EditText txttimel) {
    this.rootView = rootView;
    this.btnaddap = btnaddap;
    this.radb1 = radb1;
    this.radb2 = radb2;
    this.radid = radid;
    this.txtagel = txtagel;
    this.txtblood = txtblood;
    this.txtcon = txtcon;
    this.txtdatell = txtdatell;
    this.txtname = txtname;
    this.txtnic = txtnic;
    this.txtsuf = txtsuf;
    this.txttimel = txttimel;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGetLabReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGetLabReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_get_lab_report, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGetLabReportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnaddap;
      Button btnaddap = rootView.findViewById(id);
      if (btnaddap == null) {
        break missingId;
      }

      id = R.id.radb1;
      RadioButton radb1 = rootView.findViewById(id);
      if (radb1 == null) {
        break missingId;
      }

      id = R.id.radb2;
      RadioButton radb2 = rootView.findViewById(id);
      if (radb2 == null) {
        break missingId;
      }

      id = R.id.radid;
      RadioGroup radid = rootView.findViewById(id);
      if (radid == null) {
        break missingId;
      }

      id = R.id.txtagel;
      EditText txtagel = rootView.findViewById(id);
      if (txtagel == null) {
        break missingId;
      }

      id = R.id.txtblood;
      EditText txtblood = rootView.findViewById(id);
      if (txtblood == null) {
        break missingId;
      }

      id = R.id.txtcon;
      EditText txtcon = rootView.findViewById(id);
      if (txtcon == null) {
        break missingId;
      }

      id = R.id.txtdatell;
      EditText txtdatell = rootView.findViewById(id);
      if (txtdatell == null) {
        break missingId;
      }

      id = R.id.txtname;
      EditText txtname = rootView.findViewById(id);
      if (txtname == null) {
        break missingId;
      }

      id = R.id.txtnic;
      EditText txtnic = rootView.findViewById(id);
      if (txtnic == null) {
        break missingId;
      }

      id = R.id.txtsuf;
      EditText txtsuf = rootView.findViewById(id);
      if (txtsuf == null) {
        break missingId;
      }

      id = R.id.txttimel;
      EditText txttimel = rootView.findViewById(id);
      if (txttimel == null) {
        break missingId;
      }

      return new ActivityGetLabReportBinding((ConstraintLayout) rootView, btnaddap, radb1, radb2,
          radid, txtagel, txtblood, txtcon, txtdatell, txtname, txtnic, txtsuf, txttimel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
