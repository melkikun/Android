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

public class DetailOfficeByIdAdapter$ViewHolder_ViewBinding implements Unbinder {
  private DetailOfficeByIdAdapter.ViewHolder target;

  @UiThread
  public DetailOfficeByIdAdapter$ViewHolder_ViewBinding(DetailOfficeByIdAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.officeCode = Utils.findRequiredViewAsType(source, R.id.officecode, "field 'officeCode'", TextView.class);
    target.city = Utils.findRequiredViewAsType(source, R.id.city, "field 'city'", TextView.class);
    target.phone = Utils.findRequiredViewAsType(source, R.id.phone, "field 'phone'", TextView.class);
    target.address1 = Utils.findRequiredViewAsType(source, R.id.address1, "field 'address1'", TextView.class);
    target.address2 = Utils.findRequiredViewAsType(source, R.id.address2, "field 'address2'", TextView.class);
    target.state = Utils.findRequiredViewAsType(source, R.id.state, "field 'state'", TextView.class);
    target.country = Utils.findRequiredViewAsType(source, R.id.country, "field 'country'", TextView.class);
    target.postalCode = Utils.findRequiredViewAsType(source, R.id.postalcode, "field 'postalCode'", TextView.class);
    target.terrytory = Utils.findRequiredViewAsType(source, R.id.terrytory, "field 'terrytory'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailOfficeByIdAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.officeCode = null;
    target.city = null;
    target.phone = null;
    target.address1 = null;
    target.address2 = null;
    target.state = null;
    target.country = null;
    target.postalCode = null;
    target.terrytory = null;
  }
}
