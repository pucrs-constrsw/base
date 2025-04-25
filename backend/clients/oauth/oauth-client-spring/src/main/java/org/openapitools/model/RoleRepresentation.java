package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Composites;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RoleRepresentation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T02:27:35.543660400-03:00[America/Sao_Paulo]", comments = "Generator version: 7.12.0")
public class RoleRepresentation {

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable String description;

  @Deprecated
  private @Nullable Boolean scopeParamRequired;

  private @Nullable Boolean composite;

  private @Nullable Composites composites;

  private @Nullable Boolean clientRole;

  private @Nullable String containerId;

  @Valid
  private Map<String, List<String>> attributes = new HashMap<>();

  public RoleRepresentation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RoleRepresentation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleRepresentation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RoleRepresentation scopeParamRequired(Boolean scopeParamRequired) {
    this.scopeParamRequired = scopeParamRequired;
    return this;
  }

  /**
   * Get scopeParamRequired
   * @return scopeParamRequired
   * @deprecated
   */
  
  @Schema(name = "scopeParamRequired", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopeParamRequired")
  @Deprecated
  public Boolean getScopeParamRequired() {
    return scopeParamRequired;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setScopeParamRequired(Boolean scopeParamRequired) {
    this.scopeParamRequired = scopeParamRequired;
  }

  public RoleRepresentation composite(Boolean composite) {
    this.composite = composite;
    return this;
  }

  /**
   * Get composite
   * @return composite
   */
  
  @Schema(name = "composite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("composite")
  public Boolean getComposite() {
    return composite;
  }

  public void setComposite(Boolean composite) {
    this.composite = composite;
  }

  public RoleRepresentation composites(Composites composites) {
    this.composites = composites;
    return this;
  }

  /**
   * Get composites
   * @return composites
   */
  @Valid 
  @Schema(name = "composites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("composites")
  public Composites getComposites() {
    return composites;
  }

  public void setComposites(Composites composites) {
    this.composites = composites;
  }

  public RoleRepresentation clientRole(Boolean clientRole) {
    this.clientRole = clientRole;
    return this;
  }

  /**
   * Get clientRole
   * @return clientRole
   */
  
  @Schema(name = "clientRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientRole")
  public Boolean getClientRole() {
    return clientRole;
  }

  public void setClientRole(Boolean clientRole) {
    this.clientRole = clientRole;
  }

  public RoleRepresentation containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * Get containerId
   * @return containerId
   */
  
  @Schema(name = "containerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containerId")
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public RoleRepresentation attributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public RoleRepresentation putAttributesItem(String key, List<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public Map<String, List<String>> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, List<String>> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleRepresentation roleRepresentation = (RoleRepresentation) o;
    return Objects.equals(this.id, roleRepresentation.id) &&
        Objects.equals(this.name, roleRepresentation.name) &&
        Objects.equals(this.description, roleRepresentation.description) &&
        Objects.equals(this.scopeParamRequired, roleRepresentation.scopeParamRequired) &&
        Objects.equals(this.composite, roleRepresentation.composite) &&
        Objects.equals(this.composites, roleRepresentation.composites) &&
        Objects.equals(this.clientRole, roleRepresentation.clientRole) &&
        Objects.equals(this.containerId, roleRepresentation.containerId) &&
        Objects.equals(this.attributes, roleRepresentation.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, scopeParamRequired, composite, composites, clientRole, containerId, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleRepresentation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scopeParamRequired: ").append(toIndentedString(scopeParamRequired)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
    sb.append("    composites: ").append(toIndentedString(composites)).append("\n");
    sb.append("    clientRole: ").append(toIndentedString(clientRole)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

