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
    target.city = Utils.findRequiredViewAsType(source, R.id.city, "field 'city'", TextView.class);
    target.phone = Utils.findRequiredViewAsType(source, R.id.phone, "field 'phone'", TextView.class);
    target.address1 = Utils.findRequiredViewAsType(source, R.id.address1, "field 'address1'", TextView.class);
    target.address2 = Utils.findRequiredViewAsType(source, R.id.address2, "field 'address2'", TextView.class);
    target.state = Utils.findRequiredViewAsType(source, R.id.state, "field 'state'", TextView.class);
    target.country = Utils.findRequiredViewAsType(source, R.id.country, "field 'country'", TextView.class);
    target.postal_code = Utils.findRequiredViewAsType(source, R.id.postal_code, "field 'postal_code'", TextView.class);
    target.territory = Utils.findRequiredViewAsType(source, R.id.territory, "field 'territory'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailListOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.id = null;
    target.toolbar = null;
    target.city = null;
    target.phone = null;
    target.address1 = null;
    target.address2 = null;
    target.state = null;
    target.country = null;
    target.postal_code = null;
    target.territory = null;
  }
}
