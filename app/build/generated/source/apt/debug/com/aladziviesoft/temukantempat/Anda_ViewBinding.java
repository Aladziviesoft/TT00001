// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Anda_ViewBinding implements Unbinder {
  private Anda target;

  private View view2131230759;

  private View view2131230761;

  @UiThread
  public Anda_ViewBinding(final Anda target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btLogin, "field 'btLogin' and method 'onViewClicked'");
    target.btLogin = Utils.castView(view, R.id.btLogin, "field 'btLogin'", Button.class);
    view2131230759 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btRegistrasi, "field 'btRegistrasi' and method 'onViewClicked'");
    target.btRegistrasi = Utils.castView(view, R.id.btRegistrasi, "field 'btRegistrasi'", Button.class);
    view2131230761 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Anda target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btLogin = null;
    target.btRegistrasi = null;

    view2131230759.setOnClickListener(null);
    view2131230759 = null;
    view2131230761.setOnClickListener(null);
    view2131230761 = null;
  }
}
