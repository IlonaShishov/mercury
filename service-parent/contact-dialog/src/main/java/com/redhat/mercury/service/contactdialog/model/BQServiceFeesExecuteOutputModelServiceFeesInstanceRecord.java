package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord   {
  @JsonProperty("feeConfigurationProfile")
  private InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile;

  @JsonProperty("feeApplicationRecord")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord;

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord feeConfigurationProfile(InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord feeApplicationRecord(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
    return this;
  }

  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord bqServiceFeesExecuteOutputModelServiceFeesInstanceRecord = (BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord) o;
    return Objects.equals(this.feeConfigurationProfile, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecord.feeConfigurationProfile) &&
        Objects.equals(this.feeApplicationRecord, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecord.feeApplicationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeApplicationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeApplicationRecord: ").append(toIndentedString(feeApplicationRecord)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

