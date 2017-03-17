// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomerAdapter$Holder_ViewBinding implements Unbinder {
  private CustomerAdapter.Holder target;

  @UiThread
  public CustomerAdapter$Holder_ViewBinding(CustomerAdapter.Holder target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.menu, "field 'imageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomerAdapter.Holder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
  }
}
