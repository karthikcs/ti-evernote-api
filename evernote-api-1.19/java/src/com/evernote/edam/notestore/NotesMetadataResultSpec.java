/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.notestore;

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
 * This structure is provided to the findNotesMetadata function to specify
 * the subset of fields that should be included in each NoteMetadata element
 * that is returned in the NotesMetadataList.
 * Each field on this structure is a boolean flag that indicates whether the
 * corresponding field should be included in the NoteMetadata structure when
 * it is returned.  For example, if the 'includeTitle' field is set on this
 * structure when calling findNotesMetadata, then each NoteMetadata in the
 * list should have its 'title' field set.
 * If one of the fields in this spec is not set, then it will be treated as
 * 'false' by the server, so the default behavior is to include nothing in
 * replies (but the mandatory GUID)
 */
public class NotesMetadataResultSpec implements TBase<NotesMetadataResultSpec, NotesMetadataResultSpec._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("NotesMetadataResultSpec");

  private static final TField INCLUDE_TITLE_FIELD_DESC = new TField("includeTitle", TType.BOOL, (short)2);
  private static final TField INCLUDE_CONTENT_LENGTH_FIELD_DESC = new TField("includeContentLength", TType.BOOL, (short)5);
  private static final TField INCLUDE_CREATED_FIELD_DESC = new TField("includeCreated", TType.BOOL, (short)6);
  private static final TField INCLUDE_UPDATED_FIELD_DESC = new TField("includeUpdated", TType.BOOL, (short)7);
  private static final TField INCLUDE_UPDATE_SEQUENCE_NUM_FIELD_DESC = new TField("includeUpdateSequenceNum", TType.BOOL, (short)10);
  private static final TField INCLUDE_NOTEBOOK_GUID_FIELD_DESC = new TField("includeNotebookGuid", TType.BOOL, (short)11);
  private static final TField INCLUDE_TAG_GUIDS_FIELD_DESC = new TField("includeTagGuids", TType.BOOL, (short)12);
  private static final TField INCLUDE_ATTRIBUTES_FIELD_DESC = new TField("includeAttributes", TType.BOOL, (short)14);
  private static final TField INCLUDE_LARGEST_RESOURCE_MIME_FIELD_DESC = new TField("includeLargestResourceMime", TType.BOOL, (short)20);
  private static final TField INCLUDE_LARGEST_RESOURCE_SIZE_FIELD_DESC = new TField("includeLargestResourceSize", TType.BOOL, (short)21);

  private boolean includeTitle;
  private boolean includeContentLength;
  private boolean includeCreated;
  private boolean includeUpdated;
  private boolean includeUpdateSequenceNum;
  private boolean includeNotebookGuid;
  private boolean includeTagGuids;
  private boolean includeAttributes;
  private boolean includeLargestResourceMime;
  private boolean includeLargestResourceSize;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    INCLUDE_TITLE((short)2, "includeTitle"),
    INCLUDE_CONTENT_LENGTH((short)5, "includeContentLength"),
    INCLUDE_CREATED((short)6, "includeCreated"),
    INCLUDE_UPDATED((short)7, "includeUpdated"),
    INCLUDE_UPDATE_SEQUENCE_NUM((short)10, "includeUpdateSequenceNum"),
    INCLUDE_NOTEBOOK_GUID((short)11, "includeNotebookGuid"),
    INCLUDE_TAG_GUIDS((short)12, "includeTagGuids"),
    INCLUDE_ATTRIBUTES((short)14, "includeAttributes"),
    INCLUDE_LARGEST_RESOURCE_MIME((short)20, "includeLargestResourceMime"),
    INCLUDE_LARGEST_RESOURCE_SIZE((short)21, "includeLargestResourceSize");

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
        case 2: // INCLUDE_TITLE
          return INCLUDE_TITLE;
        case 5: // INCLUDE_CONTENT_LENGTH
          return INCLUDE_CONTENT_LENGTH;
        case 6: // INCLUDE_CREATED
          return INCLUDE_CREATED;
        case 7: // INCLUDE_UPDATED
          return INCLUDE_UPDATED;
        case 10: // INCLUDE_UPDATE_SEQUENCE_NUM
          return INCLUDE_UPDATE_SEQUENCE_NUM;
        case 11: // INCLUDE_NOTEBOOK_GUID
          return INCLUDE_NOTEBOOK_GUID;
        case 12: // INCLUDE_TAG_GUIDS
          return INCLUDE_TAG_GUIDS;
        case 14: // INCLUDE_ATTRIBUTES
          return INCLUDE_ATTRIBUTES;
        case 20: // INCLUDE_LARGEST_RESOURCE_MIME
          return INCLUDE_LARGEST_RESOURCE_MIME;
        case 21: // INCLUDE_LARGEST_RESOURCE_SIZE
          return INCLUDE_LARGEST_RESOURCE_SIZE;
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
  private static final int __INCLUDETITLE_ISSET_ID = 0;
  private static final int __INCLUDECONTENTLENGTH_ISSET_ID = 1;
  private static final int __INCLUDECREATED_ISSET_ID = 2;
  private static final int __INCLUDEUPDATED_ISSET_ID = 3;
  private static final int __INCLUDEUPDATESEQUENCENUM_ISSET_ID = 4;
  private static final int __INCLUDENOTEBOOKGUID_ISSET_ID = 5;
  private static final int __INCLUDETAGGUIDS_ISSET_ID = 6;
  private static final int __INCLUDEATTRIBUTES_ISSET_ID = 7;
  private static final int __INCLUDELARGESTRESOURCEMIME_ISSET_ID = 8;
  private static final int __INCLUDELARGESTRESOURCESIZE_ISSET_ID = 9;
  private boolean[] __isset_vector = new boolean[10];

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INCLUDE_TITLE, new FieldMetaData("includeTitle", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_CONTENT_LENGTH, new FieldMetaData("includeContentLength", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_CREATED, new FieldMetaData("includeCreated", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_UPDATED, new FieldMetaData("includeUpdated", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_UPDATE_SEQUENCE_NUM, new FieldMetaData("includeUpdateSequenceNum", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_NOTEBOOK_GUID, new FieldMetaData("includeNotebookGuid", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_TAG_GUIDS, new FieldMetaData("includeTagGuids", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_ATTRIBUTES, new FieldMetaData("includeAttributes", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_LARGEST_RESOURCE_MIME, new FieldMetaData("includeLargestResourceMime", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_LARGEST_RESOURCE_SIZE, new FieldMetaData("includeLargestResourceSize", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(NotesMetadataResultSpec.class, metaDataMap);
  }

  public NotesMetadataResultSpec() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotesMetadataResultSpec(NotesMetadataResultSpec other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.includeTitle = other.includeTitle;
    this.includeContentLength = other.includeContentLength;
    this.includeCreated = other.includeCreated;
    this.includeUpdated = other.includeUpdated;
    this.includeUpdateSequenceNum = other.includeUpdateSequenceNum;
    this.includeNotebookGuid = other.includeNotebookGuid;
    this.includeTagGuids = other.includeTagGuids;
    this.includeAttributes = other.includeAttributes;
    this.includeLargestResourceMime = other.includeLargestResourceMime;
    this.includeLargestResourceSize = other.includeLargestResourceSize;
  }

  public NotesMetadataResultSpec deepCopy() {
    return new NotesMetadataResultSpec(this);
  }

  public void clear() {
    setIncludeTitleIsSet(false);
    this.includeTitle = false;
    setIncludeContentLengthIsSet(false);
    this.includeContentLength = false;
    setIncludeCreatedIsSet(false);
    this.includeCreated = false;
    setIncludeUpdatedIsSet(false);
    this.includeUpdated = false;
    setIncludeUpdateSequenceNumIsSet(false);
    this.includeUpdateSequenceNum = false;
    setIncludeNotebookGuidIsSet(false);
    this.includeNotebookGuid = false;
    setIncludeTagGuidsIsSet(false);
    this.includeTagGuids = false;
    setIncludeAttributesIsSet(false);
    this.includeAttributes = false;
    setIncludeLargestResourceMimeIsSet(false);
    this.includeLargestResourceMime = false;
    setIncludeLargestResourceSizeIsSet(false);
    this.includeLargestResourceSize = false;
  }

  public boolean isIncludeTitle() {
    return this.includeTitle;
  }

  public void setIncludeTitle(boolean includeTitle) {
    this.includeTitle = includeTitle;
    setIncludeTitleIsSet(true);
  }

  public void unsetIncludeTitle() {
    __isset_vector[__INCLUDETITLE_ISSET_ID] = false;
  }

  /** Returns true if field includeTitle is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeTitle() {
    return __isset_vector[__INCLUDETITLE_ISSET_ID];
  }

  public void setIncludeTitleIsSet(boolean value) {
    __isset_vector[__INCLUDETITLE_ISSET_ID] = value;
  }

  public boolean isIncludeContentLength() {
    return this.includeContentLength;
  }

  public void setIncludeContentLength(boolean includeContentLength) {
    this.includeContentLength = includeContentLength;
    setIncludeContentLengthIsSet(true);
  }

  public void unsetIncludeContentLength() {
    __isset_vector[__INCLUDECONTENTLENGTH_ISSET_ID] = false;
  }

  /** Returns true if field includeContentLength is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeContentLength() {
    return __isset_vector[__INCLUDECONTENTLENGTH_ISSET_ID];
  }

  public void setIncludeContentLengthIsSet(boolean value) {
    __isset_vector[__INCLUDECONTENTLENGTH_ISSET_ID] = value;
  }

  public boolean isIncludeCreated() {
    return this.includeCreated;
  }

  public void setIncludeCreated(boolean includeCreated) {
    this.includeCreated = includeCreated;
    setIncludeCreatedIsSet(true);
  }

  public void unsetIncludeCreated() {
    __isset_vector[__INCLUDECREATED_ISSET_ID] = false;
  }

  /** Returns true if field includeCreated is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeCreated() {
    return __isset_vector[__INCLUDECREATED_ISSET_ID];
  }

  public void setIncludeCreatedIsSet(boolean value) {
    __isset_vector[__INCLUDECREATED_ISSET_ID] = value;
  }

  public boolean isIncludeUpdated() {
    return this.includeUpdated;
  }

  public void setIncludeUpdated(boolean includeUpdated) {
    this.includeUpdated = includeUpdated;
    setIncludeUpdatedIsSet(true);
  }

  public void unsetIncludeUpdated() {
    __isset_vector[__INCLUDEUPDATED_ISSET_ID] = false;
  }

  /** Returns true if field includeUpdated is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeUpdated() {
    return __isset_vector[__INCLUDEUPDATED_ISSET_ID];
  }

  public void setIncludeUpdatedIsSet(boolean value) {
    __isset_vector[__INCLUDEUPDATED_ISSET_ID] = value;
  }

  public boolean isIncludeUpdateSequenceNum() {
    return this.includeUpdateSequenceNum;
  }

  public void setIncludeUpdateSequenceNum(boolean includeUpdateSequenceNum) {
    this.includeUpdateSequenceNum = includeUpdateSequenceNum;
    setIncludeUpdateSequenceNumIsSet(true);
  }

  public void unsetIncludeUpdateSequenceNum() {
    __isset_vector[__INCLUDEUPDATESEQUENCENUM_ISSET_ID] = false;
  }

  /** Returns true if field includeUpdateSequenceNum is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeUpdateSequenceNum() {
    return __isset_vector[__INCLUDEUPDATESEQUENCENUM_ISSET_ID];
  }

  public void setIncludeUpdateSequenceNumIsSet(boolean value) {
    __isset_vector[__INCLUDEUPDATESEQUENCENUM_ISSET_ID] = value;
  }

  public boolean isIncludeNotebookGuid() {
    return this.includeNotebookGuid;
  }

  public void setIncludeNotebookGuid(boolean includeNotebookGuid) {
    this.includeNotebookGuid = includeNotebookGuid;
    setIncludeNotebookGuidIsSet(true);
  }

  public void unsetIncludeNotebookGuid() {
    __isset_vector[__INCLUDENOTEBOOKGUID_ISSET_ID] = false;
  }

  /** Returns true if field includeNotebookGuid is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeNotebookGuid() {
    return __isset_vector[__INCLUDENOTEBOOKGUID_ISSET_ID];
  }

  public void setIncludeNotebookGuidIsSet(boolean value) {
    __isset_vector[__INCLUDENOTEBOOKGUID_ISSET_ID] = value;
  }

  public boolean isIncludeTagGuids() {
    return this.includeTagGuids;
  }

  public void setIncludeTagGuids(boolean includeTagGuids) {
    this.includeTagGuids = includeTagGuids;
    setIncludeTagGuidsIsSet(true);
  }

  public void unsetIncludeTagGuids() {
    __isset_vector[__INCLUDETAGGUIDS_ISSET_ID] = false;
  }

  /** Returns true if field includeTagGuids is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeTagGuids() {
    return __isset_vector[__INCLUDETAGGUIDS_ISSET_ID];
  }

  public void setIncludeTagGuidsIsSet(boolean value) {
    __isset_vector[__INCLUDETAGGUIDS_ISSET_ID] = value;
  }

  public boolean isIncludeAttributes() {
    return this.includeAttributes;
  }

  public void setIncludeAttributes(boolean includeAttributes) {
    this.includeAttributes = includeAttributes;
    setIncludeAttributesIsSet(true);
  }

  public void unsetIncludeAttributes() {
    __isset_vector[__INCLUDEATTRIBUTES_ISSET_ID] = false;
  }

  /** Returns true if field includeAttributes is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeAttributes() {
    return __isset_vector[__INCLUDEATTRIBUTES_ISSET_ID];
  }

  public void setIncludeAttributesIsSet(boolean value) {
    __isset_vector[__INCLUDEATTRIBUTES_ISSET_ID] = value;
  }

  public boolean isIncludeLargestResourceMime() {
    return this.includeLargestResourceMime;
  }

  public void setIncludeLargestResourceMime(boolean includeLargestResourceMime) {
    this.includeLargestResourceMime = includeLargestResourceMime;
    setIncludeLargestResourceMimeIsSet(true);
  }

  public void unsetIncludeLargestResourceMime() {
    __isset_vector[__INCLUDELARGESTRESOURCEMIME_ISSET_ID] = false;
  }

  /** Returns true if field includeLargestResourceMime is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeLargestResourceMime() {
    return __isset_vector[__INCLUDELARGESTRESOURCEMIME_ISSET_ID];
  }

  public void setIncludeLargestResourceMimeIsSet(boolean value) {
    __isset_vector[__INCLUDELARGESTRESOURCEMIME_ISSET_ID] = value;
  }

  public boolean isIncludeLargestResourceSize() {
    return this.includeLargestResourceSize;
  }

  public void setIncludeLargestResourceSize(boolean includeLargestResourceSize) {
    this.includeLargestResourceSize = includeLargestResourceSize;
    setIncludeLargestResourceSizeIsSet(true);
  }

  public void unsetIncludeLargestResourceSize() {
    __isset_vector[__INCLUDELARGESTRESOURCESIZE_ISSET_ID] = false;
  }

  /** Returns true if field includeLargestResourceSize is set (has been asigned a value) and false otherwise */
  public boolean isSetIncludeLargestResourceSize() {
    return __isset_vector[__INCLUDELARGESTRESOURCESIZE_ISSET_ID];
  }

  public void setIncludeLargestResourceSizeIsSet(boolean value) {
    __isset_vector[__INCLUDELARGESTRESOURCESIZE_ISSET_ID] = value;
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INCLUDE_TITLE:
      if (value == null) {
        unsetIncludeTitle();
      } else {
        setIncludeTitle((Boolean)value);
      }
      break;

    case INCLUDE_CONTENT_LENGTH:
      if (value == null) {
        unsetIncludeContentLength();
      } else {
        setIncludeContentLength((Boolean)value);
      }
      break;

    case INCLUDE_CREATED:
      if (value == null) {
        unsetIncludeCreated();
      } else {
        setIncludeCreated((Boolean)value);
      }
      break;

    case INCLUDE_UPDATED:
      if (value == null) {
        unsetIncludeUpdated();
      } else {
        setIncludeUpdated((Boolean)value);
      }
      break;

    case INCLUDE_UPDATE_SEQUENCE_NUM:
      if (value == null) {
        unsetIncludeUpdateSequenceNum();
      } else {
        setIncludeUpdateSequenceNum((Boolean)value);
      }
      break;

    case INCLUDE_NOTEBOOK_GUID:
      if (value == null) {
        unsetIncludeNotebookGuid();
      } else {
        setIncludeNotebookGuid((Boolean)value);
      }
      break;

    case INCLUDE_TAG_GUIDS:
      if (value == null) {
        unsetIncludeTagGuids();
      } else {
        setIncludeTagGuids((Boolean)value);
      }
      break;

    case INCLUDE_ATTRIBUTES:
      if (value == null) {
        unsetIncludeAttributes();
      } else {
        setIncludeAttributes((Boolean)value);
      }
      break;

    case INCLUDE_LARGEST_RESOURCE_MIME:
      if (value == null) {
        unsetIncludeLargestResourceMime();
      } else {
        setIncludeLargestResourceMime((Boolean)value);
      }
      break;

    case INCLUDE_LARGEST_RESOURCE_SIZE:
      if (value == null) {
        unsetIncludeLargestResourceSize();
      } else {
        setIncludeLargestResourceSize((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INCLUDE_TITLE:
      return new Boolean(isIncludeTitle());

    case INCLUDE_CONTENT_LENGTH:
      return new Boolean(isIncludeContentLength());

    case INCLUDE_CREATED:
      return new Boolean(isIncludeCreated());

    case INCLUDE_UPDATED:
      return new Boolean(isIncludeUpdated());

    case INCLUDE_UPDATE_SEQUENCE_NUM:
      return new Boolean(isIncludeUpdateSequenceNum());

    case INCLUDE_NOTEBOOK_GUID:
      return new Boolean(isIncludeNotebookGuid());

    case INCLUDE_TAG_GUIDS:
      return new Boolean(isIncludeTagGuids());

    case INCLUDE_ATTRIBUTES:
      return new Boolean(isIncludeAttributes());

    case INCLUDE_LARGEST_RESOURCE_MIME:
      return new Boolean(isIncludeLargestResourceMime());

    case INCLUDE_LARGEST_RESOURCE_SIZE:
      return new Boolean(isIncludeLargestResourceSize());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INCLUDE_TITLE:
      return isSetIncludeTitle();
    case INCLUDE_CONTENT_LENGTH:
      return isSetIncludeContentLength();
    case INCLUDE_CREATED:
      return isSetIncludeCreated();
    case INCLUDE_UPDATED:
      return isSetIncludeUpdated();
    case INCLUDE_UPDATE_SEQUENCE_NUM:
      return isSetIncludeUpdateSequenceNum();
    case INCLUDE_NOTEBOOK_GUID:
      return isSetIncludeNotebookGuid();
    case INCLUDE_TAG_GUIDS:
      return isSetIncludeTagGuids();
    case INCLUDE_ATTRIBUTES:
      return isSetIncludeAttributes();
    case INCLUDE_LARGEST_RESOURCE_MIME:
      return isSetIncludeLargestResourceMime();
    case INCLUDE_LARGEST_RESOURCE_SIZE:
      return isSetIncludeLargestResourceSize();
    }
    throw new IllegalStateException();
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NotesMetadataResultSpec)
      return this.equals((NotesMetadataResultSpec)that);
    return false;
  }

  public boolean equals(NotesMetadataResultSpec that) {
    if (that == null)
      return false;

    boolean this_present_includeTitle = true && this.isSetIncludeTitle();
    boolean that_present_includeTitle = true && that.isSetIncludeTitle();
    if (this_present_includeTitle || that_present_includeTitle) {
      if (!(this_present_includeTitle && that_present_includeTitle))
        return false;
      if (this.includeTitle != that.includeTitle)
        return false;
    }

    boolean this_present_includeContentLength = true && this.isSetIncludeContentLength();
    boolean that_present_includeContentLength = true && that.isSetIncludeContentLength();
    if (this_present_includeContentLength || that_present_includeContentLength) {
      if (!(this_present_includeContentLength && that_present_includeContentLength))
        return false;
      if (this.includeContentLength != that.includeContentLength)
        return false;
    }

    boolean this_present_includeCreated = true && this.isSetIncludeCreated();
    boolean that_present_includeCreated = true && that.isSetIncludeCreated();
    if (this_present_includeCreated || that_present_includeCreated) {
      if (!(this_present_includeCreated && that_present_includeCreated))
        return false;
      if (this.includeCreated != that.includeCreated)
        return false;
    }

    boolean this_present_includeUpdated = true && this.isSetIncludeUpdated();
    boolean that_present_includeUpdated = true && that.isSetIncludeUpdated();
    if (this_present_includeUpdated || that_present_includeUpdated) {
      if (!(this_present_includeUpdated && that_present_includeUpdated))
        return false;
      if (this.includeUpdated != that.includeUpdated)
        return false;
    }

    boolean this_present_includeUpdateSequenceNum = true && this.isSetIncludeUpdateSequenceNum();
    boolean that_present_includeUpdateSequenceNum = true && that.isSetIncludeUpdateSequenceNum();
    if (this_present_includeUpdateSequenceNum || that_present_includeUpdateSequenceNum) {
      if (!(this_present_includeUpdateSequenceNum && that_present_includeUpdateSequenceNum))
        return false;
      if (this.includeUpdateSequenceNum != that.includeUpdateSequenceNum)
        return false;
    }

    boolean this_present_includeNotebookGuid = true && this.isSetIncludeNotebookGuid();
    boolean that_present_includeNotebookGuid = true && that.isSetIncludeNotebookGuid();
    if (this_present_includeNotebookGuid || that_present_includeNotebookGuid) {
      if (!(this_present_includeNotebookGuid && that_present_includeNotebookGuid))
        return false;
      if (this.includeNotebookGuid != that.includeNotebookGuid)
        return false;
    }

    boolean this_present_includeTagGuids = true && this.isSetIncludeTagGuids();
    boolean that_present_includeTagGuids = true && that.isSetIncludeTagGuids();
    if (this_present_includeTagGuids || that_present_includeTagGuids) {
      if (!(this_present_includeTagGuids && that_present_includeTagGuids))
        return false;
      if (this.includeTagGuids != that.includeTagGuids)
        return false;
    }

    boolean this_present_includeAttributes = true && this.isSetIncludeAttributes();
    boolean that_present_includeAttributes = true && that.isSetIncludeAttributes();
    if (this_present_includeAttributes || that_present_includeAttributes) {
      if (!(this_present_includeAttributes && that_present_includeAttributes))
        return false;
      if (this.includeAttributes != that.includeAttributes)
        return false;
    }

    boolean this_present_includeLargestResourceMime = true && this.isSetIncludeLargestResourceMime();
    boolean that_present_includeLargestResourceMime = true && that.isSetIncludeLargestResourceMime();
    if (this_present_includeLargestResourceMime || that_present_includeLargestResourceMime) {
      if (!(this_present_includeLargestResourceMime && that_present_includeLargestResourceMime))
        return false;
      if (this.includeLargestResourceMime != that.includeLargestResourceMime)
        return false;
    }

    boolean this_present_includeLargestResourceSize = true && this.isSetIncludeLargestResourceSize();
    boolean that_present_includeLargestResourceSize = true && that.isSetIncludeLargestResourceSize();
    if (this_present_includeLargestResourceSize || that_present_includeLargestResourceSize) {
      if (!(this_present_includeLargestResourceSize && that_present_includeLargestResourceSize))
        return false;
      if (this.includeLargestResourceSize != that.includeLargestResourceSize)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(NotesMetadataResultSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    NotesMetadataResultSpec typedOther = (NotesMetadataResultSpec)other;

    lastComparison = Boolean.valueOf(isSetIncludeTitle()).compareTo(typedOther.isSetIncludeTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeTitle()) {      lastComparison = TBaseHelper.compareTo(this.includeTitle, typedOther.includeTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeContentLength()).compareTo(typedOther.isSetIncludeContentLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeContentLength()) {      lastComparison = TBaseHelper.compareTo(this.includeContentLength, typedOther.includeContentLength);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeCreated()).compareTo(typedOther.isSetIncludeCreated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeCreated()) {      lastComparison = TBaseHelper.compareTo(this.includeCreated, typedOther.includeCreated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeUpdated()).compareTo(typedOther.isSetIncludeUpdated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeUpdated()) {      lastComparison = TBaseHelper.compareTo(this.includeUpdated, typedOther.includeUpdated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeUpdateSequenceNum()).compareTo(typedOther.isSetIncludeUpdateSequenceNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeUpdateSequenceNum()) {      lastComparison = TBaseHelper.compareTo(this.includeUpdateSequenceNum, typedOther.includeUpdateSequenceNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeNotebookGuid()).compareTo(typedOther.isSetIncludeNotebookGuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeNotebookGuid()) {      lastComparison = TBaseHelper.compareTo(this.includeNotebookGuid, typedOther.includeNotebookGuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeTagGuids()).compareTo(typedOther.isSetIncludeTagGuids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeTagGuids()) {      lastComparison = TBaseHelper.compareTo(this.includeTagGuids, typedOther.includeTagGuids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeAttributes()).compareTo(typedOther.isSetIncludeAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeAttributes()) {      lastComparison = TBaseHelper.compareTo(this.includeAttributes, typedOther.includeAttributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeLargestResourceMime()).compareTo(typedOther.isSetIncludeLargestResourceMime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeLargestResourceMime()) {      lastComparison = TBaseHelper.compareTo(this.includeLargestResourceMime, typedOther.includeLargestResourceMime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeLargestResourceSize()).compareTo(typedOther.isSetIncludeLargestResourceSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeLargestResourceSize()) {      lastComparison = TBaseHelper.compareTo(this.includeLargestResourceSize, typedOther.includeLargestResourceSize);
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
        case 2: // INCLUDE_TITLE
          if (field.type == TType.BOOL) {
            this.includeTitle = iprot.readBool();
            setIncludeTitleIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // INCLUDE_CONTENT_LENGTH
          if (field.type == TType.BOOL) {
            this.includeContentLength = iprot.readBool();
            setIncludeContentLengthIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // INCLUDE_CREATED
          if (field.type == TType.BOOL) {
            this.includeCreated = iprot.readBool();
            setIncludeCreatedIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // INCLUDE_UPDATED
          if (field.type == TType.BOOL) {
            this.includeUpdated = iprot.readBool();
            setIncludeUpdatedIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // INCLUDE_UPDATE_SEQUENCE_NUM
          if (field.type == TType.BOOL) {
            this.includeUpdateSequenceNum = iprot.readBool();
            setIncludeUpdateSequenceNumIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // INCLUDE_NOTEBOOK_GUID
          if (field.type == TType.BOOL) {
            this.includeNotebookGuid = iprot.readBool();
            setIncludeNotebookGuidIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // INCLUDE_TAG_GUIDS
          if (field.type == TType.BOOL) {
            this.includeTagGuids = iprot.readBool();
            setIncludeTagGuidsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 14: // INCLUDE_ATTRIBUTES
          if (field.type == TType.BOOL) {
            this.includeAttributes = iprot.readBool();
            setIncludeAttributesIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 20: // INCLUDE_LARGEST_RESOURCE_MIME
          if (field.type == TType.BOOL) {
            this.includeLargestResourceMime = iprot.readBool();
            setIncludeLargestResourceMimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 21: // INCLUDE_LARGEST_RESOURCE_SIZE
          if (field.type == TType.BOOL) {
            this.includeLargestResourceSize = iprot.readBool();
            setIncludeLargestResourceSizeIsSet(true);
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
    if (isSetIncludeTitle()) {
      oprot.writeFieldBegin(INCLUDE_TITLE_FIELD_DESC);
      oprot.writeBool(this.includeTitle);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeContentLength()) {
      oprot.writeFieldBegin(INCLUDE_CONTENT_LENGTH_FIELD_DESC);
      oprot.writeBool(this.includeContentLength);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeCreated()) {
      oprot.writeFieldBegin(INCLUDE_CREATED_FIELD_DESC);
      oprot.writeBool(this.includeCreated);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeUpdated()) {
      oprot.writeFieldBegin(INCLUDE_UPDATED_FIELD_DESC);
      oprot.writeBool(this.includeUpdated);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeUpdateSequenceNum()) {
      oprot.writeFieldBegin(INCLUDE_UPDATE_SEQUENCE_NUM_FIELD_DESC);
      oprot.writeBool(this.includeUpdateSequenceNum);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeNotebookGuid()) {
      oprot.writeFieldBegin(INCLUDE_NOTEBOOK_GUID_FIELD_DESC);
      oprot.writeBool(this.includeNotebookGuid);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeTagGuids()) {
      oprot.writeFieldBegin(INCLUDE_TAG_GUIDS_FIELD_DESC);
      oprot.writeBool(this.includeTagGuids);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeAttributes()) {
      oprot.writeFieldBegin(INCLUDE_ATTRIBUTES_FIELD_DESC);
      oprot.writeBool(this.includeAttributes);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeLargestResourceMime()) {
      oprot.writeFieldBegin(INCLUDE_LARGEST_RESOURCE_MIME_FIELD_DESC);
      oprot.writeBool(this.includeLargestResourceMime);
      oprot.writeFieldEnd();
    }
    if (isSetIncludeLargestResourceSize()) {
      oprot.writeFieldBegin(INCLUDE_LARGEST_RESOURCE_SIZE_FIELD_DESC);
      oprot.writeBool(this.includeLargestResourceSize);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("NotesMetadataResultSpec(");
    boolean first = true;

    if (isSetIncludeTitle()) {
      sb.append("includeTitle:");
      sb.append(this.includeTitle);
      first = false;
    }
    if (isSetIncludeContentLength()) {
      if (!first) sb.append(", ");
      sb.append("includeContentLength:");
      sb.append(this.includeContentLength);
      first = false;
    }
    if (isSetIncludeCreated()) {
      if (!first) sb.append(", ");
      sb.append("includeCreated:");
      sb.append(this.includeCreated);
      first = false;
    }
    if (isSetIncludeUpdated()) {
      if (!first) sb.append(", ");
      sb.append("includeUpdated:");
      sb.append(this.includeUpdated);
      first = false;
    }
    if (isSetIncludeUpdateSequenceNum()) {
      if (!first) sb.append(", ");
      sb.append("includeUpdateSequenceNum:");
      sb.append(this.includeUpdateSequenceNum);
      first = false;
    }
    if (isSetIncludeNotebookGuid()) {
      if (!first) sb.append(", ");
      sb.append("includeNotebookGuid:");
      sb.append(this.includeNotebookGuid);
      first = false;
    }
    if (isSetIncludeTagGuids()) {
      if (!first) sb.append(", ");
      sb.append("includeTagGuids:");
      sb.append(this.includeTagGuids);
      first = false;
    }
    if (isSetIncludeAttributes()) {
      if (!first) sb.append(", ");
      sb.append("includeAttributes:");
      sb.append(this.includeAttributes);
      first = false;
    }
    if (isSetIncludeLargestResourceMime()) {
      if (!first) sb.append(", ");
      sb.append("includeLargestResourceMime:");
      sb.append(this.includeLargestResourceMime);
      first = false;
    }
    if (isSetIncludeLargestResourceSize()) {
      if (!first) sb.append(", ");
      sb.append("includeLargestResourceSize:");
      sb.append(this.includeLargestResourceSize);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

