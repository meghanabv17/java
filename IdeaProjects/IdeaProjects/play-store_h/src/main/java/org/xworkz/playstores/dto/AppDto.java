package org.xworkz.playstores.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="app_store")

public class AppDto {

    @Id
    @Column(name="Id")
    private int id;

    @Column(name="version")
    private double version;

    @Column(name="downloads")
    private String downloads;

    @Column(name="releaseon")
    private String releaseOn;

    @Column(name="offoredby")
    private String offoredBy;

    @Column(name="downloadsize")
    private String downloadSize;
}
