// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ExpandableListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TabFragmentOffice_ViewBinding implements Unbinder {
  private TabFragmentOffice target;

  @UiThread
  public TabFragmentOffice_ViewBinding(TabFragmentOffice target, View source) {
    this.target = target;

    target.elv = Utils.findRequiredViewAsType(source, R.id.elv, "field 'elv'", ExpandableListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TabFragmentOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.elv = null;
  }
}
