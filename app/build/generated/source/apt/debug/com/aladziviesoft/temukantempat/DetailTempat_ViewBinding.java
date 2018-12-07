// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailTempat_ViewBinding implements Unbinder {
  private DetailTempat target;

  @UiThread
  public DetailTempat_ViewBinding(DetailTempat target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailTempat_ViewBinding(DetailTempat target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.collapsing = Utils.findRequiredViewAsType(source, R.id.collapsing, "field 'collapsing'", CollapsingToolbarLayout.class);
    target.appbar = Utils.findRequiredViewAsType(source, R.id.appbar, "field 'appbar'", AppBarLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailTempat target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.collapsing = null;
    target.appbar = null;
  }
}
