package model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Table(name = "users", schema = "homestead", catalog = "")
public class Users implements Serializable {
  private int id;
  private String firstname;
  private String lastname;
  private String email;
  private Timestamp emailVerifiedAt;
  private String password;
  private String bio;
  private String apiToken;
  private String rememberToken;
  private Timestamp passwordChangedAt;
  private Timestamp createdAt;
  private Timestamp updatedAt;

  public Users(String firstname, String lastname, String email, String password, Timestamp passwordChangedAt) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.password = password;
    this.passwordChangedAt = passwordChangedAt;
  }

  @Id
//  @GeneratedValue
  @Column(name = "id")
  @GeneratedValue(generator = "ID_USER")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "firstname")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  @Basic
  @Column(name = "lastname")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Basic
  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Basic
  @Column(name = "email_verified_at")
  public Timestamp getEmailVerifiedAt() {
    return emailVerifiedAt;
  }

  public void setEmailVerifiedAt(Timestamp emailVerifiedAt) {
    this.emailVerifiedAt = emailVerifiedAt;
  }

  @Basic
  @Column(name = "password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Basic
  @Column(name = "bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  @Basic
  @Column(name = "api_token")
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }

  @Basic
  @Column(name = "remember_token")
  public String getRememberToken() {
    return rememberToken;
  }

  public void setRememberToken(String rememberToken) {
    this.rememberToken = rememberToken;
  }

  @Basic
  @Column(name = "password_changed_at")
  public Timestamp getPasswordChangedAt() {
    return passwordChangedAt;
  }

  public void setPasswordChangedAt(Timestamp passwordChangedAt) {
    this.passwordChangedAt = passwordChangedAt;
  }

  @Basic
  @Column(name = "created_at")
  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  @Basic
  @Column(name = "updated_at")
  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Users that = (Users) o;

    if (id != that.id) return false;
    if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
    if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    if (emailVerifiedAt != null ? !emailVerifiedAt.equals(that.emailVerifiedAt) : that.emailVerifiedAt != null)
      return false;
    if (password != null ? !password.equals(that.password) : that.password != null) return false;
    if (bio != null ? !bio.equals(that.bio) : that.bio != null) return false;
    if (apiToken != null ? !apiToken.equals(that.apiToken) : that.apiToken != null) return false;
    if (rememberToken != null ? !rememberToken.equals(that.rememberToken) : that.rememberToken != null) return false;
    if (passwordChangedAt != null ? !passwordChangedAt.equals(that.passwordChangedAt) : that.passwordChangedAt != null)
      return false;
    if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
    if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (emailVerifiedAt != null ? emailVerifiedAt.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
    result = 31 * result + (bio != null ? bio.hashCode() : 0);
    result = 31 * result + (apiToken != null ? apiToken.hashCode() : 0);
    result = 31 * result + (rememberToken != null ? rememberToken.hashCode() : 0);
    result = 31 * result + (passwordChangedAt != null ? passwordChangedAt.hashCode() : 0);
    result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
    result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
    return result;
  }
}
