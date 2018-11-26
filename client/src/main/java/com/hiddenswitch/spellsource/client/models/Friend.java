/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hiddenswitch.spellsource.client.models.PresenceEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Friend
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Friend implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("presence")
  private PresenceEnum presence = null;

  @JsonProperty("friendId")
  private String friendId = null;

  @JsonProperty("since")
  private Long since = null;

  @JsonProperty("friendName")
  private String friendName = null;

  public Friend presence(PresenceEnum presence) {
    this.presence = presence;
    return this;
  }

   /**
   * Get presence
   * @return presence
  **/
  @ApiModelProperty(value = "")
  public PresenceEnum getPresence() {
    return presence;
  }

  public void setPresence(PresenceEnum presence) {
    this.presence = presence;
  }

  public Friend friendId(String friendId) {
    this.friendId = friendId;
    return this;
  }

   /**
   * Get friendId
   * @return friendId
  **/
  @ApiModelProperty(value = "")
  public String getFriendId() {
    return friendId;
  }

  public void setFriendId(String friendId) {
    this.friendId = friendId;
  }

  public Friend since(Long since) {
    this.since = since;
    return this;
  }

   /**
   * Get since
   * @return since
  **/
  @ApiModelProperty(value = "")
  public Long getSince() {
    return since;
  }

  public void setSince(Long since) {
    this.since = since;
  }

  public Friend friendName(String friendName) {
    this.friendName = friendName;
    return this;
  }

   /**
   * Get friendName
   * @return friendName
  **/
  @ApiModelProperty(value = "")
  public String getFriendName() {
    return friendName;
  }

  public void setFriendName(String friendName) {
    this.friendName = friendName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Friend friend = (Friend) o;
    return Objects.equals(this.presence, friend.presence) &&
        Objects.equals(this.friendId, friend.friendId) &&
        Objects.equals(this.since, friend.since) &&
        Objects.equals(this.friendName, friend.friendName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presence, friendId, since, friendName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Friend {\n");
    
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    friendId: ").append(toIndentedString(friendId)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    friendName: ").append(toIndentedString(friendName)).append("\n");
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

