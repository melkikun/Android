// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListEmployeeAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ListEmployeeAdapter.ViewHolder target;

  @UiThread
  public ListEmployeeAdapter$ViewHolder_ViewBinding(ListEmployeeAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.nama = Utils.findRequiredViewAsType(source, R.id.nama, "field 'nama'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListEmployeeAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nama = null;
  }
}
