package app.organicmaps.util;

import androidx.annotation.NonNull;

import java.io.Serializable;

public final class KeyValue implements Serializable
{
  private static final long serialVersionUID = -3079360274128509979L;
  @NonNull
  private final String mKey;
  @NonNull
  private final String mValue;

  public KeyValue(@NonNull String key, @NonNull String value)
  {
    mKey = key;
    mValue = value;
  }

  @NonNull
  public String getKey()
  {
    return mKey;
  }

  @NonNull
  public String getValue()
  {
    return mValue;
  }
}
