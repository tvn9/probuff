// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: 5-city-package.proto

package exercise2;

public final class 5CityPackage {
  private 5CityPackage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:exercise2.City)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string city_name = 1;</code>
     * @return The cityName.
     */
    java.lang.String getCityName();
    /**
     * <code>string city_name = 1;</code>
     * @return The bytes for cityName.
     */
    com.google.protobuf.ByteString
        getCityNameBytes();

    /**
     * <code>string zipcode = 2;</code>
     * @return The zipcode.
     */
    java.lang.String getZipcode();
    /**
     * <code>string zipcode = 2;</code>
     * @return The bytes for zipcode.
     */
    com.google.protobuf.ByteString
        getZipcodeBytes();

    /**
     * <code>string country = 3;</code>
     * @return The country.
     */
    java.lang.String getCountry();
    /**
     * <code>string country = 3;</code>
     * @return The bytes for country.
     */
    com.google.protobuf.ByteString
        getCountryBytes();
  }
  /**
   * Protobuf type {@code exercise2.City}
   */
  public static final class City extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:exercise2.City)
      CityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use City.newBuilder() to construct.
    private City(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private City() {
      cityName_ = "";
      zipcode_ = "";
      country_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new City();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private City(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              cityName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              zipcode_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              country_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return exercise2.5CityPackage.internal_static_exercise2_City_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return exercise2.5CityPackage.internal_static_exercise2_City_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              exercise2.5CityPackage.City.class, exercise2.5CityPackage.City.Builder.class);
    }

    public static final int CITY_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object cityName_;
    /**
     * <code>string city_name = 1;</code>
     * @return The cityName.
     */
    @java.lang.Override
    public java.lang.String getCityName() {
      java.lang.Object ref = cityName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cityName_ = s;
        return s;
      }
    }
    /**
     * <code>string city_name = 1;</code>
     * @return The bytes for cityName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCityNameBytes() {
      java.lang.Object ref = cityName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cityName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ZIPCODE_FIELD_NUMBER = 2;
    private volatile java.lang.Object zipcode_;
    /**
     * <code>string zipcode = 2;</code>
     * @return The zipcode.
     */
    @java.lang.Override
    public java.lang.String getZipcode() {
      java.lang.Object ref = zipcode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zipcode_ = s;
        return s;
      }
    }
    /**
     * <code>string zipcode = 2;</code>
     * @return The bytes for zipcode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getZipcodeBytes() {
      java.lang.Object ref = zipcode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zipcode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNTRY_FIELD_NUMBER = 3;
    private volatile java.lang.Object country_;
    /**
     * <code>string country = 3;</code>
     * @return The country.
     */
    @java.lang.Override
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      }
    }
    /**
     * <code>string country = 3;</code>
     * @return The bytes for country.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cityName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cityName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zipcode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zipcode_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(country_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, country_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cityName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cityName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zipcode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zipcode_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(country_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, country_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof exercise2.5CityPackage.City)) {
        return super.equals(obj);
      }
      exercise2.5CityPackage.City other = (exercise2.5CityPackage.City) obj;

      if (!getCityName()
          .equals(other.getCityName())) return false;
      if (!getZipcode()
          .equals(other.getZipcode())) return false;
      if (!getCountry()
          .equals(other.getCountry())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CITY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getCityName().hashCode();
      hash = (37 * hash) + ZIPCODE_FIELD_NUMBER;
      hash = (53 * hash) + getZipcode().hashCode();
      hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCountry().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static exercise2.5CityPackage.City parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static exercise2.5CityPackage.City parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static exercise2.5CityPackage.City parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static exercise2.5CityPackage.City parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static exercise2.5CityPackage.City parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static exercise2.5CityPackage.City parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static exercise2.5CityPackage.City parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static exercise2.5CityPackage.City parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static exercise2.5CityPackage.City parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static exercise2.5CityPackage.City parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static exercise2.5CityPackage.City parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static exercise2.5CityPackage.City parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(exercise2.5CityPackage.City prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code exercise2.City}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:exercise2.City)
        exercise2.5CityPackage.CityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return exercise2.5CityPackage.internal_static_exercise2_City_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return exercise2.5CityPackage.internal_static_exercise2_City_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                exercise2.5CityPackage.City.class, exercise2.5CityPackage.City.Builder.class);
      }

      // Construct using exercise2.5CityPackage.City.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cityName_ = "";

        zipcode_ = "";

        country_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return exercise2.5CityPackage.internal_static_exercise2_City_descriptor;
      }

      @java.lang.Override
      public exercise2.5CityPackage.City getDefaultInstanceForType() {
        return exercise2.5CityPackage.City.getDefaultInstance();
      }

      @java.lang.Override
      public exercise2.5CityPackage.City build() {
        exercise2.5CityPackage.City result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public exercise2.5CityPackage.City buildPartial() {
        exercise2.5CityPackage.City result = new exercise2.5CityPackage.City(this);
        result.cityName_ = cityName_;
        result.zipcode_ = zipcode_;
        result.country_ = country_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof exercise2.5CityPackage.City) {
          return mergeFrom((exercise2.5CityPackage.City)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(exercise2.5CityPackage.City other) {
        if (other == exercise2.5CityPackage.City.getDefaultInstance()) return this;
        if (!other.getCityName().isEmpty()) {
          cityName_ = other.cityName_;
          onChanged();
        }
        if (!other.getZipcode().isEmpty()) {
          zipcode_ = other.zipcode_;
          onChanged();
        }
        if (!other.getCountry().isEmpty()) {
          country_ = other.country_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        exercise2.5CityPackage.City parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (exercise2.5CityPackage.City) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object cityName_ = "";
      /**
       * <code>string city_name = 1;</code>
       * @return The cityName.
       */
      public java.lang.String getCityName() {
        java.lang.Object ref = cityName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          cityName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string city_name = 1;</code>
       * @return The bytes for cityName.
       */
      public com.google.protobuf.ByteString
          getCityNameBytes() {
        java.lang.Object ref = cityName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cityName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string city_name = 1;</code>
       * @param value The cityName to set.
       * @return This builder for chaining.
       */
      public Builder setCityName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        cityName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string city_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityName() {
        
        cityName_ = getDefaultInstance().getCityName();
        onChanged();
        return this;
      }
      /**
       * <code>string city_name = 1;</code>
       * @param value The bytes for cityName to set.
       * @return This builder for chaining.
       */
      public Builder setCityNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        cityName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object zipcode_ = "";
      /**
       * <code>string zipcode = 2;</code>
       * @return The zipcode.
       */
      public java.lang.String getZipcode() {
        java.lang.Object ref = zipcode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          zipcode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string zipcode = 2;</code>
       * @return The bytes for zipcode.
       */
      public com.google.protobuf.ByteString
          getZipcodeBytes() {
        java.lang.Object ref = zipcode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          zipcode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string zipcode = 2;</code>
       * @param value The zipcode to set.
       * @return This builder for chaining.
       */
      public Builder setZipcode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        zipcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string zipcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearZipcode() {
        
        zipcode_ = getDefaultInstance().getZipcode();
        onChanged();
        return this;
      }
      /**
       * <code>string zipcode = 2;</code>
       * @param value The bytes for zipcode to set.
       * @return This builder for chaining.
       */
      public Builder setZipcodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        zipcode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object country_ = "";
      /**
       * <code>string country = 3;</code>
       * @return The country.
       */
      public java.lang.String getCountry() {
        java.lang.Object ref = country_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          country_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string country = 3;</code>
       * @return The bytes for country.
       */
      public com.google.protobuf.ByteString
          getCountryBytes() {
        java.lang.Object ref = country_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          country_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string country = 3;</code>
       * @param value The country to set.
       * @return This builder for chaining.
       */
      public Builder setCountry(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        country_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string country = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCountry() {
        
        country_ = getDefaultInstance().getCountry();
        onChanged();
        return this;
      }
      /**
       * <code>string country = 3;</code>
       * @param value The bytes for country to set.
       * @return This builder for chaining.
       */
      public Builder setCountryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        country_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:exercise2.City)
    }

    // @@protoc_insertion_point(class_scope:exercise2.City)
    private static final exercise2.5CityPackage.City DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new exercise2.5CityPackage.City();
    }

    public static exercise2.5CityPackage.City getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<City>
        PARSER = new com.google.protobuf.AbstractParser<City>() {
      @java.lang.Override
      public City parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new City(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<City> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<City> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public exercise2.5CityPackage.City getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_exercise2_City_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_exercise2_City_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\0245-city-package.proto\022\texercise2\";\n\004Cit" +
      "y\022\021\n\tcity_name\030\001 \001(\t\022\017\n\007zipcode\030\002 \001(\t\022\017\n" +
      "\007country\030\003 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_exercise2_City_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_exercise2_City_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_exercise2_City_descriptor,
        new java.lang.String[] { "CityName", "Zipcode", "Country", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
