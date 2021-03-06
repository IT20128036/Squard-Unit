// Generated by view binder compiler. Do not edit!
package com.example.healthyrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.healthyrate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvaddress;

  @NonNull
  public final TextView tvage;

  @NonNull
  public final TextView tvdate;

  @NonNull
  public final TextView tvname;

  @NonNull
  public final TextView tvphone;

  @NonNull
  public final TextView tvtype;

  private ItemBinding(@NonNull CardView rootView, @NonNull TextView tvaddress,
      @NonNull TextView tvage, @NonNull TextView tvdate, @NonNull TextView tvname,
      @NonNull TextView tvphone, @NonNull TextView tvtype) {
    this.rootView = rootView;
    this.tvaddress = tvaddress;
    this.tvage = tvage;
    this.tvdate = tvdate;
    this.tvname = tvname;
    this.tvphone = tvphone;
    this.tvtype = tvtype;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvaddress;
      TextView tvaddress = rootView.findViewById(id);
      if (tvaddress == null) {
        break missingId;
      }

      id = R.id.tvage;
      TextView tvage = rootView.findViewById(id);
      if (tvage == null) {
        break missingId;
      }

      id = R.id.tvdate;
      TextView tvdate = rootView.findViewById(id);
      if (tvdate == null) {
        break missingId;
      }

      id = R.id.tvname;
      TextView tvname = rootView.findViewById(id);
      if (tvname == null) {
        break missingId;
      }

      id = R.id.tvphone;
      TextView tvphone = rootView.findViewById(id);
      if (tvphone == null) {
        break missingId;
      }

      id = R.id.tvtype;
      TextView tvtype = rootView.findViewById(id);
      if (tvtype == null) {
        break missingId;
      }

      return new ItemBinding((CardView) rootView, tvaddress, tvage, tvdate, tvname, tvphone,
          tvtype);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
