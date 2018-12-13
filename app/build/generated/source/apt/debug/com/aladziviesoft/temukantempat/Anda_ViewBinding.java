// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Anda_ViewBinding implements Unbinder {
  private Anda target;

  private View view2131230767;

  private View view2131230771;

  private View view2131230766;

  private View view2131230769;

  private View view2131230763;

  private View view2131230768;

  @UiThread
  public Anda_ViewBinding(final Anda target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btLogin, "field 'btLogin' and method 'onViewClicked'");
    target.btLogin = Utils.castView(view, R.id.btLogin, "field 'btLogin'", Button.class);
    view2131230767 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btRegistrasi, "field 'btRegistrasi' and method 'onViewClicked'");
    target.btRegistrasi = Utils.castView(view, R.id.btRegistrasi, "field 'btRegistrasi'", Button.class);
    view2131230771 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", CircleImageView.class);
    target.txNamaLengkap = Utils.findRequiredViewAsType(source, R.id.txNamaLengkap, "field 'txNamaLengkap'", TextView.class);
    target.txNoHp = Utils.findRequiredViewAsType(source, R.id.txNoHp, "field 'txNoHp'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btListKontribusi, "field 'btListKontribusi' and method 'onViewClicked'");
    target.btListKontribusi = Utils.castView(view, R.id.btListKontribusi, "field 'btListKontribusi'", RelativeLayout.class);
    view2131230766 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btMasukanTentangAplikasi, "field 'btMasukanTentangAplikasi' and method 'onViewClicked'");
    target.btMasukanTentangAplikasi = Utils.castView(view, R.id.btMasukanTentangAplikasi, "field 'btMasukanTentangAplikasi'", RelativeLayout.class);
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btEditData, "field 'btEditData' and method 'onViewClicked'");
    target.btEditData = Utils.castView(view, R.id.btEditData, "field 'btEditData'", RelativeLayout.class);
    view2131230763 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.formLogin = Utils.findRequiredViewAsType(source, R.id.formLogin, "field 'formLogin'", LinearLayout.class);
    target.formProfil1 = Utils.findRequiredViewAsType(source, R.id.formProfil1, "field 'formProfil1'", RelativeLayout.class);
    target.formProfil2 = Utils.findRequiredViewAsType(source, R.id.formProfil2, "field 'formProfil2'", CardView.class);
    target.formProfil3 = Utils.findRequiredViewAsType(source, R.id.formProfil3, "field 'formProfil3'", CardView.class);
    view = Utils.findRequiredView(source, R.id.btLogout, "field 'btLogout' and method 'onViewClicked'");
    target.btLogout = Utils.castView(view, R.id.btLogout, "field 'btLogout'", RelativeLayout.class);
    view2131230768 = view;
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
    target.img = null;
    target.txNamaLengkap = null;
    target.txNoHp = null;
    target.btListKontribusi = null;
    target.btMasukanTentangAplikasi = null;
    target.btEditData = null;
    target.formLogin = null;
    target.formProfil1 = null;
    target.formProfil2 = null;
    target.formProfil3 = null;
    target.btLogout = null;

    view2131230767.setOnClickListener(null);
    view2131230767 = null;
    view2131230771.setOnClickListener(null);
    view2131230771 = null;
    view2131230766.setOnClickListener(null);
    view2131230766 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
    view2131230763.setOnClickListener(null);
    view2131230763 = null;
    view2131230768.setOnClickListener(null);
    view2131230768 = null;
  }
}
