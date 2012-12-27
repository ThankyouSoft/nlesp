/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.thxsoft.vds.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResCreateContext implements org.apache.thrift.TBase<ResCreateContext, ResCreateContext._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResCreateContext");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CREATED_CONTEXT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("createdContextId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResCreateContextStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResCreateContextTupleSchemeFactory());
  }

  public ErrorDesc error; // required
  public long createdContextId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    CREATED_CONTEXT_ID((short)2, "createdContextId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR
          return ERROR;
        case 2: // CREATED_CONTEXT_ID
          return CREATED_CONTEXT_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATEDCONTEXTID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ErrorDesc.class)));
    tmpMap.put(_Fields.CREATED_CONTEXT_ID, new org.apache.thrift.meta_data.FieldMetaData("createdContextId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "ContextID")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResCreateContext.class, metaDataMap);
  }

  public ResCreateContext() {
  }

  public ResCreateContext(
    ErrorDesc error,
    long createdContextId)
  {
    this();
    this.error = error;
    this.createdContextId = createdContextId;
    setCreatedContextIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResCreateContext(ResCreateContext other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetError()) {
      this.error = new ErrorDesc(other.error);
    }
    this.createdContextId = other.createdContextId;
  }

  public ResCreateContext deepCopy() {
    return new ResCreateContext(this);
  }

  @Override
  public void clear() {
    this.error = null;
    setCreatedContextIdIsSet(false);
    this.createdContextId = 0;
  }

  public ErrorDesc getError() {
    return this.error;
  }

  public ResCreateContext setError(ErrorDesc error) {
    this.error = error;
    return this;
  }

  public void unsetError() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  public long getCreatedContextId() {
    return this.createdContextId;
  }

  public ResCreateContext setCreatedContextId(long createdContextId) {
    this.createdContextId = createdContextId;
    setCreatedContextIdIsSet(true);
    return this;
  }

  public void unsetCreatedContextId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDCONTEXTID_ISSET_ID);
  }

  /** Returns true if field createdContextId is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedContextId() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDCONTEXTID_ISSET_ID);
  }

  public void setCreatedContextIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDCONTEXTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((ErrorDesc)value);
      }
      break;

    case CREATED_CONTEXT_ID:
      if (value == null) {
        unsetCreatedContextId();
      } else {
        setCreatedContextId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return getError();

    case CREATED_CONTEXT_ID:
      return Long.valueOf(getCreatedContextId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR:
      return isSetError();
    case CREATED_CONTEXT_ID:
      return isSetCreatedContextId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResCreateContext)
      return this.equals((ResCreateContext)that);
    return false;
  }

  public boolean equals(ResCreateContext that) {
    if (that == null)
      return false;

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    boolean this_present_createdContextId = true;
    boolean that_present_createdContextId = true;
    if (this_present_createdContextId || that_present_createdContextId) {
      if (!(this_present_createdContextId && that_present_createdContextId))
        return false;
      if (this.createdContextId != that.createdContextId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ResCreateContext other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ResCreateContext typedOther = (ResCreateContext)other;

    lastComparison = Boolean.valueOf(isSetError()).compareTo(typedOther.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, typedOther.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatedContextId()).compareTo(typedOther.isSetCreatedContextId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedContextId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdContextId, typedOther.createdContextId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ResCreateContext(");
    boolean first = true;

    sb.append("error:");
    if (this.error == null) {
      sb.append("null");
    } else {
      sb.append(this.error);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdContextId:");
    sb.append(this.createdContextId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (error != null) {
      error.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResCreateContextStandardSchemeFactory implements SchemeFactory {
    public ResCreateContextStandardScheme getScheme() {
      return new ResCreateContextStandardScheme();
    }
  }

  private static class ResCreateContextStandardScheme extends StandardScheme<ResCreateContext> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResCreateContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.error = new ErrorDesc();
              struct.error.read(iprot);
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATED_CONTEXT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdContextId = iprot.readI64();
              struct.setCreatedContextIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResCreateContext struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.error != null) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        struct.error.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_CONTEXT_ID_FIELD_DESC);
      oprot.writeI64(struct.createdContextId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResCreateContextTupleSchemeFactory implements SchemeFactory {
    public ResCreateContextTupleScheme getScheme() {
      return new ResCreateContextTupleScheme();
    }
  }

  private static class ResCreateContextTupleScheme extends TupleScheme<ResCreateContext> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResCreateContext struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetError()) {
        optionals.set(0);
      }
      if (struct.isSetCreatedContextId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetError()) {
        struct.error.write(oprot);
      }
      if (struct.isSetCreatedContextId()) {
        oprot.writeI64(struct.createdContextId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResCreateContext struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.error = new ErrorDesc();
        struct.error.read(iprot);
        struct.setErrorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createdContextId = iprot.readI64();
        struct.setCreatedContextIdIsSet(true);
      }
    }
  }

}
