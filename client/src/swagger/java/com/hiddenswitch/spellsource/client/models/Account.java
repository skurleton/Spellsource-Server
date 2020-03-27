/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 4.0.1
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
import com.hiddenswitch.spellsource.client.models.Friend;
import com.hiddenswitch.spellsource.client.models.InventoryCollection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Account
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Account implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("privacyToken")
  private String privacyToken = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("friends")
  private List<Friend> friends = null;

  @JsonProperty("decks")
  private List<InventoryCollection> decks = null;

  @JsonProperty("inMatch")
  private Boolean inMatch = null;

  @JsonProperty("personalCollection")
  private InventoryCollection personalCollection = null;

  public Account id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The user ID
   * @return id
  **/
  @ApiModelProperty(value = "The user ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The username that is displayed to toher players
   * @return name
  **/
  @ApiModelProperty(value = "The username that is displayed to toher players")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account privacyToken(String privacyToken) {
    this.privacyToken = privacyToken;
    return this;
  }

   /**
   * The token that is appended to the end of the user&#39;s name to allow friending without sharing an e-mail address. 
   * @return privacyToken
  **/
  @ApiModelProperty(value = "The token that is appended to the end of the user's name to allow friending without sharing an e-mail address. ")
  public String getPrivacyToken() {
    return privacyToken;
  }

  public void setPrivacyToken(String privacyToken) {
    this.privacyToken = privacyToken;
  }

  public Account email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address
   * @return email
  **/
  @ApiModelProperty(value = "The user's email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Account friends(List<Friend> friends) {
    this.friends = friends;
    return this;
  }

  public Account addFriendsItem(Friend friendsItem) {
    if (this.friends == null) {
      this.friends = new ArrayList<>();
    }
    this.friends.add(friendsItem);
    return this;
  }

   /**
   * The user&#39;s friends at the moment of receiving this account document. This may be out of date as the latest friends information will come from receiving friend documents. 
   * @return friends
  **/
  @ApiModelProperty(value = "The user's friends at the moment of receiving this account document. This may be out of date as the latest friends information will come from receiving friend documents. ")
  public List<Friend> getFriends() {
    return friends;
  }

  public void setFriends(List<Friend> friends) {
    this.friends = friends;
  }

  public Account decks(List<InventoryCollection> decks) {
    this.decks = decks;
    return this;
  }

  public Account addDecksItem(InventoryCollection decksItem) {
    if (this.decks == null) {
      this.decks = new ArrayList<>();
    }
    this.decks.add(decksItem);
    return this;
  }

   /**
   * A list of decks belonging to the player
   * @return decks
  **/
  @ApiModelProperty(value = "A list of decks belonging to the player")
  public List<InventoryCollection> getDecks() {
    return decks;
  }

  public void setDecks(List<InventoryCollection> decks) {
    this.decks = decks;
  }

  public Account inMatch(Boolean inMatch) {
    this.inMatch = inMatch;
    return this;
  }

   /**
   * True if the client should attempt to connect to a match with its token. 
   * @return inMatch
  **/
  @ApiModelProperty(value = "True if the client should attempt to connect to a match with its token. ")
  public Boolean isInMatch() {
    return inMatch;
  }

  public void setInMatch(Boolean inMatch) {
    this.inMatch = inMatch;
  }

  public Account personalCollection(InventoryCollection personalCollection) {
    this.personalCollection = personalCollection;
    return this;
  }

   /**
   * Get personalCollection
   * @return personalCollection
  **/
  @ApiModelProperty(value = "")
  public InventoryCollection getPersonalCollection() {
    return personalCollection;
  }

  public void setPersonalCollection(InventoryCollection personalCollection) {
    this.personalCollection = personalCollection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.privacyToken, account.privacyToken) &&
        Objects.equals(this.email, account.email) &&
        Objects.equals(this.friends, account.friends) &&
        Objects.equals(this.decks, account.decks) &&
        Objects.equals(this.inMatch, account.inMatch) &&
        Objects.equals(this.personalCollection, account.personalCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, privacyToken, email, friends, decks, inMatch, personalCollection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyToken: ").append(toIndentedString(privacyToken)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("    decks: ").append(toIndentedString(decks)).append("\n");
    sb.append("    inMatch: ").append(toIndentedString(inMatch)).append("\n");
    sb.append("    personalCollection: ").append(toIndentedString(personalCollection)).append("\n");
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
