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

public class OfficeDetailAdapter$ViewHolder_ViewBinding implements Unbinder {
  private OfficeDetailAdapter.ViewHolder target;

  @UiThread
  public OfficeDetailAdapter$ViewHolder_ViewBinding(OfficeDetailAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.id = Utils.findRequiredViewAsType(source, R.id.id, "field 'id'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OfficeDetailAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.id = null;
  }
}
