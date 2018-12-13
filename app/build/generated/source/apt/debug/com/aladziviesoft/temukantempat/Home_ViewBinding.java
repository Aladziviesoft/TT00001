// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.viewpagerindicator.CirclePageIndicator;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Home_ViewBinding implements Unbinder {
  private Home target;

  @UiThread
  public Home_ViewBinding(Home target, View source) {
    this.target = target;

    target.recMenu = Utils.findRequiredViewAsType(source, R.id.recMenu, "field 'recMenu'", RecyclerView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.collapsing = Utils.findRequiredViewAsType(source, R.id.collapsing, "field 'collapsing'", CollapsingToolbarLayout.class);
    target.appbar = Utils.findRequiredViewAsType(source, R.id.appbar, "field 'appbar'", AppBarLayout.class);
    target.vpSlide = Utils.findRequiredViewAsType(source, R.id.vpSlide, "field 'vpSlide'", ViewPager.class);
    target.cpIndicator = Utils.findRequiredViewAsType(source, R.id.cpIndicator, "field 'cpIndicator'", CirclePageIndicator.class);
    target.lyIndicator = Utils.findRequiredViewAsType(source, R.id.lyIndicator, "field 'lyIndicator'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Home target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recMenu = null;
    target.toolbar = null;
    target.collapsing = null;
    target.appbar = null;
    target.vpSlide = null;
    target.cpIndicator = null;
    target.lyIndicator = null;
  }
}
