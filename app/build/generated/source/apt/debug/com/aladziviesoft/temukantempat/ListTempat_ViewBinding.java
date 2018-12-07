// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListTempat_ViewBinding implements Unbinder {
  private ListTempat target;

  @UiThread
  public ListTempat_ViewBinding(ListTempat target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListTempat_ViewBinding(ListTempat target, View source) {
    this.target = target;

    target.recDataTempat = Utils.findRequiredViewAsType(source, R.id.recDataTempat, "field 'recDataTempat'", RecyclerView.class);
    target.Swipe = Utils.findRequiredViewAsType(source, R.id.Swipe, "field 'Swipe'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListTempat target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recDataTempat = null;
    target.Swipe = null;
  }
}
