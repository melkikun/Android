// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailListOffice_ViewBinding implements Unbinder {
  private DetailListOffice target;

  @UiThread
  public DetailListOffice_ViewBinding(DetailListOffice target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailListOffice_ViewBinding(DetailListOffice target, View source) {
    this.target = target;

    target.id = Utils.findRequiredViewAsType(source, R.id.id, "field 'id'", TextView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailListOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.id = null;
    target.toolbar = null;
  }
}
