// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditOffice_ViewBinding implements Unbinder {
  private EditOffice target;

  private View view2131624084;

  @UiThread
  public EditOffice_ViewBinding(EditOffice target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditOffice_ViewBinding(final EditOffice target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.scan, "field 'scan' and method 'onClickMe'");
    target.scan = Utils.castView(view, R.id.scan, "field 'scan'", Button.class);
    view2131624084 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickMe(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    EditOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.scan = null;

    view2131624084.setOnClickListener(null);
    view2131624084 = null;
  }
}
