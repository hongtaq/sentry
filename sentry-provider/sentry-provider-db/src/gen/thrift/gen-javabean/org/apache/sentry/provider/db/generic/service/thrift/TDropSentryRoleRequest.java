/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.generic.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-02")
public class TDropSentryRoleRequest implements org.apache.thrift.TBase<TDropSentryRoleRequest, TDropSentryRoleRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TDropSentryRoleRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDropSentryRoleRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REQUESTOR_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestorUserName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COMPONENT_FIELD_DESC = new org.apache.thrift.protocol.TField("component", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDropSentryRoleRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDropSentryRoleRequestTupleSchemeFactory());
  }

  private int protocol_version; // required
  private String requestorUserName; // required
  private String roleName; // required
  private String component; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROTOCOL_VERSION((short)1, "protocol_version"),
    REQUESTOR_USER_NAME((short)2, "requestorUserName"),
    ROLE_NAME((short)3, "roleName"),
    COMPONENT((short)4, "component");

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
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // REQUESTOR_USER_NAME
          return REQUESTOR_USER_NAME;
        case 3: // ROLE_NAME
          return ROLE_NAME;
        case 4: // COMPONENT
          return COMPONENT;
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
  private static final int __PROTOCOL_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUESTOR_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("requestorUserName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPONENT, new org.apache.thrift.meta_data.FieldMetaData("component", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDropSentryRoleRequest.class, metaDataMap);
  }

  public TDropSentryRoleRequest() {
    this.protocol_version = 2;

  }

  public TDropSentryRoleRequest(
    int protocol_version,
    String requestorUserName,
    String roleName,
    String component)
  {
    this();
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    this.requestorUserName = requestorUserName;
    this.roleName = roleName;
    this.component = component;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDropSentryRoleRequest(TDropSentryRoleRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.protocol_version = other.protocol_version;
    if (other.isSetRequestorUserName()) {
      this.requestorUserName = other.requestorUserName;
    }
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetComponent()) {
      this.component = other.component;
    }
  }

  public TDropSentryRoleRequest deepCopy() {
    return new TDropSentryRoleRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = 2;

    this.requestorUserName = null;
    this.roleName = null;
    this.component = null;
  }

  public int getProtocol_version() {
    return this.protocol_version;
  }

  public void setProtocol_version(int protocol_version) {
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
  }

  public void unsetProtocol_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return EncodingUtils.testBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  public void setProtocol_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID, value);
  }

  public String getRequestorUserName() {
    return this.requestorUserName;
  }

  public void setRequestorUserName(String requestorUserName) {
    this.requestorUserName = requestorUserName;
  }

  public void unsetRequestorUserName() {
    this.requestorUserName = null;
  }

  /** Returns true if field requestorUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestorUserName() {
    return this.requestorUserName != null;
  }

  public void setRequestorUserNameIsSet(boolean value) {
    if (!value) {
      this.requestorUserName = null;
    }
  }

  public String getRoleName() {
    return this.roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public String getComponent() {
    return this.component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public void unsetComponent() {
    this.component = null;
  }

  /** Returns true if field component is set (has been assigned a value) and false otherwise */
  public boolean isSetComponent() {
    return this.component != null;
  }

  public void setComponentIsSet(boolean value) {
    if (!value) {
      this.component = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((Integer)value);
      }
      break;

    case REQUESTOR_USER_NAME:
      if (value == null) {
        unsetRequestorUserName();
      } else {
        setRequestorUserName((String)value);
      }
      break;

    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case COMPONENT:
      if (value == null) {
        unsetComponent();
      } else {
        setComponent((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case REQUESTOR_USER_NAME:
      return getRequestorUserName();

    case ROLE_NAME:
      return getRoleName();

    case COMPONENT:
      return getComponent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case REQUESTOR_USER_NAME:
      return isSetRequestorUserName();
    case ROLE_NAME:
      return isSetRoleName();
    case COMPONENT:
      return isSetComponent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDropSentryRoleRequest)
      return this.equals((TDropSentryRoleRequest)that);
    return false;
  }

  public boolean equals(TDropSentryRoleRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true;
    boolean that_present_protocol_version = true;
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (this.protocol_version != that.protocol_version)
        return false;
    }

    boolean this_present_requestorUserName = true && this.isSetRequestorUserName();
    boolean that_present_requestorUserName = true && that.isSetRequestorUserName();
    if (this_present_requestorUserName || that_present_requestorUserName) {
      if (!(this_present_requestorUserName && that_present_requestorUserName))
        return false;
      if (!this.requestorUserName.equals(that.requestorUserName))
        return false;
    }

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_component = true && this.isSetComponent();
    boolean that_present_component = true && that.isSetComponent();
    if (this_present_component || that_present_component) {
      if (!(this_present_component && that_present_component))
        return false;
      if (!this.component.equals(that.component))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true;
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version);

    boolean present_requestorUserName = true && (isSetRequestorUserName());
    list.add(present_requestorUserName);
    if (present_requestorUserName)
      list.add(requestorUserName);

    boolean present_roleName = true && (isSetRoleName());
    list.add(present_roleName);
    if (present_roleName)
      list.add(roleName);

    boolean present_component = true && (isSetComponent());
    list.add(present_component);
    if (present_component)
      list.add(component);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDropSentryRoleRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestorUserName()).compareTo(other.isSetRequestorUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestorUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestorUserName, other.requestorUserName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(other.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, other.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComponent()).compareTo(other.isSetComponent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComponent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.component, other.component);
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
    StringBuilder sb = new StringBuilder("TDropSentryRoleRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    sb.append(this.protocol_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestorUserName:");
    if (this.requestorUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.requestorUserName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("component:");
    if (this.component == null) {
      sb.append("null");
    } else {
      sb.append(this.component);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProtocol_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' is unset! Struct:" + toString());
    }

    if (!isSetRequestorUserName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestorUserName' is unset! Struct:" + toString());
    }

    if (!isSetRoleName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'roleName' is unset! Struct:" + toString());
    }

    if (!isSetComponent()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'component' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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

  private static class TDropSentryRoleRequestStandardSchemeFactory implements SchemeFactory {
    public TDropSentryRoleRequestStandardScheme getScheme() {
      return new TDropSentryRoleRequestStandardScheme();
    }
  }

  private static class TDropSentryRoleRequestStandardScheme extends StandardScheme<TDropSentryRoleRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDropSentryRoleRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = iprot.readI32();
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUESTOR_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestorUserName = iprot.readString();
              struct.setRequestorUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMPONENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.component = iprot.readString();
              struct.setComponentIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDropSentryRoleRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
      oprot.writeI32(struct.protocol_version);
      oprot.writeFieldEnd();
      if (struct.requestorUserName != null) {
        oprot.writeFieldBegin(REQUESTOR_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.requestorUserName);
        oprot.writeFieldEnd();
      }
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.component != null) {
        oprot.writeFieldBegin(COMPONENT_FIELD_DESC);
        oprot.writeString(struct.component);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDropSentryRoleRequestTupleSchemeFactory implements SchemeFactory {
    public TDropSentryRoleRequestTupleScheme getScheme() {
      return new TDropSentryRoleRequestTupleScheme();
    }
  }

  private static class TDropSentryRoleRequestTupleScheme extends TupleScheme<TDropSentryRoleRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDropSentryRoleRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version);
      oprot.writeString(struct.requestorUserName);
      oprot.writeString(struct.roleName);
      oprot.writeString(struct.component);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDropSentryRoleRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = iprot.readI32();
      struct.setProtocol_versionIsSet(true);
      struct.requestorUserName = iprot.readString();
      struct.setRequestorUserNameIsSet(true);
      struct.roleName = iprot.readString();
      struct.setRoleNameIsSet(true);
      struct.component = iprot.readString();
      struct.setComponentIsSet(true);
    }
  }

}

