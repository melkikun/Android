// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MenuAdapter$Holder_ViewBinding implements Unbinder {
  private MenuAdapter.Holder target;

  @UiThread
  public MenuAdapter$Holder_ViewBinding(MenuAdapter.Holder target, View source) {
    this.target = target;

    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
    target.linearLayout = Utils.findRequiredViewAsType(source, R.id.parent_layout, "field 'linearLayout'", LinearLayout.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MenuAdapter.Holder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
    target.linearLayout = null;
    target.title = null;
  }
}
