// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListEmployee_ViewBinding implements Unbinder {
  private ListEmployee target;

  @UiThread
  public ListEmployee_ViewBinding(ListEmployee target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListEmployee_ViewBinding(ListEmployee target, View source) {
    this.target = target;

    target.rv = Utils.findRequiredViewAsType(source, R.id.rv, "field 'rv'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListEmployee target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv = null;
  }
}
