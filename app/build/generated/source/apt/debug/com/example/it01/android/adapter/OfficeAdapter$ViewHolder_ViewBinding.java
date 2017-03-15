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

public class OfficeAdapter$ViewHolder_ViewBinding implements Unbinder {
  private OfficeAdapter.ViewHolder target;

  @UiThread
  public OfficeAdapter$ViewHolder_ViewBinding(OfficeAdapter.ViewHolder target, View source) {
    this.target = target;

    target.city = Utils.findRequiredViewAsType(source, R.id.city, "field 'city'", TextView.class);
    target.phone = Utils.findRequiredViewAsType(source, R.id.phone, "field 'phone'", TextView.class);
    target.address1 = Utils.findRequiredViewAsType(source, R.id.address1, "field 'address1'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OfficeAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.city = null;
    target.phone = null;
    target.address1 = null;
  }
}
