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
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMakeAppointment01Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAdminAddHospital;

  @NonNull
  public final Button btnBookDoctor;

  @NonNull
  public final Button btnCentral;

  @NonNull
  public final Button btnEastern;

  @NonNull
  public final Button btnNorthCentral;

  @NonNull
  public final Button btnNorthWestern;

  @NonNull
  public final Button btnNorthern;

  @NonNull
  public final Button btnSabaragamuwa;

  @NonNull
  public final Button btnUva;

  @NonNull
  public final Button btnWestern;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvFirstName;

  @NonNull
  public final TextView tvLastName;

  @NonNull
  public final TextView tvMakeAppo;

  @NonNull
  public final TextView tvSelectProvince;

  @NonNull
  public final Button x2;

  private ActivityMakeAppointment01Binding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAdminAddHospital, @NonNull Button btnBookDoctor,
      @NonNull Button btnCentral, @NonNull Button btnEastern, @NonNull Button btnNorthCentral,
      @NonNull Button btnNorthWestern, @NonNull Button btnNorthern, @NonNull Button btnSabaragamuwa,
      @NonNull Button btnUva, @NonNull Button btnWestern, @NonNull TextView textView4,
      @NonNull TextView tvAge, @NonNull TextView tvFirstName, @NonNull TextView tvLastName,
      @NonNull TextView tvMakeAppo, @NonNull TextView tvSelectProvince, @NonNull Button x2) {
    this.rootView = rootView;
    this.btnAdminAddHospital = btnAdminAddHospital;
    this.btnBookDoctor = btnBookDoctor;
    this.btnCentral = btnCentral;
    this.btnEastern = btnEastern;
    this.btnNorthCentral = btnNorthCentral;
    this.btnNorthWestern = btnNorthWestern;
    this.btnNorthern = btnNorthern;
    this.btnSabaragamuwa = btnSabaragamuwa;
    this.btnUva = btnUva;
    this.btnWestern = btnWestern;
    this.textView4 = textView4;
    this.tvAge = tvAge;
    this.tvFirstName = tvFirstName;
    this.tvLastName = tvLastName;
    this.tvMakeAppo = tvMakeAppo;
    this.tvSelectProvince = tvSelectProvince;
    this.x2 = x2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMakeAppointment01Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMakeAppointment01Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_make_appointment01, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMakeAppointment01Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_adminAddHospital;
      Button btnAdminAddHospital = rootView.findViewById(id);
      if (btnAdminAddHospital == null) {
        break missingId;
      }

      id = R.id.btnBookDoctor;
      Button btnBookDoctor = rootView.findViewById(id);
      if (btnBookDoctor == null) {
        break missingId;
      }

      id = R.id.btn_central;
      Button btnCentral = rootView.findViewById(id);
      if (btnCentral == null) {
        break missingId;
      }

      id = R.id.btn_eastern;
      Button btnEastern = rootView.findViewById(id);
      if (btnEastern == null) {
        break missingId;
      }

      id = R.id.btn_northCentral;
      Button btnNorthCentral = rootView.findViewById(id);
      if (btnNorthCentral == null) {
        break missingId;
      }

      id = R.id.btn_northWestern;
      Button btnNorthWestern = rootView.findViewById(id);
      if (btnNorthWestern == null) {
        break missingId;
      }

      id = R.id.btn_northern;
      Button btnNorthern = rootView.findViewById(id);
      if (btnNorthern == null) {
        break missingId;
      }

      id = R.id.btn_sabaragamuwa;
      Button btnSabaragamuwa = rootView.findViewById(id);
      if (btnSabaragamuwa == null) {
        break missingId;
      }

      id = R.id.btn_uva;
      Button btnUva = rootView.findViewById(id);
      if (btnUva == null) {
        break missingId;
      }

      id = R.id.btn_western;
      Button btnWestern = rootView.findViewById(id);
      if (btnWestern == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
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

      id = R.id.tv_makeAppo;
      TextView tvMakeAppo = rootView.findViewById(id);
      if (tvMakeAppo == null) {
        break missingId;
      }

      id = R.id.tv_selectProvince;
      TextView tvSelectProvince = rootView.findViewById(id);
      if (tvSelectProvince == null) {
        break missingId;
      }

      id = R.id.x2;
      Button x2 = rootView.findViewById(id);
      if (x2 == null) {
        break missingId;
      }

      return new ActivityMakeAppointment01Binding((ConstraintLayout) rootView, btnAdminAddHospital,
          btnBookDoctor, btnCentral, btnEastern, btnNorthCentral, btnNorthWestern, btnNorthern,
          btnSabaragamuwa, btnUva, btnWestern, textView4, tvAge, tvFirstName, tvLastName,
          tvMakeAppo, tvSelectProvince, x2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}