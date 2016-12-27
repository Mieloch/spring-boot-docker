package com.echomil.test.folder.db;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "records")
@Data
public class Record {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "author", nullable = false)
  private String author;

  @Column(name = "time", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date timeStamp;
}
