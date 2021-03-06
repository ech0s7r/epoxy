package com.airbnb.epoxy;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.view.View.OnClickListener;

import com.airbnb.paris.styles.Style;

import java.util.List;

public interface ModelProperties {

  @NonNull
  String getId();

  boolean has(@NonNull String propertyName);

  boolean getBoolean(@NonNull String propertyName);

  double getDouble(@NonNull String propertyName);

  @DrawableRes
  int getDrawableRes(@NonNull String propertyName);

  @Nullable
  List<? extends EpoxyModel<?>> getEpoxyModelList(@NonNull String propertyName);

  int getInt(@NonNull String propertyName);

  long getLong(@NonNull String propertyName);

  @Nullable
  OnClickListener getOnClickListener(@NonNull String propertyName);

  @RawRes
  int getRawRes(@NonNull String propertyName);

  @Nullable
  String getString(@NonNull String propertyName);

  @Nullable
  List<String> getStringList(@NonNull String propertyName);

  /**
   * @return Null to apply the default style.
   */
  @Nullable
  Style getStyle();
}
