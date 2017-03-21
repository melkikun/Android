// Generated code from Butter Knife. Do not modify!
package com.example.it01.android.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.it01.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Login_ViewBinding implements Unbinder {
  private Login target;

  private View view2131624088;

  @UiThread
  public Login_ViewBinding(Login target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Login_ViewBinding(final Login target, View source) {
    this.target = target;

    View view;
    target.un = Utils.findRequiredViewAsType(source, R.id.username, "field 'un'", EditText.class);
    target.pwd = Utils.findRequiredViewAsType(source, R.id.password, "field 'pwd'", EditText.class);
    target.linearLayout = Utils.findRequiredViewAsType(source, R.id.layou_login, "field 'linearLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.login, "method 'Login'");
    view2131624088 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Login(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.un = null;
    target.pwd = null;
    target.linearLayout = null;

    view2131624088.setOnClickListener(null);
    view2131624088 = null;
  }
}
