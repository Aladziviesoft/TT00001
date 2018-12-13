// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat.Adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.aladziviesoft.temukantempat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MasukanAdapter$MasukanHolder_ViewBinding implements Unbinder {
  private MasukanAdapter.MasukanHolder target;

  @UiThread
  public MasukanAdapter$MasukanHolder_ViewBinding(MasukanAdapter.MasukanHolder target,
      View source) {
    this.target = target;

    target.txNamaUser = Utils.findRequiredViewAsType(source, R.id.txNamaUser, "field 'txNamaUser'", TextView.class);
    target.txWaktuUserKomentar = Utils.findRequiredViewAsType(source, R.id.txWaktuUserKomentar, "field 'txWaktuUserKomentar'", TextView.class);
    target.txTextKomentar = Utils.findRequiredViewAsType(source, R.id.txTextKomentar, "field 'txTextKomentar'", TextView.class);
    target.layItemKomentar = Utils.findRequiredViewAsType(source, R.id.lay_item_komentar, "field 'layItemKomentar'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MasukanAdapter.MasukanHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txNamaUser = null;
    target.txWaktuUserKomentar = null;
    target.txTextKomentar = null;
    target.layItemKomentar = null;
  }
}
