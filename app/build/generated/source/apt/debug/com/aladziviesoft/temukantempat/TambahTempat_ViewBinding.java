// Generated code from Butter Knife. Do not modify!
package com.aladziviesoft.temukantempat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TambahTempat_ViewBinding implements Unbinder {
  private TambahTempat target;

  private View view2131230954;

  private View view2131230723;

  private View view2131230772;

  private View view2131230762;

  @UiThread
  public TambahTempat_ViewBinding(TambahTempat target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TambahTempat_ViewBinding(final TambahTempat target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.explore = Utils.findRequiredViewAsType(source, R.id.explore, "field 'explore'", Button.class);
    view = Utils.findRequiredView(source, R.id.take, "field 'take' and method 'onViewClicked'");
    target.take = Utils.castView(view, R.id.take, "field 'take'", Button.class);
    view2131230954 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.Img, "field 'Img' and method 'onViewClicked'");
    target.Img = Utils.castView(view, R.id.Img, "field 'Img'", ImageView.class);
    view2131230723 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btSimpan, "field 'btSimpan' and method 'onViewClicked'");
    target.btSimpan = Utils.castView(view, R.id.btSimpan, "field 'btSimpan'", Button.class);
    view2131230772 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btEdit, "field 'btEdit' and method 'onViewClicked'");
    target.btEdit = Utils.castView(view, R.id.btEdit, "field 'btEdit'", Button.class);
    view2131230762 = view;
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
    TambahTempat target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.explore = null;
    target.take = null;
    target.Img = null;
    target.btSimpan = null;
    target.btEdit = null;

    view2131230954.setOnClickListener(null);
    view2131230954 = null;
    view2131230723.setOnClickListener(null);
    view2131230723 = null;
    view2131230772.setOnClickListener(null);
    view2131230772 = null;
    view2131230762.setOnClickListener(null);
    view2131230762 = null;
  }
}
