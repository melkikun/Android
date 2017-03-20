// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddOffice_ViewBinding implements Unbinder {
  private AddOffice target;

  private View view2131624071;

  private View view2131624069;

  @UiThread
  public AddOffice_ViewBinding(AddOffice target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddOffice_ViewBinding(final AddOffice target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.kirim, "field 'kirim' and method 'kirimGambar'");
    target.kirim = Utils.castView(view, R.id.kirim, "field 'kirim'", Button.class);
    view2131624071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.kirimGambar(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn, "method 'clickMe'");
    view2131624069 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickMe(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AddOffice target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.img = null;
    target.kirim = null;

    view2131624071.setOnClickListener(null);
    view2131624071 = null;
    view2131624069.setOnClickListener(null);
    view2131624069 = null;
  }
}
