// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  private View view2131230771;

  private View view2131230764;

  private View view2131230773;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(final RegisterActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.etNama = Utils.findRequiredViewAsType(source, R.id.etNama, "field 'etNama'", EditText.class);
    target.etUsername = Utils.findRequiredViewAsType(source, R.id.etUsername, "field 'etUsername'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.etPassword, "field 'etPassword'", EditText.class);
    target.etPekerjaan = Utils.findRequiredViewAsType(source, R.id.etPekerjaan, "field 'etPekerjaan'", EditText.class);
    target.etHp = Utils.findRequiredViewAsType(source, R.id.etHp, "field 'etHp'", EditText.class);
    target.etAlamat = Utils.findRequiredViewAsType(source, R.id.etAlamat, "field 'etAlamat'", EditText.class);
    target.rbL = Utils.findRequiredViewAsType(source, R.id.rbL, "field 'rbL'", RadioButton.class);
    target.rbP = Utils.findRequiredViewAsType(source, R.id.rbP, "field 'rbP'", RadioButton.class);
    target.Rgjk = Utils.findRequiredViewAsType(source, R.id.Rgjk, "field 'Rgjk'", RadioGroup.class);
    view = Utils.findRequiredView(source, R.id.btRegistrasi, "field 'btRegistrasi' and method 'onViewClicked'");
    target.btRegistrasi = Utils.castView(view, R.id.btRegistrasi, "field 'btRegistrasi'", Button.class);
    view2131230771 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btKembali, "field 'btKembali' and method 'onViewClicked'");
    target.btKembali = Utils.castView(view, R.id.btKembali, "field 'btKembali'", Button.class);
    view2131230764 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btUpdate, "field 'btUpdate' and method 'onViewClicked'");
    target.btUpdate = Utils.castView(view, R.id.btUpdate, "field 'btUpdate'", Button.class);
    view2131230773 = view;
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
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.etNama = null;
    target.etUsername = null;
    target.etPassword = null;
    target.etPekerjaan = null;
    target.etHp = null;
    target.etAlamat = null;
    target.rbL = null;
    target.rbP = null;
    target.Rgjk = null;
    target.btRegistrasi = null;
    target.btKembali = null;
    target.btUpdate = null;

    view2131230771.setOnClickListener(null);
    view2131230771 = null;
    view2131230764.setOnClickListener(null);
    view2131230764 = null;
    view2131230773.setOnClickListener(null);
    view2131230773 = null;
  }
}
