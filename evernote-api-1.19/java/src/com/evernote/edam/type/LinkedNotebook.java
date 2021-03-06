/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * A link in an users account that refers them to a public or individual share in
 * another user's account.
 * 
 * <dl>
 * <dt>shareName</dt>
 * <dd>the display name of the shared notebook.
 *   The link owner can change this.</dd>
 * 
 * <dt>username</dt>
 * <dd>the username of the user who owns the shared or public notebook</dd>
 * 
 * <dt>shardId</dt>
 * <dd>the shard ID of the notebook if the notebook is not public</dt>
 * 
 * <dt>shareKey</dt>
 * <dd>the secret key that provides access to the shared notebook</dd>
 * 
 * <dt>uri</dt>
 * <dd>the identifier of the public notebook</dd>
 * 
 * <dt>guid</dt>
 *   <dd>The unique identifier of this linked notebook.  Will be set whenever
 *   a resource is retrieved from the service, but may be null when a client
 *   is creating a resource.
 *   <br/>
 *   Length:  EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
 *   <br/>
 *   Regex:  EDAM_GUID_REGEX
 *   </dd>
 * 
 * <dt>updateSequenceNum</dt>
 *   <dd>A number identifying the last transaction to
 *   modify the state of this object.  The USN values are sequential within an
 *   account, and can be used to compare the order of modifications within the
 *   service.
 *   </dd>
 * </dl>
 */
public class LinkedNotebook implements TBase<LinkedNotebook, LinkedNotebook._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LinkedNotebook");

  private static final TField SHARE_NAME_FIELD_DESC = new TField("shareName", TType.STRING, (short)2);
  private static final TField USERNAME_FIELD_DESC = new TField("username", TType.STRING, (short)3);
  private static final TField SHARD_ID_FIELD_DESC = new TField("shardId", TType.STRING, (short)4);
  private static final TField SHARE_KEY_FIELD_DESC = new TField("shareKey", TType.STRING, (short)5);
  private static final TField URI_FIELD_DESC = new TField("uri", TType.STRING, (short)6);
  private static final TField GUID_FIELD_DESC = new TField("guid", TType.STRING, (short)7);
  private static final TField UPDATE_SEQUENCE_NUM_FIELD_DESC = new TField("updateSequenceNum", TType.I32, (short)8);

  private String shareName;
  private String username;
  private String shardId;
  private String shareKey;
  private String uri;
  private String guid;
  private int updateSequenceNum;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SHARE_NAME((short)2, "shareName"),
    USERNAME((short)3, "username"),
    SHARD_ID((short)4, "shardId"),
    SHARE_KEY((short)5, "shareKey"),
    URI((short)6, "uri"),
    GUID((short)7, "guid"),
    UPDATE_SEQUENCE_NUM((short)8, "updateSequenceNum");

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
        case 2: // SHARE_NAME
          return SHARE_NAME;
        case 3: // USERNAME
          return USERNAME;
        case 4: // SHARD_ID
          return SHARD_ID;
        case 5: // SHARE_KEY
          return SHARE_KEY;
        case 6: // URI
          return URI;
        case 7: // GUID
          return GUID;
        case 8: // UPDATE_SEQUENCE_NUM
          return UPDATE_SEQUENCE_NUM;
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
  private static final int __UPDATESEQUENCENUM_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SHARE_NAME, new FieldMetaData("shareName", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.USERNAME, new FieldMetaData("username", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SHARD_ID, new FieldMetaData("shardId", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SHARE_KEY, new FieldMetaData("shareKey", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.URI, new FieldMetaData("uri", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.GUID, new FieldMetaData("guid", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING        , "Guid")));
    tmpMap.put(_Fields.UPDATE_SEQUENCE_NUM, new FieldMetaData("updateSequenceNum", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(LinkedNotebook.class, metaDataMap);
  }

  public LinkedNotebook() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LinkedNotebook(LinkedNotebook other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetShareName()) {
      this.shareName = other.shareName;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetShardId()) {
      this.shardId = other.shardId;
    }
    if (other.isSetShareKey()) {
      this.shareKey = other.shareKey;
    }
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
    if (other.isSetGuid()) {
      this.guid = other.guid;
    }
    this.updateSequenceNum = other.updateSequenceNum;
  }

  public LinkedNotebook deepCopy() {
    return new LinkedNotebook(this);
  }

  public void clear() {
    this.shareName = null;
    this.username = null;
    this.shardId = null;
    this.shareKey = null;
    this.uri = null;
    this.guid = null;
    setUpdateSequenceNumIsSet(false);
    this.updateSequenceNum = 0;
  }

  public String getShareName() {
    return this.shareName;
  }

  public void setShareName(String shareName) {
    this.shareName = shareName;
  }

  public void unsetShareName() {
    this.shareName = null;
  }

  /** Returns true if field shareName is set (has been asigned a value) and false otherwise */
  public boolean isSetShareName() {
    return this.shareName != null;
  }

  public void setShareNameIsSet(boolean value) {
    if (!value) {
      this.shareName = null;
    }
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been asigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getShardId() {
    return this.shardId;
  }

  public void setShardId(String shardId) {
    this.shardId = shardId;
  }

  public void unsetShardId() {
    this.shardId = null;
  }

  /** Returns true if field shardId is set (has been asigned a value) and false otherwise */
  public boolean isSetShardId() {
    return this.shardId != null;
  }

  public void setShardIdIsSet(boolean value) {
    if (!value) {
      this.shardId = null;
    }
  }

  public String getShareKey() {
    return this.shareKey;
  }

  public void setShareKey(String shareKey) {
    this.shareKey = shareKey;
  }

  public void unsetShareKey() {
    this.shareKey = null;
  }

  /** Returns true if field shareKey is set (has been asigned a value) and false otherwise */
  public boolean isSetShareKey() {
    return this.shareKey != null;
  }

  public void setShareKeyIsSet(boolean value) {
    if (!value) {
      this.shareKey = null;
    }
  }

  public String getUri() {
    return this.uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public void unsetUri() {
    this.uri = null;
  }

  /** Returns true if field uri is set (has been asigned a value) and false otherwise */
  public boolean isSetUri() {
    return this.uri != null;
  }

  public void setUriIsSet(boolean value) {
    if (!value) {
      this.uri = null;
    }
  }

  public String getGuid() {
    return this.guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public void unsetGuid() {
    this.guid = null;
  }

  /** Returns true if field guid is set (has been asigned a value) and false otherwise */
  public boolean isSetGuid() {
    return this.guid != null;
  }

  public void setGuidIsSet(boolean value) {
    if (!value) {
      this.guid = null;
    }
  }

  public int getUpdateSequenceNum() {
    return this.updateSequenceNum;
  }

  public void setUpdateSequenceNum(int updateSequenceNum) {
    this.updateSequenceNum = updateSequenceNum;
    setUpdateSequenceNumIsSet(true);
  }

  public void unsetUpdateSequenceNum() {
    __isset_vector[__UPDATESEQUENCENUM_ISSET_ID] = false;
  }

  /** Returns true if field updateSequenceNum is set (has been asigned a value) and false otherwise */
  public boolean isSetUpdateSequenceNum() {
    return __isset_vector[__UPDATESEQUENCENUM_ISSET_ID];
  }

  public void setUpdateSequenceNumIsSet(boolean value) {
    __isset_vector[__UPDATESEQUENCENUM_ISSET_ID] = value;
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SHARE_NAME:
      if (value == null) {
        unsetShareName();
      } else {
        setShareName((String)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case SHARD_ID:
      if (value == null) {
        unsetShardId();
      } else {
        setShardId((String)value);
      }
      break;

    case SHARE_KEY:
      if (value == null) {
        unsetShareKey();
      } else {
        setShareKey((String)value);
      }
      break;

    case URI:
      if (value == null) {
        unsetUri();
      } else {
        setUri((String)value);
      }
      break;

    case GUID:
      if (value == null) {
        unsetGuid();
      } else {
        setGuid((String)value);
      }
      break;

    case UPDATE_SEQUENCE_NUM:
      if (value == null) {
        unsetUpdateSequenceNum();
      } else {
        setUpdateSequenceNum((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SHARE_NAME:
      return getShareName();

    case USERNAME:
      return getUsername();

    case SHARD_ID:
      return getShardId();

    case SHARE_KEY:
      return getShareKey();

    case URI:
      return getUri();

    case GUID:
      return getGuid();

    case UPDATE_SEQUENCE_NUM:
      return new Integer(getUpdateSequenceNum());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SHARE_NAME:
      return isSetShareName();
    case USERNAME:
      return isSetUsername();
    case SHARD_ID:
      return isSetShardId();
    case SHARE_KEY:
      return isSetShareKey();
    case URI:
      return isSetUri();
    case GUID:
      return isSetGuid();
    case UPDATE_SEQUENCE_NUM:
      return isSetUpdateSequenceNum();
    }
    throw new IllegalStateException();
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LinkedNotebook)
      return this.equals((LinkedNotebook)that);
    return false;
  }

  public boolean equals(LinkedNotebook that) {
    if (that == null)
      return false;

    boolean this_present_shareName = true && this.isSetShareName();
    boolean that_present_shareName = true && that.isSetShareName();
    if (this_present_shareName || that_present_shareName) {
      if (!(this_present_shareName && that_present_shareName))
        return false;
      if (!this.shareName.equals(that.shareName))
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_shardId = true && this.isSetShardId();
    boolean that_present_shardId = true && that.isSetShardId();
    if (this_present_shardId || that_present_shardId) {
      if (!(this_present_shardId && that_present_shardId))
        return false;
      if (!this.shardId.equals(that.shardId))
        return false;
    }

    boolean this_present_shareKey = true && this.isSetShareKey();
    boolean that_present_shareKey = true && that.isSetShareKey();
    if (this_present_shareKey || that_present_shareKey) {
      if (!(this_present_shareKey && that_present_shareKey))
        return false;
      if (!this.shareKey.equals(that.shareKey))
        return false;
    }

    boolean this_present_uri = true && this.isSetUri();
    boolean that_present_uri = true && that.isSetUri();
    if (this_present_uri || that_present_uri) {
      if (!(this_present_uri && that_present_uri))
        return false;
      if (!this.uri.equals(that.uri))
        return false;
    }

    boolean this_present_guid = true && this.isSetGuid();
    boolean that_present_guid = true && that.isSetGuid();
    if (this_present_guid || that_present_guid) {
      if (!(this_present_guid && that_present_guid))
        return false;
      if (!this.guid.equals(that.guid))
        return false;
    }

    boolean this_present_updateSequenceNum = true && this.isSetUpdateSequenceNum();
    boolean that_present_updateSequenceNum = true && that.isSetUpdateSequenceNum();
    if (this_present_updateSequenceNum || that_present_updateSequenceNum) {
      if (!(this_present_updateSequenceNum && that_present_updateSequenceNum))
        return false;
      if (this.updateSequenceNum != that.updateSequenceNum)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(LinkedNotebook other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LinkedNotebook typedOther = (LinkedNotebook)other;

    lastComparison = Boolean.valueOf(isSetShareName()).compareTo(typedOther.isSetShareName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShareName()) {      lastComparison = TBaseHelper.compareTo(this.shareName, typedOther.shareName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(typedOther.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {      lastComparison = TBaseHelper.compareTo(this.username, typedOther.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShardId()).compareTo(typedOther.isSetShardId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShardId()) {      lastComparison = TBaseHelper.compareTo(this.shardId, typedOther.shardId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShareKey()).compareTo(typedOther.isSetShareKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShareKey()) {      lastComparison = TBaseHelper.compareTo(this.shareKey, typedOther.shareKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUri()).compareTo(typedOther.isSetUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUri()) {      lastComparison = TBaseHelper.compareTo(this.uri, typedOther.uri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuid()).compareTo(typedOther.isSetGuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuid()) {      lastComparison = TBaseHelper.compareTo(this.guid, typedOther.guid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateSequenceNum()).compareTo(typedOther.isSetUpdateSequenceNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateSequenceNum()) {      lastComparison = TBaseHelper.compareTo(this.updateSequenceNum, typedOther.updateSequenceNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 2: // SHARE_NAME
          if (field.type == TType.STRING) {
            this.shareName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // USERNAME
          if (field.type == TType.STRING) {
            this.username = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SHARD_ID
          if (field.type == TType.STRING) {
            this.shardId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SHARE_KEY
          if (field.type == TType.STRING) {
            this.shareKey = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // URI
          if (field.type == TType.STRING) {
            this.uri = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // GUID
          if (field.type == TType.STRING) {
            this.guid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // UPDATE_SEQUENCE_NUM
          if (field.type == TType.I32) {
            this.updateSequenceNum = iprot.readI32();
            setUpdateSequenceNumIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.shareName != null) {
      if (isSetShareName()) {
        oprot.writeFieldBegin(SHARE_NAME_FIELD_DESC);
        oprot.writeString(this.shareName);
        oprot.writeFieldEnd();
      }
    }
    if (this.username != null) {
      if (isSetUsername()) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(this.username);
        oprot.writeFieldEnd();
      }
    }
    if (this.shardId != null) {
      if (isSetShardId()) {
        oprot.writeFieldBegin(SHARD_ID_FIELD_DESC);
        oprot.writeString(this.shardId);
        oprot.writeFieldEnd();
      }
    }
    if (this.shareKey != null) {
      if (isSetShareKey()) {
        oprot.writeFieldBegin(SHARE_KEY_FIELD_DESC);
        oprot.writeString(this.shareKey);
        oprot.writeFieldEnd();
      }
    }
    if (this.uri != null) {
      if (isSetUri()) {
        oprot.writeFieldBegin(URI_FIELD_DESC);
        oprot.writeString(this.uri);
        oprot.writeFieldEnd();
      }
    }
    if (this.guid != null) {
      if (isSetGuid()) {
        oprot.writeFieldBegin(GUID_FIELD_DESC);
        oprot.writeString(this.guid);
        oprot.writeFieldEnd();
      }
    }
    if (isSetUpdateSequenceNum()) {
      oprot.writeFieldBegin(UPDATE_SEQUENCE_NUM_FIELD_DESC);
      oprot.writeI32(this.updateSequenceNum);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("LinkedNotebook(");
    boolean first = true;

    if (isSetShareName()) {
      sb.append("shareName:");
      if (this.shareName == null) {
        sb.append("null");
      } else {
        sb.append(this.shareName);
      }
      first = false;
    }
    if (isSetUsername()) {
      if (!first) sb.append(", ");
      sb.append("username:");
      if (this.username == null) {
        sb.append("null");
      } else {
        sb.append(this.username);
      }
      first = false;
    }
    if (isSetShardId()) {
      if (!first) sb.append(", ");
      sb.append("shardId:");
      if (this.shardId == null) {
        sb.append("null");
      } else {
        sb.append(this.shardId);
      }
      first = false;
    }
    if (isSetShareKey()) {
      if (!first) sb.append(", ");
      sb.append("shareKey:");
      if (this.shareKey == null) {
        sb.append("null");
      } else {
        sb.append(this.shareKey);
      }
      first = false;
    }
    if (isSetUri()) {
      if (!first) sb.append(", ");
      sb.append("uri:");
      if (this.uri == null) {
        sb.append("null");
      } else {
        sb.append(this.uri);
      }
      first = false;
    }
    if (isSetGuid()) {
      if (!first) sb.append(", ");
      sb.append("guid:");
      if (this.guid == null) {
        sb.append("null");
      } else {
        sb.append(this.guid);
      }
      first = false;
    }
    if (isSetUpdateSequenceNum()) {
      if (!first) sb.append(", ");
      sb.append("updateSequenceNum:");
      sb.append(this.updateSequenceNum);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

