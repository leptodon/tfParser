package model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Table(name = "projects", schema = "homestead", catalog = "")
public class Projects implements Serializable {
  private int id;
  private String title;
  private String description;
  private String text;
  @Enumerated(EnumType.STRING)
  private Status status;
  private int uId;
  private Timestamp createdAt;
  private Timestamp updatedAt;
  private Timestamp deletedAt;

  public Projects() {
  }


  @Id
  @Column(name = "id")
//  @GeneratedValue
  @GeneratedValue(generator = "ID_PROJECTS")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "user_id")
  public int getuId() {
    return uId;
  }

  public void setuId(int uId) {
    this.uId = uId;
  }

  @Basic
  @Column(name = "title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Basic
  @Column(name = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Basic
  @Column(name = "text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Basic
  @Column(name = "status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
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

  @Basic
  @Column(name = "deleted_at")
  public Timestamp getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Timestamp deletedAt) {
    this.deletedAt = deletedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Projects that = (Projects) o;

    if (id != that.id) return false;
    if (title != null ? !title.equals(that.title) : that.title != null) return false;
    if (description != null ? !description.equals(that.description) : that.description != null) return false;
    if (text != null ? !text.equals(that.text) : that.text != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
    if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
    if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (text != null ? text.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
    result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
    result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
    return result;
  }
}
