// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EmployeeFragmentMenu_ViewBinding implements Unbinder {
  private EmployeeFragmentMenu target;

  @UiThread
  public EmployeeFragmentMenu_ViewBinding(EmployeeFragmentMenu target, View source) {
    this.target = target;

    target.gridView = Utils.findRequiredViewAsType(source, R.id.grid, "field 'gridView'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EmployeeFragmentMenu target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gridView = null;
  }
}
