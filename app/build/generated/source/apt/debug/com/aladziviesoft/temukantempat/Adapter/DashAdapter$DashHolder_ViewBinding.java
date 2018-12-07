// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat.Adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.aladziviesoft.temukantempat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DashAdapter$DashHolder_ViewBinding implements Unbinder {
  private DashAdapter.DashHolder target;

  @UiThread
  public DashAdapter$DashHolder_ViewBinding(DashAdapter.DashHolder target, View source) {
    this.target = target;

    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", ImageView.class);
    target.nama = Utils.findRequiredViewAsType(source, R.id.nama, "field 'nama'", TextView.class);
    target.cardview = Utils.findRequiredViewAsType(source, R.id.cardview, "field 'cardview'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DashAdapter.DashHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.img = null;
    target.nama = null;
    target.cardview = null;
  }
}
