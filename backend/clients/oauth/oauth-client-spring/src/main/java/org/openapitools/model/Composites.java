package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Composites
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T02:27:35.543660400-03:00[America/Sao_Paulo]", comments = "Generator version: 7.12.0")
public class Composites {

  @Valid
  private Set<String> realm = new LinkedHashSet<>();

  @Valid
  private Map<String, List<String>> client = new HashMap<>();

  @Deprecated
  @Valid
  private Map<String, List<String>> application = new HashMap<>();

  public Composites realm(Set<String> realm) {
    this.realm = realm;
    return this;
  }

  public Composites addRealmItem(String realmItem) {
    if (this.realm == null) {
      this.realm = new LinkedHashSet<>();
    }
    this.realm.add(realmItem);
    return this;
  }

  /**
   * Get realm
   * @return realm
   */
  
  @Schema(name = "realm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("realm")
  public Set<String> getRealm() {
    return realm;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRealm(Set<String> realm) {
    this.realm = realm;
  }

  public Composites client(Map<String, List<String>> client) {
    this.client = client;
    return this;
  }

  public Composites putClientItem(String key, List<String> clientItem) {
    if (this.client == null) {
      this.client = new HashMap<>();
    }
    this.client.put(key, clientItem);
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @Valid 
  @Schema(name = "client", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client")
  public Map<String, List<String>> getClient() {
    return client;
  }

  public void setClient(Map<String, List<String>> client) {
    this.client = client;
  }

  public Composites application(Map<String, List<String>> application) {
    this.application = application;
    return this;
  }

  public Composites putApplicationItem(String key, List<String> applicationItem) {
    if (this.application == null) {
      this.application = new HashMap<>();
    }
    this.application.put(key, applicationItem);
    return this;
  }

  /**
   * Get application
   * @return application
   * @deprecated
   */
  @Valid 
  @Schema(name = "application", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  @Deprecated
  public Map<String, List<String>> getApplication() {
    return application;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setApplication(Map<String, List<String>> application) {
    this.application = application;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Composites composites = (Composites) o;
    return Objects.equals(this.realm, composites.realm) &&
        Objects.equals(this.client, composites.client) &&
        Objects.equals(this.application, composites.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realm, client, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Composites {\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

