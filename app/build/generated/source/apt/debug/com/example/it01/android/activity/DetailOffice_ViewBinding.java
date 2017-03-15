// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailOffice_ViewBinding implements Unbinder {
  private DetailOffice target;

  @UiThread
  public DetailOffice_ViewBinding(DetailOffice target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailOffice_ViewBinding(DetailOffice target, View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.textView2, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
  }
}
