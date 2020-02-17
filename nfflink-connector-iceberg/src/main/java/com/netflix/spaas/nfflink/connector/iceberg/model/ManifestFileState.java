/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.netflix.spaas.nfflink.connector.iceberg.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ManifestFileState extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3708902626886463535L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ManifestFileState\",\"namespace\":\"com.netflix.spaas.nfflink.connector.iceberg.model\",\"fields\":[{\"name\":\"path\",\"type\":\"string\"},{\"name\":\"length\",\"type\":\"long\"},{\"name\":\"specId\",\"type\":\"int\"},{\"name\":\"checkpointId\",\"type\":\"long\"},{\"name\":\"checkpointTimestamp\",\"type\":\"long\"},{\"name\":\"dataFileCount\",\"type\":\"long\"},{\"name\":\"recordCount\",\"type\":\"long\"},{\"name\":\"byteCount\",\"type\":\"long\"},{\"name\":\"lowWatermark\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"highWatermark\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ManifestFileState> ENCODER =
      new BinaryMessageEncoder<ManifestFileState>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ManifestFileState> DECODER =
      new BinaryMessageDecoder<ManifestFileState>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ManifestFileState> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ManifestFileState> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ManifestFileState>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ManifestFileState to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ManifestFileState from a ByteBuffer. */
  public static ManifestFileState fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence path;
  @Deprecated public long length;
  @Deprecated public int specId;
  @Deprecated public long checkpointId;
  @Deprecated public long checkpointTimestamp;
  @Deprecated public long dataFileCount;
  @Deprecated public long recordCount;
  @Deprecated public long byteCount;
  @Deprecated public java.lang.Long lowWatermark;
  @Deprecated public java.lang.Long highWatermark;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ManifestFileState() {}

  /**
   * All-args constructor.
   * @param path The new value for path
   * @param length The new value for length
   * @param specId The new value for specId
   * @param checkpointId The new value for checkpointId
   * @param checkpointTimestamp The new value for checkpointTimestamp
   * @param dataFileCount The new value for dataFileCount
   * @param recordCount The new value for recordCount
   * @param byteCount The new value for byteCount
   * @param lowWatermark The new value for lowWatermark
   * @param highWatermark The new value for highWatermark
   */
  public ManifestFileState(java.lang.CharSequence path, java.lang.Long length, java.lang.Integer specId, java.lang.Long checkpointId, java.lang.Long checkpointTimestamp, java.lang.Long dataFileCount, java.lang.Long recordCount, java.lang.Long byteCount, java.lang.Long lowWatermark, java.lang.Long highWatermark) {
    this.path = path;
    this.length = length;
    this.specId = specId;
    this.checkpointId = checkpointId;
    this.checkpointTimestamp = checkpointTimestamp;
    this.dataFileCount = dataFileCount;
    this.recordCount = recordCount;
    this.byteCount = byteCount;
    this.lowWatermark = lowWatermark;
    this.highWatermark = highWatermark;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return path;
    case 1: return length;
    case 2: return specId;
    case 3: return checkpointId;
    case 4: return checkpointTimestamp;
    case 5: return dataFileCount;
    case 6: return recordCount;
    case 7: return byteCount;
    case 8: return lowWatermark;
    case 9: return highWatermark;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: path = (java.lang.CharSequence)value$; break;
    case 1: length = (java.lang.Long)value$; break;
    case 2: specId = (java.lang.Integer)value$; break;
    case 3: checkpointId = (java.lang.Long)value$; break;
    case 4: checkpointTimestamp = (java.lang.Long)value$; break;
    case 5: dataFileCount = (java.lang.Long)value$; break;
    case 6: recordCount = (java.lang.Long)value$; break;
    case 7: byteCount = (java.lang.Long)value$; break;
    case 8: lowWatermark = (java.lang.Long)value$; break;
    case 9: highWatermark = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'path' field.
   * @return The value of the 'path' field.
   */
  public java.lang.CharSequence getPath() {
    return path;
  }

  /**
   * Sets the value of the 'path' field.
   * @param value the value to set.
   */
  public void setPath(java.lang.CharSequence value) {
    this.path = value;
  }

  /**
   * Gets the value of the 'length' field.
   * @return The value of the 'length' field.
   */
  public java.lang.Long getLength() {
    return length;
  }

  /**
   * Sets the value of the 'length' field.
   * @param value the value to set.
   */
  public void setLength(java.lang.Long value) {
    this.length = value;
  }

  /**
   * Gets the value of the 'specId' field.
   * @return The value of the 'specId' field.
   */
  public java.lang.Integer getSpecId() {
    return specId;
  }

  /**
   * Sets the value of the 'specId' field.
   * @param value the value to set.
   */
  public void setSpecId(java.lang.Integer value) {
    this.specId = value;
  }

  /**
   * Gets the value of the 'checkpointId' field.
   * @return The value of the 'checkpointId' field.
   */
  public java.lang.Long getCheckpointId() {
    return checkpointId;
  }

  /**
   * Sets the value of the 'checkpointId' field.
   * @param value the value to set.
   */
  public void setCheckpointId(java.lang.Long value) {
    this.checkpointId = value;
  }

  /**
   * Gets the value of the 'checkpointTimestamp' field.
   * @return The value of the 'checkpointTimestamp' field.
   */
  public java.lang.Long getCheckpointTimestamp() {
    return checkpointTimestamp;
  }

  /**
   * Sets the value of the 'checkpointTimestamp' field.
   * @param value the value to set.
   */
  public void setCheckpointTimestamp(java.lang.Long value) {
    this.checkpointTimestamp = value;
  }

  /**
   * Gets the value of the 'dataFileCount' field.
   * @return The value of the 'dataFileCount' field.
   */
  public java.lang.Long getDataFileCount() {
    return dataFileCount;
  }

  /**
   * Sets the value of the 'dataFileCount' field.
   * @param value the value to set.
   */
  public void setDataFileCount(java.lang.Long value) {
    this.dataFileCount = value;
  }

  /**
   * Gets the value of the 'recordCount' field.
   * @return The value of the 'recordCount' field.
   */
  public java.lang.Long getRecordCount() {
    return recordCount;
  }

  /**
   * Sets the value of the 'recordCount' field.
   * @param value the value to set.
   */
  public void setRecordCount(java.lang.Long value) {
    this.recordCount = value;
  }

  /**
   * Gets the value of the 'byteCount' field.
   * @return The value of the 'byteCount' field.
   */
  public java.lang.Long getByteCount() {
    return byteCount;
  }

  /**
   * Sets the value of the 'byteCount' field.
   * @param value the value to set.
   */
  public void setByteCount(java.lang.Long value) {
    this.byteCount = value;
  }

  /**
   * Gets the value of the 'lowWatermark' field.
   * @return The value of the 'lowWatermark' field.
   */
  public java.lang.Long getLowWatermark() {
    return lowWatermark;
  }

  /**
   * Sets the value of the 'lowWatermark' field.
   * @param value the value to set.
   */
  public void setLowWatermark(java.lang.Long value) {
    this.lowWatermark = value;
  }

  /**
   * Gets the value of the 'highWatermark' field.
   * @return The value of the 'highWatermark' field.
   */
  public java.lang.Long getHighWatermark() {
    return highWatermark;
  }

  /**
   * Sets the value of the 'highWatermark' field.
   * @param value the value to set.
   */
  public void setHighWatermark(java.lang.Long value) {
    this.highWatermark = value;
  }

  /**
   * Creates a new ManifestFileState RecordBuilder.
   * @return A new ManifestFileState RecordBuilder
   */
  public static com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder newBuilder() {
    return new com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder();
  }

  /**
   * Creates a new ManifestFileState RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ManifestFileState RecordBuilder
   */
  public static com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder newBuilder(com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder other) {
    return new com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder(other);
  }

  /**
   * Creates a new ManifestFileState RecordBuilder by copying an existing ManifestFileState instance.
   * @param other The existing instance to copy.
   * @return A new ManifestFileState RecordBuilder
   */
  public static com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder newBuilder(com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState other) {
    return new com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder(other);
  }

  /**
   * RecordBuilder for ManifestFileState instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ManifestFileState>
    implements org.apache.avro.data.RecordBuilder<ManifestFileState> {

    private java.lang.CharSequence path;
    private long length;
    private int specId;
    private long checkpointId;
    private long checkpointTimestamp;
    private long dataFileCount;
    private long recordCount;
    private long byteCount;
    private java.lang.Long lowWatermark;
    private java.lang.Long highWatermark;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.path)) {
        this.path = data().deepCopy(fields()[0].schema(), other.path);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.length)) {
        this.length = data().deepCopy(fields()[1].schema(), other.length);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specId)) {
        this.specId = data().deepCopy(fields()[2].schema(), other.specId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.checkpointId)) {
        this.checkpointId = data().deepCopy(fields()[3].schema(), other.checkpointId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.checkpointTimestamp)) {
        this.checkpointTimestamp = data().deepCopy(fields()[4].schema(), other.checkpointTimestamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dataFileCount)) {
        this.dataFileCount = data().deepCopy(fields()[5].schema(), other.dataFileCount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.recordCount)) {
        this.recordCount = data().deepCopy(fields()[6].schema(), other.recordCount);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.byteCount)) {
        this.byteCount = data().deepCopy(fields()[7].schema(), other.byteCount);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.lowWatermark)) {
        this.lowWatermark = data().deepCopy(fields()[8].schema(), other.lowWatermark);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.highWatermark)) {
        this.highWatermark = data().deepCopy(fields()[9].schema(), other.highWatermark);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ManifestFileState instance
     * @param other The existing instance to copy.
     */
    private Builder(com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.path)) {
        this.path = data().deepCopy(fields()[0].schema(), other.path);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.length)) {
        this.length = data().deepCopy(fields()[1].schema(), other.length);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specId)) {
        this.specId = data().deepCopy(fields()[2].schema(), other.specId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.checkpointId)) {
        this.checkpointId = data().deepCopy(fields()[3].schema(), other.checkpointId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.checkpointTimestamp)) {
        this.checkpointTimestamp = data().deepCopy(fields()[4].schema(), other.checkpointTimestamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dataFileCount)) {
        this.dataFileCount = data().deepCopy(fields()[5].schema(), other.dataFileCount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.recordCount)) {
        this.recordCount = data().deepCopy(fields()[6].schema(), other.recordCount);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.byteCount)) {
        this.byteCount = data().deepCopy(fields()[7].schema(), other.byteCount);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.lowWatermark)) {
        this.lowWatermark = data().deepCopy(fields()[8].schema(), other.lowWatermark);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.highWatermark)) {
        this.highWatermark = data().deepCopy(fields()[9].schema(), other.highWatermark);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'path' field.
      * @return The value.
      */
    public java.lang.CharSequence getPath() {
      return path;
    }

    /**
      * Sets the value of the 'path' field.
      * @param value The value of 'path'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setPath(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.path = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'path' field has been set.
      * @return True if the 'path' field has been set, false otherwise.
      */
    public boolean hasPath() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'path' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearPath() {
      path = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'length' field.
      * @return The value.
      */
    public java.lang.Long getLength() {
      return length;
    }

    /**
      * Sets the value of the 'length' field.
      * @param value The value of 'length'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setLength(long value) {
      validate(fields()[1], value);
      this.length = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'length' field has been set.
      * @return True if the 'length' field has been set, false otherwise.
      */
    public boolean hasLength() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'length' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearLength() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'specId' field.
      * @return The value.
      */
    public java.lang.Integer getSpecId() {
      return specId;
    }

    /**
      * Sets the value of the 'specId' field.
      * @param value The value of 'specId'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setSpecId(int value) {
      validate(fields()[2], value);
      this.specId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'specId' field has been set.
      * @return True if the 'specId' field has been set, false otherwise.
      */
    public boolean hasSpecId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'specId' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearSpecId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'checkpointId' field.
      * @return The value.
      */
    public java.lang.Long getCheckpointId() {
      return checkpointId;
    }

    /**
      * Sets the value of the 'checkpointId' field.
      * @param value The value of 'checkpointId'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setCheckpointId(long value) {
      validate(fields()[3], value);
      this.checkpointId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'checkpointId' field has been set.
      * @return True if the 'checkpointId' field has been set, false otherwise.
      */
    public boolean hasCheckpointId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'checkpointId' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearCheckpointId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'checkpointTimestamp' field.
      * @return The value.
      */
    public java.lang.Long getCheckpointTimestamp() {
      return checkpointTimestamp;
    }

    /**
      * Sets the value of the 'checkpointTimestamp' field.
      * @param value The value of 'checkpointTimestamp'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setCheckpointTimestamp(long value) {
      validate(fields()[4], value);
      this.checkpointTimestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'checkpointTimestamp' field has been set.
      * @return True if the 'checkpointTimestamp' field has been set, false otherwise.
      */
    public boolean hasCheckpointTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'checkpointTimestamp' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearCheckpointTimestamp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataFileCount' field.
      * @return The value.
      */
    public java.lang.Long getDataFileCount() {
      return dataFileCount;
    }

    /**
      * Sets the value of the 'dataFileCount' field.
      * @param value The value of 'dataFileCount'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setDataFileCount(long value) {
      validate(fields()[5], value);
      this.dataFileCount = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'dataFileCount' field has been set.
      * @return True if the 'dataFileCount' field has been set, false otherwise.
      */
    public boolean hasDataFileCount() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'dataFileCount' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearDataFileCount() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'recordCount' field.
      * @return The value.
      */
    public java.lang.Long getRecordCount() {
      return recordCount;
    }

    /**
      * Sets the value of the 'recordCount' field.
      * @param value The value of 'recordCount'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setRecordCount(long value) {
      validate(fields()[6], value);
      this.recordCount = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'recordCount' field has been set.
      * @return True if the 'recordCount' field has been set, false otherwise.
      */
    public boolean hasRecordCount() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'recordCount' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearRecordCount() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'byteCount' field.
      * @return The value.
      */
    public java.lang.Long getByteCount() {
      return byteCount;
    }

    /**
      * Sets the value of the 'byteCount' field.
      * @param value The value of 'byteCount'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setByteCount(long value) {
      validate(fields()[7], value);
      this.byteCount = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'byteCount' field has been set.
      * @return True if the 'byteCount' field has been set, false otherwise.
      */
    public boolean hasByteCount() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'byteCount' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearByteCount() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'lowWatermark' field.
      * @return The value.
      */
    public java.lang.Long getLowWatermark() {
      return lowWatermark;
    }

    /**
      * Sets the value of the 'lowWatermark' field.
      * @param value The value of 'lowWatermark'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setLowWatermark(java.lang.Long value) {
      validate(fields()[8], value);
      this.lowWatermark = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'lowWatermark' field has been set.
      * @return True if the 'lowWatermark' field has been set, false otherwise.
      */
    public boolean hasLowWatermark() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'lowWatermark' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearLowWatermark() {
      lowWatermark = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'highWatermark' field.
      * @return The value.
      */
    public java.lang.Long getHighWatermark() {
      return highWatermark;
    }

    /**
      * Sets the value of the 'highWatermark' field.
      * @param value The value of 'highWatermark'.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder setHighWatermark(java.lang.Long value) {
      validate(fields()[9], value);
      this.highWatermark = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'highWatermark' field has been set.
      * @return True if the 'highWatermark' field has been set, false otherwise.
      */
    public boolean hasHighWatermark() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'highWatermark' field.
      * @return This builder.
      */
    public com.netflix.spaas.nfflink.connector.iceberg.model.ManifestFileState.Builder clearHighWatermark() {
      highWatermark = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ManifestFileState build() {
      try {
        ManifestFileState record = new ManifestFileState();
        record.path = fieldSetFlags()[0] ? this.path : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.length = fieldSetFlags()[1] ? this.length : (java.lang.Long) defaultValue(fields()[1]);
        record.specId = fieldSetFlags()[2] ? this.specId : (java.lang.Integer) defaultValue(fields()[2]);
        record.checkpointId = fieldSetFlags()[3] ? this.checkpointId : (java.lang.Long) defaultValue(fields()[3]);
        record.checkpointTimestamp = fieldSetFlags()[4] ? this.checkpointTimestamp : (java.lang.Long) defaultValue(fields()[4]);
        record.dataFileCount = fieldSetFlags()[5] ? this.dataFileCount : (java.lang.Long) defaultValue(fields()[5]);
        record.recordCount = fieldSetFlags()[6] ? this.recordCount : (java.lang.Long) defaultValue(fields()[6]);
        record.byteCount = fieldSetFlags()[7] ? this.byteCount : (java.lang.Long) defaultValue(fields()[7]);
        record.lowWatermark = fieldSetFlags()[8] ? this.lowWatermark : (java.lang.Long) defaultValue(fields()[8]);
        record.highWatermark = fieldSetFlags()[9] ? this.highWatermark : (java.lang.Long) defaultValue(fields()[9]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ManifestFileState>
    WRITER$ = (org.apache.avro.io.DatumWriter<ManifestFileState>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ManifestFileState>
    READER$ = (org.apache.avro.io.DatumReader<ManifestFileState>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
