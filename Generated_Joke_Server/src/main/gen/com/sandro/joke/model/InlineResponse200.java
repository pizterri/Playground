package com.sandro.joke.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T23:30:59.386701200+01:00[Europe/Zurich]")

public class InlineResponse200  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("setup")
  private String setup;

  @JsonProperty("punchline")
  private String punchline;

  @JsonProperty("explanation")
  private String explanation;

  public InlineResponse200 id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "1", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineResponse200 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "general", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse200 setup(String setup) {
    this.setup = setup;
    return this;
  }

  /**
   * Get setup
   * @return setup
  */
  @ApiModelProperty(example = "What do you call a boomerang that won't come back?", value = "")


  public String getSetup() {
    return setup;
  }

  public void setSetup(String setup) {
    this.setup = setup;
  }

  public InlineResponse200 punchline(String punchline) {
    this.punchline = punchline;
    return this;
  }

  /**
   * Get punchline
   * @return punchline
  */
  @ApiModelProperty(example = "A Stick.", value = "")


  public String getPunchline() {
    return punchline;
  }

  public void setPunchline(String punchline) {
    this.punchline = punchline;
  }

  public InlineResponse200 explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Get explanation
   * @return explanation
  */
  @ApiModelProperty(example = "A joke is lame if I have to explain.", value = "")


  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.id, inlineResponse200.id) &&
        Objects.equals(this.type, inlineResponse200.type) &&
        Objects.equals(this.setup, inlineResponse200.setup) &&
        Objects.equals(this.punchline, inlineResponse200.punchline) &&
        Objects.equals(this.explanation, inlineResponse200.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, setup, punchline, explanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    punchline: ").append(toIndentedString(punchline)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

