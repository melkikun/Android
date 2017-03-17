// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
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

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.textView2, "field 'textView'", TextView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.textView = null;
    target.recyclerView = null;
  }
}
