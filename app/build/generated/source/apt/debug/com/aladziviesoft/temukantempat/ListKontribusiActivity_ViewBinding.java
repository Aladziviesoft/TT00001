// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListKontribusiActivity_ViewBinding implements Unbinder {
  private ListKontribusiActivity target;

  @UiThread
  public ListKontribusiActivity_ViewBinding(ListKontribusiActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListKontribusiActivity_ViewBinding(ListKontribusiActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.recListKontribusi = Utils.findRequiredViewAsType(source, R.id.recListKontribusi, "field 'recListKontribusi'", RecyclerView.class);
    target.Swipe = Utils.findRequiredViewAsType(source, R.id.Swipe, "field 'Swipe'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListKontribusiActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.recListKontribusi = null;
    target.Swipe = null;
  }
}
