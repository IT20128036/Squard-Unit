// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOxygenLevelCalculateBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btncheck;

  @NonNull
  public final EditText etoxygenlevel;

  @NonNull
  public final TextView tvmessage;

  private ActivityOxygenLevelCalculateBinding(@NonNull ScrollView rootView,
      @NonNull Button btncheck, @NonNull EditText etoxygenlevel, @NonNull TextView tvmessage) {
    this.rootView = rootView;
    this.btncheck = btncheck;
    this.etoxygenlevel = etoxygenlevel;
    this.tvmessage = tvmessage;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOxygenLevelCalculateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOxygenLevelCalculateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_oxygen_level_calculate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOxygenLevelCalculateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btncheck;
      Button btncheck = rootView.findViewById(id);
      if (btncheck == null) {
        break missingId;
      }

      id = R.id.etoxygenlevel;
      EditText etoxygenlevel = rootView.findViewById(id);
      if (etoxygenlevel == null) {
        break missingId;
      }

      id = R.id.tvmessage;
      TextView tvmessage = rootView.findViewById(id);
      if (tvmessage == null) {
        break missingId;
      }

      return new ActivityOxygenLevelCalculateBinding((ScrollView) rootView, btncheck, etoxygenlevel,
          tvmessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}