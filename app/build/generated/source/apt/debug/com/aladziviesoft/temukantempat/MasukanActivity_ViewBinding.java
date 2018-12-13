// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MasukanActivity_ViewBinding implements Unbinder {
  private MasukanActivity target;

  private View view2131230765;

  @UiThread
  public MasukanActivity_ViewBinding(MasukanActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MasukanActivity_ViewBinding(final MasukanActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.etText = Utils.findRequiredViewAsType(source, R.id.etText, "field 'etText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btKirim, "field 'btKirim' and method 'onViewClicked'");
    target.btKirim = Utils.castView(view, R.id.btKirim, "field 'btKirim'", Button.class);
    view2131230765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.recListMasukan = Utils.findRequiredViewAsType(source, R.id.recListMasukan, "field 'recListMasukan'", RecyclerView.class);
    target.Swipe = Utils.findRequiredViewAsType(source, R.id.Swipe, "field 'Swipe'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MasukanActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.etText = null;
    target.btKirim = null;
    target.recListMasukan = null;
    target.Swipe = null;

    view2131230765.setOnClickListener(null);
    view2131230765 = null;
  }
}
