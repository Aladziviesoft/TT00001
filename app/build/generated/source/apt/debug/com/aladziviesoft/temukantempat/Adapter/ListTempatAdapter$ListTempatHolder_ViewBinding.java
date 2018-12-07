// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat.Adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.aladziviesoft.temukantempat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListTempatAdapter$ListTempatHolder_ViewBinding implements Unbinder {
  private ListTempatAdapter.ListTempatHolder target;

  @UiThread
  public ListTempatAdapter$ListTempatHolder_ViewBinding(ListTempatAdapter.ListTempatHolder target,
      View source) {
    this.target = target;

    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", ImageView.class);
    target.ratingBar = Utils.findRequiredViewAsType(source, R.id.ratingBar, "field 'ratingBar'", RatingBar.class);
    target.txRate = Utils.findRequiredViewAsType(source, R.id.txRate, "field 'txRate'", TextView.class);
    target.txNamaTempat = Utils.findRequiredViewAsType(source, R.id.txNamaTempat, "field 'txNamaTempat'", TextView.class);
    target.txJamBuka = Utils.findRequiredViewAsType(source, R.id.txJamBuka, "field 'txJamBuka'", TextView.class);
    target.cardview = Utils.findRequiredViewAsType(source, R.id.cardview, "field 'cardview'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListTempatAdapter.ListTempatHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.img = null;
    target.ratingBar = null;
    target.txRate = null;
    target.txNamaTempat = null;
    target.txJamBuka = null;
    target.cardview = null;
  }
}
