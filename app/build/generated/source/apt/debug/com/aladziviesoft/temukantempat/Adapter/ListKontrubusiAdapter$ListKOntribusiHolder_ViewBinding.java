// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat.Adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.aladziviesoft.temukantempat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListKontrubusiAdapter$ListKOntribusiHolder_ViewBinding implements Unbinder {
  private ListKontrubusiAdapter.ListKOntribusiHolder target;

  @UiThread
  public ListKontrubusiAdapter$ListKOntribusiHolder_ViewBinding(ListKontrubusiAdapter.ListKOntribusiHolder target,
      View source) {
    this.target = target;

    target.txNamaTempat = Utils.findRequiredViewAsType(source, R.id.txNamaTempat, "field 'txNamaTempat'", TextView.class);
    target.txWaktu = Utils.findRequiredViewAsType(source, R.id.txWaktu, "field 'txWaktu'", TextView.class);
    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", ImageView.class);
    target.txKeterangan = Utils.findRequiredViewAsType(source, R.id.txKeterangan, "field 'txKeterangan'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListKontrubusiAdapter.ListKOntribusiHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txNamaTempat = null;
    target.txWaktu = null;
    target.img = null;
    target.txKeterangan = null;
  }
}
