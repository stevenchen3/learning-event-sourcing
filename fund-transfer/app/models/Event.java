package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "type", columnDefinition = "varchar(256)", nullable = false)
  private String type;

  @Column(name = "data", columnDefinition = "varchar(1024)", nullable = false)
  private String data;
  
  @Column(name = "timestamp", columnDefinition = "datetime")
  private Timestamp timestamp;

  public Event(String type, String data) {
    this.type = type;
    this.data = data;
  }

  public Long getId() {
    return this.id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }
  
  private void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof Event)) {
      return false;
    }
    Event other = (Event) obj;
    return this.id.equals(other.getId());
  }
  
  @PrePersist
  protected void onPrePersist() {
    this.setTimestamp(new Timestamp(System.currentTimeMillis()));
  }
}
