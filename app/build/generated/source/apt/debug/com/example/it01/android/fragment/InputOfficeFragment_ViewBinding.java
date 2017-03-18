// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class InputOfficeFragment_ViewBinding implements Unbinder {
  private InputOfficeFragment target;

  private View view2131558550;

  @UiThread
  public InputOfficeFragment_ViewBinding(final InputOfficeFragment target, View source) {
    this.target = target;

    View view;
    target.city = Utils.findRequiredViewAsType(source, R.id.city, "field 'city'", EditText.class);
    target.phone = Utils.findRequiredViewAsType(source, R.id.phone, "field 'phone'", EditText.class);
    target.address1 = Utils.findRequiredViewAsType(source, R.id.address1, "field 'address1'", EditText.class);
    target.address2 = Utils.findRequiredViewAsType(source, R.id.address2, "field 'address2'", EditText.class);
    target.state = Utils.findRequiredViewAsType(source, R.id.state, "field 'state'", EditText.class);
    target.country = Utils.findRequiredViewAsType(source, R.id.country, "field 'country'", EditText.class);
    target.postal_code = Utils.findRequiredViewAsType(source, R.id.postal_code, "field 'postal_code'", EditText.class);
    target.territory = Utils.findRequiredViewAsType(source, R.id.territory, "field 'territory'", EditText.class);
    view = Utils.findRequiredView(source, R.id.submit, "method 'submitOffice'");
    view2131558550 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submitOffice(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    InputOfficeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.city = null;
    target.phone = null;
    target.address1 = null;
    target.address2 = null;
    target.state = null;
    target.country = null;
    target.postal_code = null;
    target.territory = null;

    view2131558550.setOnClickListener(null);
    view2131558550 = null;
  }
}
