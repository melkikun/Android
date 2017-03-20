// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragmentMenu_ViewBinding implements Unbinder {
  private HomeFragmentMenu target;

  @UiThread
  public HomeFragmentMenu_ViewBinding(HomeFragmentMenu target, View source) {
    this.target = target;

    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
    target.pager = Utils.findRequiredViewAsType(source, R.id.vp, "field 'pager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragmentMenu target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabLayout = null;
    target.pager = null;
  }
}
