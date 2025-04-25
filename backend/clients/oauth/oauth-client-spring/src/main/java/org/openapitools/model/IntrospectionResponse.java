package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OIDCPermission;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IntrospectionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T02:27:35.543660400-03:00[America/Sao_Paulo]", comments = "Generator version: 7.12.0")
public class IntrospectionResponse {

  @Valid
  private List<@Valid OIDCPermission> permissions = new ArrayList<>();

  private @Nullable Integer exp;

  private @Nullable Integer nbf;

  private @Nullable Integer iat;

  private @Nullable String aud;

  private Boolean active;

  public IntrospectionResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntrospectionResponse(Boolean active) {
    this.active = active;
  }

  public IntrospectionResponse permissions(List<@Valid OIDCPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public IntrospectionResponse addPermissionsItem(OIDCPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @Valid 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid OIDCPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid OIDCPermission> permissions) {
    this.permissions = permissions;
  }

  public IntrospectionResponse exp(Integer exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Get exp
   * @return exp
   */
  
  @Schema(name = "exp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exp")
  public Integer getExp() {
    return exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public IntrospectionResponse nbf(Integer nbf) {
    this.nbf = nbf;
    return this;
  }

  /**
   * Get nbf
   * @return nbf
   */
  
  @Schema(name = "nbf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nbf")
  public Integer getNbf() {
    return nbf;
  }

  public void setNbf(Integer nbf) {
    this.nbf = nbf;
  }

  public IntrospectionResponse iat(Integer iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Get iat
   * @return iat
   */
  
  @Schema(name = "iat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iat")
  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }

  public IntrospectionResponse aud(String aud) {
    this.aud = aud;
    return this;
  }

  /**
   * Get aud
   * @return aud
   */
  
  @Schema(name = "aud", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aud")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public IntrospectionResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @NotNull 
  @Schema(name = "active", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntrospectionResponse introspectionResponse = (IntrospectionResponse) o;
    return Objects.equals(this.permissions, introspectionResponse.permissions) &&
        Objects.equals(this.exp, introspectionResponse.exp) &&
        Objects.equals(this.nbf, introspectionResponse.nbf) &&
        Objects.equals(this.iat, introspectionResponse.iat) &&
        Objects.equals(this.aud, introspectionResponse.aud) &&
        Objects.equals(this.active, introspectionResponse.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, exp, nbf, iat, aud, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntrospectionResponse {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    nbf: ").append(toIndentedString(nbf)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

