package com.github.rsheremeta.testrail;

/*
This was done by Roman Sheremeta - https://github.com/RSheremeta
*/
public class TestRailCreds {
  private String
    projectUrl,
    username,
    password;

  public String getProjectUrl() {
    return projectUrl;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setProjectUrl(String projectUrl) {
    this.projectUrl = projectUrl;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public static class Builder {
    private TestRailCreds creds;

    public Builder() {
      creds = new TestRailCreds();
    }

    public Builder withProjectUrl(String projectUrl) {
      creds.setProjectUrl(projectUrl);
      return this;
    }

    public Builder withUsername(String username) {
      creds.setUsername(username);
      return this;
    }

    public Builder withPassword(String password) {
      creds.setPassword(password);
      return this;
    }

    public TestRailCreds build() {
      return creds;
    }
  }

}
