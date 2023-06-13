// Generated by view binder compiler. Do not edit!
package com.example.testchat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.testchat.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton buttonSignIn;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputPass;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textCreateAccount;

  private ActivitySignInBinding(@NonNull ScrollView rootView, @NonNull MaterialButton buttonSignIn,
      @NonNull EditText inputEmail, @NonNull EditText inputPass, @NonNull ProgressBar progressBar,
      @NonNull TextView textCreateAccount) {
    this.rootView = rootView;
    this.buttonSignIn = buttonSignIn;
    this.inputEmail = inputEmail;
    this.inputPass = inputPass;
    this.progressBar = progressBar;
    this.textCreateAccount = textCreateAccount;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSignIn;
      MaterialButton buttonSignIn = ViewBindings.findChildViewById(rootView, id);
      if (buttonSignIn == null) {
        break missingId;
      }

      id = R.id.inputEmail;
      EditText inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.inputPass;
      EditText inputPass = ViewBindings.findChildViewById(rootView, id);
      if (inputPass == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textCreateAccount;
      TextView textCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (textCreateAccount == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ScrollView) rootView, buttonSignIn, inputEmail, inputPass,
          progressBar, textCreateAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
