
package org.sherzberg.graylog.aws.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AWSPluginConfiguration extends AWSPluginConfiguration {

  private final String accessKey;
  private final String secretKey;

  private AutoValue_AWSPluginConfiguration(
      String accessKey,
      String secretKey) {
    this.accessKey = accessKey;
    this.secretKey = secretKey;
  }

  @JsonProperty(value = "access_key")
  @Override
  public String accessKey() {
    return accessKey;
  }

  @JsonProperty(value = "secret_key")
  @Override
  public String secretKey() {
    return secretKey;
  }

  @Override
  public String toString() {
    return "AWSPluginConfiguration{"
        + "accessKey=" + accessKey + ", "
        + "secretKey=" + secretKey
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AWSPluginConfiguration) {
      AWSPluginConfiguration that = (AWSPluginConfiguration) o;
      return (this.accessKey.equals(that.accessKey()))
           && (this.secretKey.equals(that.secretKey()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.accessKey.hashCode();
    h *= 1000003;
    h ^= this.secretKey.hashCode();
    return h;
  }

  @Override
  public AWSPluginConfiguration.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends AWSPluginConfiguration.Builder {
    private String accessKey;
    private String secretKey;
    Builder() {
    }
    private Builder(AWSPluginConfiguration source) {
      this.accessKey = source.accessKey();
      this.secretKey = source.secretKey();
    }
    @Override
    public AWSPluginConfiguration.Builder accessKey(String accessKey) {
      if (accessKey == null) {
        throw new NullPointerException("Null accessKey");
      }
      this.accessKey = accessKey;
      return this;
    }
    @Override
    public AWSPluginConfiguration.Builder secretKey(String secretKey) {
      if (secretKey == null) {
        throw new NullPointerException("Null secretKey");
      }
      this.secretKey = secretKey;
      return this;
    }
    @Override
    public AWSPluginConfiguration build() {
      String missing = "";
      if (this.accessKey == null) {
        missing += " accessKey";
      }
      if (this.secretKey == null) {
        missing += " secretKey";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AWSPluginConfiguration(
          this.accessKey,
          this.secretKey);
    }
  }

}
