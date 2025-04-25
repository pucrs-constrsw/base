package org.firpy.oauthclient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * OIDCPermission
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T02:27:35.543660400-03:00[America/Sao_Paulo]", comments = "Generator version: 7.12.0")
public class OIDCPermission {

  private @Nullable String resourceId;

  private @Nullable String resourceName;

  public OIDCPermission resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
   */
  
  @Schema(name = "resource_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_id")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public OIDCPermission resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   */
  
  @Schema(name = "resource_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_name")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCPermission oiDCPermission = (OIDCPermission) o;
    return Objects.equals(this.resourceId, oiDCPermission.resourceId) &&
        Objects.equals(this.resourceName, oiDCPermission.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCPermission {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

